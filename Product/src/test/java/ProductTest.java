import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@DisplayName("Product Testing")

class ProductTest {
    
    @Test
    @DisplayName("Testing totalCost")
     public void totalCost() {
         final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Product itemBeingSold = new Product ("Basketball", 35.00, 8);
        System.out.print( "Total cost is $" + itemBeingSold.productCost * itemBeingSold.quantity);
        assertEquals( "Total cost is $280.0" , outContent.toString());
    }

    @Test
    @DisplayName("Testing that the printProduct method matches correct string")
     public void printProduct() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Product itemBeingSold = new Product ("Football", 25.00, 4);
        System.out.print(itemBeingSold.name + " costs $" + itemBeingSold.productCost + " and " + itemBeingSold.quantity + " units were purchased.");
        assertEquals( "Football costs $25.0 and 4 units were purchased." , outContent.toString());


    }

}