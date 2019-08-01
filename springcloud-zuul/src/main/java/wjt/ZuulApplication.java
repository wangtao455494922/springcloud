package wjt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author wjt
 * @Description:
 * @date 2019/8/1 13:09
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication
{
    public static void main(String[] args){
        SpringApplication.run(ZuulApplication.class,args);
    }
}
