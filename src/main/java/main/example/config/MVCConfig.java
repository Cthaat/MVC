package main.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Description: mvc
 * @ClassName: MVCConfig
 * @Author: Edge
 * @Date: 2024/8/3 13:19
 * @Version: 1.0
 */

@Configuration
@ComponentScan ("main.example.controller")
@EnableWebMvc
public class MVCConfig
{
}
