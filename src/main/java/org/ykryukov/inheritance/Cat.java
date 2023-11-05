package org.ykryukov.inheritance;

class Cat extends Animal {
    public Cat(String name, Double weight, Double height) {
        super(name, weight, height);
    }

    @Override
    String voice() {
        return "Мяу!";
    }
}
