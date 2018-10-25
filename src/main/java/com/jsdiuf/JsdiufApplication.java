package com.jsdiuf;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author weicc
 */

@SpringBootApplication
public class JsdiufApplication {

    public static void main(String[] args) {
        //SpringApplication.run(JsdiufApplication.class, args);

        //

        SpringApplication sa=new SpringApplication(JsdiufApplication.class);
        sa.setBannerMode(Banner.Mode.OFF);
        sa.run(args);
    }
}
