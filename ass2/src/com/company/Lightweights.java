package com.company;

import java.util.List;

public class Lightweights implements UFC {

    private String name;

    public Lightweights(String name){
        this.name = name;
    }

    @Override
    public void update(List<String> rankings) {
        System.out.println("Hey "+this.name+"\n The rankings have been changed!:\n" + rankings +"\n");
    }
}
