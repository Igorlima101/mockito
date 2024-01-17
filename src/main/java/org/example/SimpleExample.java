package org.example;

import java.util.ArrayList;
import java.util.List;

public class SimpleExample {

    private String name;
    private List<String> list = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleExample(String name) {
        this.name = name;
    }

    public SimpleExample() {
    }

    public void addName(String name){
        this.list.add(name);
    }
}
