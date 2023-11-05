package org.ykryukov.inheritance;

class Cow extends Animal {
    private final Double milkRelease;

    Cow(String name, Double weight, Double height, Double milkRelease) {
        super(name, weight, height);
        this.milkRelease = milkRelease;
    }

    @Override
    String voice() {
        return "Муу!";
    }

    Double getMilkRelease() {
        return milkRelease;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name=" + getName() + "," +
                "weight=" + getWeight() + "," +
                "height=" + getHeight() + "," +
                "milkRelease=" + milkRelease +
                '}';
    }
}
