package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by jutsch on 8/8/16.
 */
public class Session {

    MessagePrinter messages = new MessagePrinter();
    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();


    public boolean status = true;

    public void quit(){
        status = false;
    }

    public void run(){

        while(session == true){

            menu.showOptions();
            if(menu.get(Integer.parseInt(scan.next()))){
                //forward
            }
            else{
                messages.invalidEntry();
            }
        }

    }
}
