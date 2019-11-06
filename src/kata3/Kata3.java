package kata3;

public class Kata3 {
    
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        
        histogram.increment("gmail.com",10);
        
        histogram.increment("hotmail.com",7);
        
        histogram.increment("ulpgc.es",6);
        
        histogram.increment("ull.es",5);
        
        histogram.increment("gmail.com",0);
        
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
}
