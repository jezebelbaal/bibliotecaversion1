//package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by jutsch on 8/8/16.
 */
public class MenuOptionsTest {

    @Test
    public void testsIfIsThereADefaultMenuOptionsList() throws Exception{

        Menu menu = new Menu();
        assertTrue(menu.defaultOptions.size()>0);
    }

    @Test
    public void testsIfIsThereABooksMenuOptionsList() throws Exception{

        Menu menu = new Menu();
        assertTrue(menu.bookOptions.size()>0);
    }
}