package kata3;


import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay() {
        super("HISTOGRAMA");
        this.setContentPane(createPanel());
        this.pack();
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart3D("Histograma JFreChart", 
                                                         "Dominios email",
                                                         "Nº de emails", 
                                                         dataset, 
                                                         PlotOrientation.VERTICAL,
                                                         false, 
                                                         false, 
                                                         rootPaneCheckingEnabled);
        return chart;
    }
    
    public void execute(){
        setVisible(true);
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(500,"","ulpgc.es");
        dataSet.addValue(100,"","dis.ulpgc.es");
        dataSet.addValue(300,"","gmail.es");
        return dataSet;
    }
    
    
}
