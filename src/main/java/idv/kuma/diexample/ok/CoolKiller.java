package idv.kuma.diexample.ok;

/**
 * Created by bearhsu2 on 12/27/2017.
 */
public class CoolKiller implements Killer{
    Weapon weapon;

    public CoolKiller(Weapon weapon){
        this.weapon = weapon;
    }

    public void kill() {
        weapon.act();
    }
}
