package info.ziang.aop3;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {

        // 绑定代理，这种方式会在所有方法上都添加切面方法
        PeopleTalk peopleTalk = (PeopleTalk) new CglibProxy().getInstance(new PeopleTalk());
        peopleTalk.talk("业务方法");
        //peopleTalk.spreak("业务方法");
    }
}
