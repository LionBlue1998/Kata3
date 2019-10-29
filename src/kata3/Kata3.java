package kata3;

public class Kata3 {
    
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("ulpgc.es.com");
        histogram.increment("gmail.com");
        histogram.increment("ull.com");
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
}
