public class fishRunner {
    public static void main(String[] args) {
        Fish runner1 = new Fish();
        Fish runner2 = new Fish("Fighter","Aquarium fish");
        Fish runner3 = new Fish("Gold Fish","Aquarium fish",150,"Bangalore");
        Fish runner4 = new Fish("Jalebi","Bangalore");
        System.out.println(runner2.name+" "+runner2.type);
        System.out.println(runner3.name+" "+runner3.type+ " "+runner3.price+" "+ runner3.location);
        System.out.println(runner4.name+ " "+ runner4.type);
    }
}
