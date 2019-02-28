package com.example.rxjava.List;

import java.util.List;

public class User {

    public String userName;
    public List<Address> addresses;

    public static class Address{

        public String street;
        public String city;
    }
}
