package main.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: user
 * @ClassName: userController
 * @Author: Edge
 * @Date: 2024/8/3 13:17
 * @Version: 1.0
 */

@Controller
public class userController
{
    @RequestMapping (value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public String save()
    {
        System.out.println("save");
        return "save";
    }

}
