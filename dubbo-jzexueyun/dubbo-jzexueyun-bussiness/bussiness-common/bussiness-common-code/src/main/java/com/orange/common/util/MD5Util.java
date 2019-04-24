package com.orange.common.util;

import org.springframework.util.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * @author Administrator
 * Created by gang.shen on 2017/4/25.
 */
public class MD5Util {
    private static final String SLAT = "gfhfghdfsdgdfgsdgh5rtyhgfhgfhyty@$%@$%^";

    private static final String CHARSET = "utf-8";
    private static final int SIX = 6;
    private static DecimalFormat df6 = new DecimalFormat("000000");
    
    public static String getMD5(long seckillId) {
        String base = seckillId + "/" + SLAT;
        return DigestUtils.md5DigestAsHex(base.getBytes());
    }

    private MD5Util() {
    }
    
    public static String MD5Encode(String sourceStr) {
        String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sourceStr.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0){
                    i += 256;
                }
                if (i < 16){
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
            result = buf.toString();
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
        return result;
    }
    
    /**
     * 签名字符串
     *
     * @param text 需要签名的字符串
     * @return 签名结果
     */
    public static String sign(String text) {
      return DigestUtils.md5DigestAsHex(getContentBytes(text, CHARSET));
    }

    /**
     * 签名字符串
     *
     * @param text 需要签名的字符串
     * @param sign 签名结果
     * @return 签名结果
     */
    public static boolean verify(String text, String sign) {
      String mySign = DigestUtils.md5DigestAsHex(getContentBytes(text, CHARSET));
      if (mySign.equals(sign)) {
        return true;
      } else {
        return false;
      }
    }

    /**
     * @param content
     * @param charset
     * @return
     * @throws UnsupportedEncodingException
     */
    private static byte[] getContentBytes(String content, String charset) {
      if (charset == null || "".equals(charset)) {
        return content.getBytes();
      }
      try {
        return content.getBytes(charset);
      } catch (UnsupportedEncodingException e) {
        throw new RuntimeException("MD5签名过程中出现错误,指定的编码集不对,您目前指定的编码集是:" + charset);
      }
    }

    private static Random rand = new Random();
    public static String getSixRandomNo() {

      int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
      for (int i = array.length; i > 1; i--) {
        int index = rand.nextInt(i);
        int tmp = array[index];
        array[index] = array[i - 1];
        array[i - 1] = tmp;
      }
      int result = 0;
      for (int i = 0; i < SIX; i++) {
        result = result * 10 + array[i];
      }
      return df6.format(result);
    }

    public static void main(String[] args) {
      String a = sign("exueyunServ20180518125812ui231h");
      System.out.println(a);
      System.out.println(a.length());
      System.out
          .println(verify("exueyunServ20180518125812ui231h", "0d233547f500159c850f132a848c7771"));

      for ( int i=0;i<100;i++){
        System.out.println(getSixRandomNo());
      }
    }
}
