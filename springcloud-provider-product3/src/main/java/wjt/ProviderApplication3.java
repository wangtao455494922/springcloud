package wjt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("wjt.mapper")
@EnableEurekaClient
public class ProviderApplication3
{
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication3.class,args);
    }
}