package com.example;

import java.util.regex.Pattern;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        return name != null && !Pattern.compile("^ | $|  +?| .* +?|.{20,}").matcher(name).find() && Pattern.compile(".{3,}").matcher(name).find();
    }

}
