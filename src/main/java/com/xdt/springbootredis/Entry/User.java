package com.xdt.springbootredis.Entry;
import java.io.Serializable;

/**
 * @author XDT
 * @ClassName User
 * @Description: TODO
 * @Date 2023/3/5 11:44
 **/
/*序列化接口*/
public class User implements Serializable {
    private Long id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
