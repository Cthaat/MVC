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
@RequestMapping ("/users")
public class userController
{
    @RequestMapping (method = RequestMethod.POST)
    @ResponseBody
    public String save()
    {
        System.out.println("save");
        return "save";
    }

    @RequestMapping (value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id)
    {
        System.out.println("delete " + id);
        return "delete " + id;
    }

    @RequestMapping (method = RequestMethod.PUT)
    public String put()
    {
        System.out.println("put");
        return "put";
    }

    @RequestMapping (value = "/{id}", method = RequestMethod.GET)
    public String select(@PathVariable Integer id)
    {
        System.out.println("get " + id);
        return "get " + id;
    }
}
