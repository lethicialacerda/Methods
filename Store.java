public class Store {
    //instance fields
    String productType;
    double price = 0.5;
    
    //constructor method
    public Store(String product) {
        productType=product;
        
    }
    
    //write a advertise method here
    public void advertise(){
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType);
        
    }
    
    //method 2
    public void greetCostumer(String costumer){
        System.out.println("Welcome to the store, "+costumer+"!");
        
    }
    
    //method 3
    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
    }
    
    //method 4
    public double getPriceWithTax(){
        double totalPrice = price + price*0.08;
        return totalPrice;
    }
    
    //main method
    public static void main(String[] args) {
        Store product = new Store("cellphone");
        product.advertise();
        
        Store costumer = new Store("Ana");
        costumer.greetCostumer("Ana");
        
        Store lemonade = new Store("lemonada");
        lemonade.increasePrice(1);
        System.out.println(lemonade.price);
        
        //variavel
        double lemonadePrice = lemonade.getPriceWithTax();
        System.out.println(lemonadePrice);
        
      
    
        
    }
}