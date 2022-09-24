package com.htc.hippo4j;

import cn.hippo4j.core.enable.EnableDynamicThreadPool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author hutingcong
 * date 2022-09-24
 */
@EnableDynamicThreadPool
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ApplicationService {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationService.class, args);
    }
}
