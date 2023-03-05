package com.xdt.springbootredis.Entry;

/**
 * @author XDT
 * @ClassName User
 * @Description: TODO
 * @Date 2023/3/5 11:44
 **/
public class User {
    private Long id;
    private String name;
    private String age;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
