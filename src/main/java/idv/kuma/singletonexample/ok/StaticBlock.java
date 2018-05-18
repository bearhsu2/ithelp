package idv.kuma.singletonexample.ok;

/**
 * Created by bearhsu2 on 10/10/2016.
 */
// Static block initialization implementation is similar to eager initialization.

public class StaticBlock {

    private static StaticBlock instance;

    static {
        try{
            instance = new StaticBlock();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlock getInstance(){
        return instance;
    }

}
