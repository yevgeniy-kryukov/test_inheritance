package org.ykryukov.inheritance;

class Dog extends Animal {
    Dog(String name, Double weight, Double height) {
        super(name, weight, height);
    }

    @Override
    String voice() {
        return "Гав!";
    }
}
