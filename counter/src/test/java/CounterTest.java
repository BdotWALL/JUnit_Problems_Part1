import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Counter Testing")

class CounterTest {

    @Test
    @DisplayName("Test to see if counter decreases by 1")
     public void decrease() {
        Counter counter = new Counter(20);
        assertEquals(19, counter.decrease());
    }

    @Test
    @DisplayName("Test to see if counter increases by 1")
     public void increase() {
        Counter counter = new Counter(10);
        assertEquals(9, counter.decrease());
    }

    @Test
    @DisplayName("Test to see if counter increases by specified number")
     public void increaseBy(){
        Counter counter = new Counter(10);
        assertEquals(12, counter.increase(2));


    }

    @Test
    @DisplayName("Test to see if counter decreases by specified number")
     public void decreaseBy(){
        Counter counter = new Counter(10);
        assertEquals(8, counter.decrease(2));


    }


}
    

