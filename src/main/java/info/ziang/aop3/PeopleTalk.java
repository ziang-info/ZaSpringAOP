package info.ziang.aop3;


/**
 * 业务类
 */
public class PeopleTalk {

    private String name;
    private int age;

    public PeopleTalk() {
        this("Name-Default", 22);
    }

    public PeopleTalk(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void talk(String msg) {
        System.out.println("你好，我是" + name + "，我的年龄是" + age + "。");
    }
}