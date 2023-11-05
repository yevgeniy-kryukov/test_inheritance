package org.ykryukov.inheritance;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @BeforeAll
    public static void setUp() throws Exception {
    }

    @Test
    public void catVoiceTest() {
        final Animal barsik = new Cat("Барсик", 5.0, 25.0);
        assertEquals(barsik.voice(), "Мяу!");
    }


    @Test
    public void dogVoiceTest() {
        final Animal reks = new Dog("Рекс", 30.0, 50.0);
        assertEquals(reks.voice(), "Гав!");
    }

    @Test
    public void cowVoiceTest() {
        final Animal masha = new Cow("Маша", 200.0, 150.0, 17.5);
        assertEquals(masha.voice(), "Муу!");
    }

    @AfterAll
    public static void getAnimalCountTest() throws Exception {
        assertEquals(Animal.getAnimalCount(), 3);
    }
}