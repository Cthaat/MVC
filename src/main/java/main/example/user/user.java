package main.example.user;

/**
 * @Description: user
 * @ClassName: user
 * @Author: Edge
 * @Date: 2024/8/3 16:52
 * @Version: 1.0
 */
public class user
{
    private String name;
    private int age;

    public user(String name , int age)
    {
        this.name = name;
        this.age = age;
    }

    public user()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
