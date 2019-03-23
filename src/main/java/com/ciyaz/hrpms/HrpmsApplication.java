package com.ciyaz.hrpms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author CiyaZ
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ciyaz.hrpms.mapper")
public class HrpmsApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(HrpmsApplication.class, args);
	}

}
