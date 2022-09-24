package com.htc.hippo4j.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author hutingcong
 * date 2022-09-23
 */
@RequestMapping("/demo")
@RestController
public class DemoApi {

    @Resource
    private ThreadPoolExecutor messageConsumeDynamicExecutor;


    @Resource
    private ThreadPoolExecutor messageProduceDynamicExecutor;

    @GetMapping("/get")
    public String get(String id) {
        messageConsumeDynamicExecutor.execute(() -> {
            System.out.println("consumer");
        });
        messageProduceDynamicExecutor.execute(() -> {
            System.out.println("produce");
        });

        return id;
    }
}
