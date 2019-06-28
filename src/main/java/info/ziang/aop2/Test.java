package info.ziang.aop2;

import info.ziang.aop.ITalk;
import info.ziang.aop.PeopleTalk;

public class Test {
    public  static void main(String[] args){

        // 绑定代理，这种方式会在所有方法上都添加切面方法
        ITalk iTalk = (ITalk) new DynamicProxy().bind(new PeopleTalk("AOP", 22));
        iTalk.talk("业务说明");
    }
}
