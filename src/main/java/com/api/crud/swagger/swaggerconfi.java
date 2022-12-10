package com.api.crud.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class swaggerconfi {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.api.crud.controller"))
				.paths(PathSelectors.regex("/.*")).build().apiInfo(apiendpointdetails());
		
	}
	
	private ApiInfo apiendpointdetails() {
		
		return new ApiInfoBuilder().title("Staff Management Rest API").description("API Information about staff details").
		contact(new Contact("Trio","www.w3.org/Provider/Style/dummy.html" ,"triotend@gmail.com")).version("TTS-7.3.3")
		.license("7.3.5").build();
		
	}
}
