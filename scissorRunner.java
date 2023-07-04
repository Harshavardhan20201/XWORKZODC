public class scissorRunner {
    public static void main(String[] args) {
        Scissor runner1 = new Scissor();

        Scissor runner2 = new Scissor("Philliphs","Blue");
        System.out.println(runner2.brand + " " +  " " + runner2.color);

        Scissor runner3 = new Scissor("Nivea","Black","Haircutting","Men",'M',700.12,"Gold");
        System.out.println(runner3.brand+" " + runner3.color + " " + " " + runner3.type+" "+ " " + runner3.usage + " "+runner3.size+ " " +runner3.material);

        Scissor runner4 = new Scissor("Man matters","Blue",'S',254.23);
        System.out.println(runner4.brand + " " + runner4.color+" "+runner4.size+" "+runner4.price);
        Scissor runner5 = new Scissor("Gucci",'L',"Platinum");
        System.out.println(runner5.brand+" "+runner5.size+" "+runner5.material);
        Scissor runner6 = new Scissor("Louis Vuitton","Gold");
        System.out.println(runner6.brand + " " + runner6.color);
        Scissor runner7 = new Scissor("Emporio Armani",'L',6520.230);
        System.out.println(runner7.brand+" "+runner7.price);


    }
}
