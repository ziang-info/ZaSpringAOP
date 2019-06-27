package info.ziang.aop;

/**
 * 代理测试类：使用代理 1. 静态代理：就是设计模式中的proxy模式
 */
public class ProxyPattern {

    public static void main(String[] args) {

        // 不需要执行额外方法的。
        ITalk peopleTalk = new PeopleTalk("AOP", 33);
        peopleTalk.talk("No Proxy Test!");

        System.out.println("-----------------------");

        // 需要执行额外方法的（切面）
        TalkProxy talkProxy = new TalkProxy(peopleTalk);
        talkProxy.talk("Proxy Test", "《代理》");
    }
}
