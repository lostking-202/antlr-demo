package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket buildDocket() {

    return new Docket(DocumentationType.SWAGGER_2)
            // .host("127.0.0.1:8080") //设置ip和端口，或者域名
            .select() // 启动用于api选择的生成器
            // .apis(RequestHandlerSelectors.any())//Predicate<RequestHandler>
            .apis(
                    RequestHandlerSelectors.basePackage(
                            "com.example.demo.controller")) // 指定controller路径
            .paths(PathSelectors.any())
            .build()
            .apiInfo(buildApiInf()) // 将api的元信息设置为包含在json resource listing响应中
            .groupName("正式接口");
  }

  private ApiInfo buildApiInf() {
    return new ApiInfoBuilder()
            .title("HypeCycle 后端应用 API 文档（仅供内部使用）") // 文档标题
            .description("HypeCycle 后端应用 Restful Api 文档") // 文档描述
            .version("1.0") // 版本号
            // .license("")//更新此API的许可证信息
            // .licenseUrl("")//更新此API的许可证Url
            // .termsOfServiceUrl("")//更新服务条款URL
            .build();
  }
}
