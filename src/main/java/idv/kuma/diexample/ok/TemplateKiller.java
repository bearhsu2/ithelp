package idv.kuma.diexample.ok;

/**
 * Created by bearhsu2 on 12/28/2017.
 */
public abstract class TemplateKiller implements Killer{

    Weapon weapon;

    protected TemplateKiller(Weapon weapon){
        this.weapon = weapon;
    }

    protected void useWeapon(){
        this.weapon.act();
    }

    protected void tellJoke(){
        System.out.println("I will tell you a joke");
    }

    protected void clear(){
        System.out.println("I am cleaning. I am cleaning.");
    }

    protected void watch(){
        System.out.println("Shhh!!!! Watching...");
    }
}
