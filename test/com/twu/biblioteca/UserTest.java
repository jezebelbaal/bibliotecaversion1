package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jutsch on 8/11/16.
 */
public class UserTest {

    User user = new User("78923-234", "p@ssw0rd!", "Jullie", "jutsch@thoughtworks.com", "991084388");

    @Test
    public void testIfUserisSet() throws Exception{
              assertEquals(user.getPassword(), "p@ssw0rd!");
    }

    @Test
    public void testIfUserHasSetData() throws Exception{
        assertEquals(user.getPassword(), "p@ssw0rd!");
    }


}
