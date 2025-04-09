package TP0test.Exo1;


import static org.junit.jupiter.api.Assertions.*;

import TP0.Exo1.Person;
import org.junit.jupiter.api.Test;

public class PersinTest {

    @Test
    void testGetFullName() {

        Person person = new Person("LAHGUI", "RAYENE", 30);


        String fullName = person.getFullName();


        assertEquals("LAHGUI RAYENE", fullName, "Le nom complet doit être 'LAHGUI RAYENE'");
    }

    @Test
    void testIsAdult() {
        // Cas d'une personne majeure
        Person adult = new Person("LAHGUI", "RAYENE", 20);
        // Cas d'une personne mineure
        Person minor = new Person("MAHMOUD", "MOULOUD", 16);

        // Vérifier que la méthode isAdult retourne true pour une personne majeure
        assertTrue(adult.isAdult(), "LAHGUI RAYENE doit être considéré comme adulte");

        // Vérifier que la méthode isAdult retourne false pour une personne mineure
        assertFalse(minor.isAdult(), "MAHMOUD MOULOUD ne doit pas être considéré comme adulte");
    }

}