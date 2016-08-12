package com.twu.biblioteca;

/**
 * Created by jutsch on 8/11/16.
 */
public abstract class Media {

    private String title;
    private int year;
    private User rentUser;

    private int id;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public User getRentUser() {
        return this.rentUser;
    }

    public void setRentUser(User rentUser) {
        this.rentUser = rentUser;
    }

    public boolean isAvailable(){
        if(this.rentUser !=null){
            return false;
        }else{
            return true;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
