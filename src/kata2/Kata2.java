package kata2;

public class Kata2 {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(1,5,3,2,5,58,8,9,4,1,2,6,4,2,7,8,1);
        HistogramDisplay display = new HistogramDisplay(histogram);
        display.execute();
    }
    
}
