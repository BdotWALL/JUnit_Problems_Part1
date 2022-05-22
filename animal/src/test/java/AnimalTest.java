import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Animal Testing")

class AnimalTest {

    @Test
    @DisplayName("Test the get name method")
     public void getName() {
        Animal animal = new Animal("Hunter");
        assertEquals("Hunter", animal.getName());
    }


    @Test 
    @DisplayName("Test the dog or not method") 
    public void getDogOrNot() {
        Animal animal = new Animal("Hunter", "yes");
        Animal animal2 = new Animal("Hunter2", "no");
        assertTrue(animal.getDogOrNot(), "This is not a dog.");
        assertFalse(animal2.getDogOrNot(), "This is a dog");
    
    
    }
}

