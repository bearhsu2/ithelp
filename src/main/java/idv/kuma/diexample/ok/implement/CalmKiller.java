package idv.kuma.diexample.ok.implement;

import idv.kuma.diexample.ok.TemplateKiller;
import idv.kuma.diexample.ok.Weapon;

/**
 * Created by bearhsu2 on 12/28/2017.
 */
public class CalmKiller extends TemplateKiller {
    protected CalmKiller(Weapon weapon) {
        super(weapon);
    }

    public void kill() {
        useWeapon();
        clear();
    }
}
