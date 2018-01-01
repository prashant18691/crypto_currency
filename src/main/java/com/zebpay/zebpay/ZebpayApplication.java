package com.zebpay.zebpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.zebpay.service"
})
//@EnableScheduling
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) //include when 'spring.datasource.url=jdbc:postgresql://my_url:my_port/my_other_stuff' is not set
public class ZebpayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZebpayApplication.class, args);
	}
}
