package com.haus.business;


import com.haus.domain.Owner;
import com.haus.interfaces.IRentProperty;

public class RentProperty implements IRentProperty {
    
    public int rentProperty(Owner o) {
        System.out.println("Hi");
        return 1;
    }
}
