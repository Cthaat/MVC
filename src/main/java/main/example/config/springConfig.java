package main.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: spring
 * @ClassName: springConfig
 * @Author: Edge
 * @Date: 2024/8/3 13:30
 * @Version: 1.0
 */

@Configuration
@ComponentScan ({"main.example.service" , "main.example.dao"})
public class springConfig
{
}
