package info.ziang.aop;

/**
 * 代理主体角色：内部包含对真实主体的引用，并且提供和真实主体相同的接口。
 */
public class TalkProxy implements ITalk {

    private ITalk talker;

    public TalkProxy(ITalk talker) {
        this.talker = talker;
    }

    public void talk(String msg) {
        this.talker.talk(msg);
    }

    public void talk(String msg, String song) {
        this.talker.talk(msg);
        this.sing(song);
    }

    private void sing(String song) {
        System.out.println("唱歌：" + song);
    }
}
