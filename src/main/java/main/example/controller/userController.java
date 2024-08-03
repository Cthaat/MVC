package main.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: user
 * @ClassName: userController
 * @Author: Edge
 * @Date: 2024/8/3 13:17
 * @Version: 1.0
 */

@Controller
@RequestMapping ("/user")
public class userController
{
    @RequestMapping ("/login")
    @ResponseBody
    public String login()
    {
        System.out.println("login");
        return "login";
    }

    @RequestMapping ("/getName")
    @ResponseBody
    public String getName(@RequestParam ("name") String name)
    {
        System.out.println(name);
        return "{'success':true} , 'data':'" + name + "'";
    }
}
