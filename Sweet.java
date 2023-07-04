public class Sweet {
    String name;
    double price;
    int quantity;
    public Sweet() {
        System.out.println("No argument is passed");
    }

    public Sweet(String name) {
        this.name = name;
    }

    public Sweet(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Sweet(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public Sweet(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String enterName(String name){
        this.name = name;
        return  name;
    }
    public double enterPrice(double price){
        this.price = price;
        return price;
    }
    public int enterQuantity(int quantity){
        ;this.quantity=quantity;
        return quantity;
    }
}
