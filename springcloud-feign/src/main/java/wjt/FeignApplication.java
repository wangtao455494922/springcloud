package wjt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("wjt.service")
public class FeignApplication
{
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}