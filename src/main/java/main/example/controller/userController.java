package main.example.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Description: user
 * @ClassName: userController
 * @Author: Edge
 * @Date: 2024/8/3 13:17
 * @Version: 1.0
 */

@RestController
@RequestMapping ("/users")
public class userController
{
    @PostMapping
    public String save()
    {
        System.out.println("save");
        return "save";
    }

    @DeleteMapping
    public String delete(@PathVariable Integer id)
    {
        System.out.println("delete " + id);
        return "delete " + id;
    }

    @PutMapping (method = RequestMethod.PUT)
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
