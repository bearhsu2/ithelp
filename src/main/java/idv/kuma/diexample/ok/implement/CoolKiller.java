package idv.kuma.diexample.ok.implement;

import idv.kuma.diexample.ok.TemplateKiller;
import idv.kuma.diexample.ok.Weapon;

/**
 * Created by bearhsu2 on 12/27/2017.
 */
public class CoolKiller extends TemplateKiller {

    public CoolKiller(Weapon weapon) {
        super(weapon);
    }

    public void kill() {
        useWeapon();
    }
}
