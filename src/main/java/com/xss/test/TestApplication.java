package com.xss.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}


//select * from user_session u INNER JOIN  user_provider p on u.user_id=p.user_id where status = 'finished' and u.cdate = '2022-05-23 06:10:55.651'