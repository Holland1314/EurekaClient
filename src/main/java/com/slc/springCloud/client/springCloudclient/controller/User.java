package com.slc.springCloud.client.springCloudclient.controller;

import org.jboss.logging.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by shileichao on 2018/5/30.
 */
@RestController
public class User {
    @GetMapping("/user/findById")
    public String findById(@RequestParam("id") String id)throws Exception {
      /*  int i = new Random().nextInt(3000);
        System.out.println("client线程休眠时间："+i);
        Thread.sleep(i);*/
        System.out.println("这个是springcloud的客户端1----" + id);
        return "这个是springcloud的客户端1----" + id;
    }

}
