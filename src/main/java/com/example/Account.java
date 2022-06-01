package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if(name != null) {
            Pattern pattern = Pattern.compile("^(?=.{3,19}$)[A-Za-zА-я]+\\s[A-Za-zА-я]+$");
            Matcher matcher = pattern.matcher(name);
            return matcher.matches();
        }
        return false;
    }

}
