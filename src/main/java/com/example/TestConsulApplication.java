package com.example;

//import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class TestConsulApplication {

    @Autowired
    private Environment env;

    @RequestMapping("/")
    public String home() {

        return env.getProperty("key1");
    }

	public static void main(String[] args) {
		//SpringApplication.run(TestConsulApplication.class, args);
        new SpringApplicationBuilder(TestConsulApplication.class)
                .web(true)
                .run(args);
	}
}
