public class Kebab{
    String name;
    double price;
    String hotelName;
    int noOfPieces;
    boolean takeAway;

    public Kebab(){
        System.out.println("This is a no argument constructor");
    }

    public Kebab(String name, double price, String hotelName, int noOfPieces, boolean takeAway) {
        this.name = name;
        this.price = price;
        this.hotelName = hotelName;
        this.noOfPieces = noOfPieces;
        this.takeAway = takeAway;
    }

    public Kebab(String name, double price, String hotelName) {
        this.name = name;
        this.price = price;
        this.hotelName = hotelName;
    }

    public Kebab(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Kebab(String name) {
        this.name = name;
    }
}
