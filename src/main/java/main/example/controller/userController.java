package main.example.controller;

import main.example.user.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @RequestMapping ("/likes")
    @ResponseBody
    public String likes(@RequestBody List<String> likes)
    {
        System.out.println(likes);
        return "{'success':true} , 'data':'" + likes + "'";
    }

    @RequestMapping ("/getUser")
    @ResponseBody
    public user getUser()
    {
        user user = new user();
        user.setName("Edge");
        user.setAge(25);
        return user;
    }
}
