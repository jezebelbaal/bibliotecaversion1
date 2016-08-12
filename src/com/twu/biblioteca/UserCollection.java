package com.twu.biblioteca;
import java.util.ArrayList;

/**
 * Created by jutsch on 8/11/16.
 */
public class UserCollection {


    private boolean session = false;
    private ArrayList<User> users = new ArrayList<User>();
    private User activeUser;

    public UserCollection() {

        User jullie = new User("78923-234", "p@ssw0rd!", "Jullie", "jutsch@thoughtworks.com", "991084388");
        users.add(jullie);

        User moz = new User("12345-678", "l1ghtTh@tN3v3rG0es0ut", "Morrissey", "moz@smiths.com", "55555555");
        users.add(moz);

    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public boolean isSession() {
        return session;
    }

    public void setSession(boolean session) {
        this.session = session;
    }

    public User credentials(String login, String password){
        for(int i = 0; i<users.size(); i++){
            if(users.get(i).getPassword() == password && users.get(i).getLogin() == login)
                activeUser = users.get(i);
                return activeUser;
        }
        return null;
    }

    public boolean logout(){
        try{
            setSession(false);
            activeUser = null;
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public User getActiveUser() {
        return activeUser;
    }


}
