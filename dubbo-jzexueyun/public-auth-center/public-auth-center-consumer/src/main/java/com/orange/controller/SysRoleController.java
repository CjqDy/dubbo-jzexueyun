package com.orange.controller;

import com.orange.auth.service.SysRoleService;
import com.orange.common.contants.GeneralConstant;
import com.orange.common.enums.ReturnMsgEnum;
import com.orange.common.response.RequestMsg;
import com.orange.common.response.ResponseMsg;
import com.orange.common.util.JsonUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: dubbo-jzexueyun
 * @description: SysRoleController
 * @author: chengjiaqi
 * @create: 2019/04/26 10:42
 **/
@RestController
@RequestMapping("/sysrole")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;

    /**
     * 获得角色，并获得角色拥有的菜单.（用于更新角色页面和角色详情页面）
     *
     * @param userId the user id
     * @return the sys role
     * @throws Exception the exception
     */
    @ResponseBody
    @RequestMapping(value = "/getSysRole", method = RequestMethod.POST)
    public ResponseMsg getSysRole(@RequestHeader(GeneralConstant.HEADER_NAME_UID) String userId,
                                  @RequestBody RequestMsg requestMsg) throws Exception {
        System.out.println("userId = " + userId);
        JSONObject json = JSONObject.fromObject(requestMsg.getRoot());
        return new ResponseMsg(requestMsg.getRoute(), GeneralConstant.SUCCESS, ReturnMsgEnum.SUCCESS.getMsg(),
                sysRoleService.selectByExample());
    }

}
