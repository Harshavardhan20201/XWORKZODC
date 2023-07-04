public class KebabRunner {
    public static void main(String[] args) {
        Kebab runner1 = new Kebab();
        Kebab runner2 = new Kebab("Chicken-Kebab",150.50,"Al-Baik",10,false);
        Kebab runner3 = new Kebab("Prawn-Kebab",300.50);
        Kebab runner4 = new Kebab("Lobster-Kebab",600.22,"Al-Baik");
        System.out.println(runner2.name+" "+runner2.price+" "+runner2.hotelName+" "+runner2.noOfPieces+" "+runner2.takeAway);
        System.out.println(runner3.name+" "+runner3.price);
        System.out.println(runner4.name+" "+runner4.price+" "+runner4.hotelName);
    }
}
