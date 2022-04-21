package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan("com.*")
@EntityScan({"com.job_provider","com.registration","com.job_seeker"})
@EnableJpaRepositories("com.repository")
@EnableAutoConfiguration
public class JobPortalProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobPortalProjApplication.class, args);
	}

}
