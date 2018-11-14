package com.jnshutask.controller;

import com.jnshutask.controller.ControllerUtil.ResponseBo;
import com.jnshutask.pojo.TaLogin;
import com.jnshutask.service.TaLoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class OpenController {
    @Autowired
    private TaLoginService loginService;

    @ResponseBody
    @RequestMapping("/open")
    public ResponseBo homeLogin(String openid) {
        log.info("对应的poneId为：{}",openid);
        return ResponseBo.ok().put("请求成功;",openid);
    }
}
