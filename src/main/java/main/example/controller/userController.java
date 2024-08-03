package main.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping (value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id)
    {
        System.out.println("delete " + id);
        return "delete " + id;
    }

    @RequestMapping (value = "/users", method = RequestMethod.PUT)
    @ResponseBody
    public String put()
    {
        System.out.println("put");
        return "put";
    }

    @RequestMapping (value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String select(@PathVariable Integer id)
    {
        System.out.println("put");
        return "put";
    }
}
