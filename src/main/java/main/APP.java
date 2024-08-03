package main;

import main.example.config.springConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: app
 * @ClassName: APP
 * @Author: Edge
 * @Date: 2024/8/3 13:48
 * @Version: 1.0
 */
public class APP
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(springConfig.class);
    }
}
