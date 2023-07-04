public class sweetRunner {
    public static void main(String[] args) {
        Sweet object1 = new Sweet();

        String name1 = object1.enterName("Mysorepak");
        double price1 = object1.enterPrice(100.23);
        int quantity1 = object1.enterQuantity(3);
        System.out.println("NAME:" + " " + name1 +" "+ "PRICE:"+ " " + price1+" " + "QUANTITY: " +  quantity1);

        Sweet object2 = new Sweet("Dudh peda",123.52);
        System.out.println(object2.name);
        System.out.println(object2.price);
    }
}
