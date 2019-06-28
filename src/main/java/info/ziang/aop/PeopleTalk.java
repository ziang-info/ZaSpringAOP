package info.ziang.aop;

import info.ziang.aop.ITalk;

/**
 * 真实主体角色：定义真实的对象
 */
public class PeopleTalk implements ITalk {

    private String name;
    private int age;

    public PeopleTalk(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void talk(String msg) {
        System.out.println("你好，我是" + name + "，我的年龄是" + age + "。" + msg);
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