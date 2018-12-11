package com.training.spring.config;

import java.math.BigInteger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.spring.bean.StudentInfo;
import com.training.spring.producer.HTMLInformationProducer;
import com.training.spring.producer.InformationProducer;
import com.training.spring.sender.InformationSender;

@Configuration
public class AppConfig {

	@Bean
	public InformationProducer informationProducer() {
		return new HTMLInformationProducer();
	}
	
	@Bean
	public StudentInfo studentInfo() {
		StudentInfo info = new StudentInfo();
		info.setName("Kunal Kishor");
		info.setBranch("Computer Science and Engineering" );
		info.setMobileNo(new BigInteger("12345678"));
		info.setEmailId("kunal@gmail.com");
		info.setRollNo(56);
		return info;
	}
	
	@Bean
	public InformationSender informationSender() {
		return new InformationSender();
	}
	
}
