package com.cuisf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2  //开启swagger
public class SwaggerConfig {


    //作者的信息
    private static final Contact DEFAULT_CONTACT = new Contact("cuisf", "", "");

    private ApiInfo apiInfo(){
        return new ApiInfo(
                "swagger API document",
                "swagger-Api Documentation",
                "V1.0",
                "urn:tos",
                DEFAULT_CONTACT,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<VendorExtension>());
    }


    @Bean
    public Docket docket(){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())

                //配置多个组
                .groupName("A")
                .select()
                //  basePackage 指定需要扫描的包
                // any 全部扫描
                // none 不扫描

                .apis(RequestHandlerSelectors.basePackage("com.cuisf.controller"))
                // paths  过滤
                .paths(PathSelectors.ant("/**"))
                .build();
    }

    @Bean
    public Docket docket1(){

        return new Docket(DocumentationType.SWAGGER_2).groupName("B");
    }

    @Bean
    public Docket docket2(){

        return new Docket(DocumentationType.SWAGGER_2).groupName("C");
    }




}
