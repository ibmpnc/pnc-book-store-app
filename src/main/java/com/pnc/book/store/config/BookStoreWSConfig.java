package com.pnc.book.store.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class BookStoreWSConfig {

	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context){
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(context);
		servlet.setTransformWsdlLocations(true);
		
		return new ServletRegistrationBean<MessageDispatcherServlet>(servlet, "/store/*");
	}
	
	@Bean(name = "bookStoreWsdl")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema) {
		
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setPortTypeName("BookStorePort");
		definition.setLocationUri("/store");
		definition.setTargetNamespace("http://www.pnc.com/book/store/app");
		definition.setSchema(schema);
		return definition;
	}
	
	@Bean
	public XsdSchema schema() {
		return new SimpleXsdSchema(new ClassPathResource("bookapp.xsd"));
	}
}
