package wjt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import zam.RibbonConfig;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name ="SPRINGCLOUD-PROVIDER-PRODUCT",configuration = RibbonConfig.class)
public class ConsumerApplication
{
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}