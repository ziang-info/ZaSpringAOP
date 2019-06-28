package info.ziang.aop2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 * <p>
 * 动态代理：jdk1.5中提供，利用反射。实现InvocationHandler接口。
 */
public class DynamicProxy implements InvocationHandler {

    /**
     * 需要代理的目标
     */
    private Object target;

    /**
     * 写法固定，AOP专用：绑定委托对象，并返回一个代理类
     *
     * @param target delegate
     * @return
     */
    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    /**
     *
     * @param proxy
     *      target: 指被代理的对象
     * @param method    需要调用的方法
     * @param args  方法调用时所需要的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result =null;

        System.out.println("切面之前执行。");
        result = method.invoke(args);
        System.out.println("切面之后执行。");
        return null;
    }
}
