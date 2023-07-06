public class Metro {
    String metroLine;
    int capacity;
    String startPoint;
    String endPoint;
    String noOfStop;

    public Metro(){
        System.out.println("This is a no-arg constructors");

    }


    public Metro(String metroLine, int capacity, String startPoint) {
        this.metroLine = metroLine;
        this.capacity = capacity;
        this.startPoint = startPoint;
    }

    public Metro(String metroLine, int capacity, String startPoint, String endPoint, String noOfStop) {
        this(metroLine, capacity, startPoint);

        this.endPoint = endPoint;
        this.noOfStop = noOfStop;
    }

    public Metro(String metroLine) {
        this.metroLine = metroLine;
    }
}
