package com.orange.common.cache.redis;



import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.Cache;
import org.springframework.data.redis.cache.RedisCache;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCachePrefix;
import org.springframework.data.redis.core.RedisOperations;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Pattern;

/**
 * @program: dubbo-jzexueyun
 * @description:CustomizedRedisCacheManager 扩展 RedisCacheManager 增肌自定义缓存时间
 * @author: chengjiaqi
 * @create: 2019/04/10 17:16
 **/
public class CustomizedRedisCacheManager  extends RedisCacheManager {


	private static final Logger logger = LoggerFactory.getLogger(CustomizedRedisCacheManager.class);
	
    private static final ScriptEngine SCRIPT_ENGINE = new ScriptEngineManager().getEngineByName("JavaScript");


    private static final Pattern PATTERN = Pattern.compile("[+\\-*/%]");


    private String defaultCacheName;


    private char separator = '#';

    @SuppressWarnings("rawtypes")
    public CustomizedRedisCacheManager( RedisOperations redisOperations) {
        this(redisOperations, Collections.<String>emptyList());
    }

    @SuppressWarnings("rawtypes")
    public CustomizedRedisCacheManager(RedisOperations redisOperations, Collection<String> cacheNames) {
        super(redisOperations, cacheNames);
    }


    @SuppressWarnings("unchecked")
	@Override
    public Cache getCache(String name) {
    	
    	RedisCache cache = (RedisCache) super.getCache(name);
    	
        // there's no cache which has given name
        // find separator in cache name
        int index = name.lastIndexOf(getSeparator());
        if ( index < 0 ) {
        	
            return cache != null ? cache : null;
        }

        // split name by the separator
        String cacheName = name.substring(0, index);
        if(StringUtils.isBlank(cacheName)){
            cacheName = defaultCacheName;
        }
        cache = (RedisCache) super.getCache(cacheName);
        if (cache == null) {
            return null;
        }


        // get expiration from name
        Long expiration = getExpiration(name, index);
        if (expiration == null || expiration < 0) {
            logger.warn("Default expiration time will be used for cache '{}' because cannot parse '{}', cacheName : " + cacheName + ", name : " + name);
            return cache;
        }

        return new RedisCache(cacheName, (isUsePrefix() ? getCachePrefix().prefix(cacheName) : null), getRedisOperations(), expiration);
    }


    public char getSeparator() {
        return separator;
    }


    /**
     * Char that separates cache name and expiration time, default: #.
     *
     * @param separator
     */
    public void setSeparator(char separator) {
        this.separator = separator;
    }


    private Long getExpiration(final String name, final int separatorIndex) {
        Long expiration = null;
        String expirationAsString = name.substring(separatorIndex + 1);
        try {
            // calculate expiration, support arithmetic expressions.
            if(PATTERN.matcher(expirationAsString).find()){
                expiration = (long) Double.parseDouble(SCRIPT_ENGINE.eval(expirationAsString).toString());
            }else{
                expiration = Long.parseLong(expirationAsString);
            }
        } catch (NumberFormatException ex) {
            logger.info(String.format("Cannnot separate expiration time from cache: '%s'", name), ex);
        } catch (ScriptException e) {
            logger.info(String.format("Cannnot separate expiration time from cache: '%s'", name), e);
        }


        return expiration;
    }


    @Override
    public void setUsePrefix(boolean usePrefix) {
        super.setUsePrefix(usePrefix);
    }


    @Override
    public void setCachePrefix(RedisCachePrefix cachePrefix) {
        super.setCachePrefix(cachePrefix);
    }


    public void setDefaultCacheName(String defaultCacheName) {
        this.defaultCacheName = defaultCacheName;
    }


}
