package main.example.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @Description: config
 * @ClassName: servletContainersInitConfig
 * @Author: Edge
 * @Date: 2024/8/3 13:20
 * @Version: 1.0
 */
public class servletContainersInitConfig extends AbstractDispatcherServletInitializer
{
    @Override
    protected WebApplicationContext createServletApplicationContext()
    {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(MVCConfig.class);
        return context;
    }

    @Override
    protected String[] getServletMappings()
    {
        return new String[]{"/"};
    }

    @Override
    protected WebApplicationContext createRootApplicationContext()
    {
        return null;
    }
}
