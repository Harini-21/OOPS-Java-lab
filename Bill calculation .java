package billcalc;
public class Billcalc {
       public static void main(String[] args) {
       
          
        Printable superMarketBill = new SuperMarket(100.0);
        Printable restaurantBill = new Restaurant(200.0); 
           
        superMarketBill.display();
        superMarketBill.calculateBill();
        
        restaurantBill.display();
         restaurantBill.calculateBill();
     
    }
    
}
interface Printable {
     void calculateBill();
    void display();
}


class SuperMarket implements Printable {
    private double totalBill;

    public SuperMarket(double totalBill) {
        this.totalBill = totalBill;
    }

    @Override
    public  void calculateBill() {
       
        totalBill = totalBill - (totalBill * 0.10);
    }

    @Override
    public  void display() {
        System.out.println("SuperMarket Bill: $" + totalBill);
    }
}


class Restaurant implements Printable {
    private double totalBill;

    public Restaurant(double totalBill) {
        this.totalBill = totalBill;
    }

    @Override
    public  void calculateBill() {
        
        totalBill = totalBill + (totalBill * 0.15);
    }

    @Override
    public  void display() {
    System.out.println("Restaurant Bill: $" + totalBill);
    }
}


