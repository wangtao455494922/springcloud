package wjt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import wjt.filter.AuthorizedRequestFilter;

/**
 * @author wjt
 * @Description:
 * @date 2019/8/1 15:21
 */
@Configuration
public class ZuulConfig
{
    @Bean
    public AuthorizedRequestFilter getAuthorizedRequestFilter() {
        return new AuthorizedRequestFilter() ;
    }
}
