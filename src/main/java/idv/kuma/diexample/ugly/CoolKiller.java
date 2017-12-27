package idv.kuma.diexample.ugly;

/**
 * Created by bearhsu2 on 12/27/2017.
 */
public class CoolKiller {
    Gun weapen;

    public CoolKiller(){
        weapen = new Gun();
    }
    public void kill(){
        weapen.act();
    }
}
