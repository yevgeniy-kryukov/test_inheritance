package org.ykryukov.inheritance;

abstract class Animal {
    static private Integer animalCount = 0;
    private final String name;
    private final Double weight;
    private final Double height;

    Animal(String name, Double weight, Double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        animalCount++;
    }

    static Integer getAnimalCount() {
        return animalCount;
    }

    abstract String voice();

    String getName() {
        return name;
    }

    Double getWeight() {
        return weight;
    }

    Double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;

        Animal animal = (Animal) o;

        return name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
