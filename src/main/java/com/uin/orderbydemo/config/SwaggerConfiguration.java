package com.uin.orderbydemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {
    @Configuration
    public class SwaggerConfig {
        @Bean
        public Docket desertsApi() {
            return new Docket(DocumentationType.OAS_30)
                    .apiInfo(apiInfo())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.uin.orderbydemo.controller"))
                    .paths(PathSelectors.any())
                    .build()
                    .groupName("iking")
                    .enable(true);
        }

        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    .title("Swagger3测试文档")
                    .description("文档描述信息")
                    .contact(new Contact("uin", "#", "2686221966@qq.com"))
                    .version("1.0")
                    .build();
        }
    }
}
