package me.maweiyi.spear;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("me.maweiyi.spear.mapper")
public class SpearApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpearApplication.class, args);
	}
}
