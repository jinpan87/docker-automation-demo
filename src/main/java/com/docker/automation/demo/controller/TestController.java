package com.docker.automation.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linzf
 * @since 2019/5/28
 * 类描述：
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    /**
     * 功能描述：实现消息的发送
     *
     * @param msg 前端发送的消息
     * @return 返回结果
     */
    @GetMapping("sendMsg")
    public String sendMsg(@RequestParam("msg") String msg) {
        logger.debug("收到请求过来的消息：{}", msg);
        return msg;
    }

}
