package wjt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("wjt.mapper")
public class ProviderApplication
{
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}