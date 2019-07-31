package zam;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

/**
 * @author wjt
 * @Description: 单独路由配置类
 * @date 2019/7/30 14:34
 *
 *
 *
 * 注:该文件夹不可被Application类扫描到
 *
 *
 */
public class RibbonConfig
{

    @Bean
    public IRule ribbonRule(){
         return  new com.netflix.loadbalancer.RandomRule(); //随机,默认是轮训
    }

}
