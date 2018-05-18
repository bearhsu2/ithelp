package idv.kuma.diexample.ok.implement;

import idv.kuma.diexample.ok.TemplateKiller;
import idv.kuma.diexample.ok.Weapon;

/**
 * Created by bearhsu2 on 12/28/2017.
 */
public class FunnyKiller extends TemplateKiller {
    protected FunnyKiller(Weapon weapon) {
        super(weapon);
    }

    public void kill() {
        tellJoke();
    }
}
