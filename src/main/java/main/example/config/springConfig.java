package main.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @Description: spring
 * @ClassName: springConfig
 * @Author: Edge
 * @Date: 2024/8/3 13:30
 * @Version: 1.0
 */

@Configuration
@ComponentScan (value = "main.example",
        excludeFilters = @ComponentScan.Filter (
                type = FilterType.ANNOTATION,
                classes = Controller.class
        )
)
public class springConfig
{
}
