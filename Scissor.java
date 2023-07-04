public class Scissor{
    String brand;
    String color;
    String type;
    String usage;
    char size;
    double price;
    String material;

    public Scissor(){
        System.out.println("This is a no-argument constructors");
    }

    public Scissor(String brand, String color, String type, String usage, char size, double price, String material) {
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.usage = usage;
        this.size = size;
        this.price = price;
        this.material = material;
    }

    public Scissor(String brand, String color, char size, double price) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public Scissor(String brand, char size, String material) {
        this.brand = brand;
        this.size = size;
        this.material = material;
    }

    public Scissor(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Scissor(String brand, String type, char size, String material) {
        this.brand = brand;
        this.type = type;
        this.size = size;
        this.material = material;
    }

    public Scissor(String brand, char size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }
}
