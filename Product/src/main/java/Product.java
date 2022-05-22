
public class Product {
    double productCost;
    int quantity;
    String name;

//Constructor with name, cost, and quantity as parameter
      public Product(String productName, double cost, int howMany) {
          this.productCost = cost;
          this.quantity = howMany;
          this.name = productName;

      }
//A totalCost() method that prints the total cost when multiple products are purchased.
      public void totalCost() {
          System.out.println( "Total cost is " + this.productCost * this.quantity);

      }
//A printProduct() method that prints how much one unit of the product costs and how many units were purchased.
      public void printProduct() {
          if(this.quantity < 2) {
            System.out.println(this.name + " cost $" + this.productCost + " and " + this.quantity + " unit was purchased." );
          }else {
            System.out.println(this.name + " cost  $" + this.productCost + " and " + this.quantity + " units were purchased.");
          }
      }

    
}
