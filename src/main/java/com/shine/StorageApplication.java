package com.shine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ProjectName: StorageMVN
 * @Package: com.shine
 * @Description:
 * @Author: yangxiaoguang
 * @CreateDate: 2018/7/22 21:39
 */
@SpringBootApplication
@EnableSwagger2
public class StorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageApplication.class, args);
    }
}
