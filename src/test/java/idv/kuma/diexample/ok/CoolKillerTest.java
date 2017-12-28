package idv.kuma.diexample.ok;

import idv.kuma.diexample.ok.implement.CoolKiller;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by bearhsu2 on 12/27/2017.
 */
public class CoolKillerTest {

    @Test
    public void kill() throws Exception {
        Weapon mockedWeapon = Mockito.mock(Weapon.class);
        CoolKiller coolKiller = new CoolKiller(mockedWeapon);

        coolKiller.kill();
        verify(mockedWeapon, times(1)).act();
    }

}