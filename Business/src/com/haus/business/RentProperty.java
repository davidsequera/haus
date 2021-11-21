package com.haus.business;


import com.haus.domain.Owner;
import com.haus.interfaces.IRentProperty;

public class RentProperty implements IRentProperty {

    public void printRent(String s) {
        System.out.println(s);
    }
    public int rentProperty(Owner o) {
        System.out.println("Hi");
        return 1;
    }
}
