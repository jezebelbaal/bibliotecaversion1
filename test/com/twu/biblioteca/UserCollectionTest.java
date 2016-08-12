package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jutsch on 8/11/16.
 */
public class UserCollectionTest {

    UserCollection userCollection = new UserCollection();

    @Test
    public void testIfThereIsAListOfUsers() throws Exception{
        assertTrue(userCollection.getUsers().size()>0);
    }

    @Test
    public void shouldReturnAListSizeBiggerThan2() throws Exception{
        assertTrue(userCollection.getUsers().size()>1);
    }

    @Test
    public void shouldReturnUserObjIfJullieLoginWorks()throws Exception{
        assertNotNull(userCollection.credentials("78923-234", "p@ssw0rd!"));
        userCollection.logout();
    }

    @Test
    public void shouldSetCurrentUserOnSuccessfulLogin()throws Exception{
        userCollection.credentials("78923-234", "p@ssw0rd!");
        assertNotNull(userCollection.getActiveUser());
        userCollection.logout();
    }

    @Test
    public void shouldReturnNullWithWrongLoginAtCredentials() throws Exception{
        assertNull(userCollection.credentials("78923-09234", "p@ssw0rd!"));
        userCollection.logout();
    }

    @Test
    public void shouldReturnNullWithWrongPasswordAtCredentials() throws Exception{
        assertNull(userCollection.credentials("78923-234", "passw0rd!"));
        userCollection.logout();
    }

    public void shouldSetActiveUserNullAndSetSessionFalseOnLogout() throws Exception{
        assertNotNull(userCollection.credentials("", "p@ssw0rd!"));
        userCollection.logout();
        assertNull(userCollection.getActiveUser());
        assertFalse(userCollection.isSession());
    }
}
