package com.jbkTest;

public class Person implements Task {

    String name;

    public void doSomeThing() {
        System.out.println(this.name+"欧阳娜娜我爱你");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
