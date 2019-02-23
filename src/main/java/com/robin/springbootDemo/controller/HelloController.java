package com.robin.springbootDemo.controller;

import com.robin.springbootDemo.domain.Phone;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qukoucai001 on 2019/2/23.
 */
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello(){
        Phone phone=new Phone();
              phone.setId(1L);
              phone.setPrice(8848.88);
              phone.setDesc("A phone which is very NB!");
        return phone.toString();
    }
}
