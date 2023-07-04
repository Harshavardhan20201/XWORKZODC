public class Fish{
    String name;
    String type;
    int price;
    String location;

    public Fish(){
        System.out.println("This is the default no argument constructor");
    }

    public Fish(String name) {
        this.name = name;
    }

    public Fish(String name, String type, int price, String location) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.location = location;
    }

    public Fish(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Fish(String name, int price, String location) {
        this.name = name;
        this.price = price;
        this.location = location;
    }
}
