package idv.kuma.diexample.ok;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
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