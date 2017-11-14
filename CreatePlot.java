import java.awt.Color; 
import java.awt.BasicStroke; 

import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.xy.XYDataset; 
import org.jfree.data.xy.XYSeries; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot; 
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.plot.PlotOrientation; 
import org.jfree.data.xy.XYSeriesCollection; 
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYSplineRenderer;

public class CreatePlot extends ApplicationFrame {

   public CreatePlot( String applicationTitle, String chartTitle ) {
      super(applicationTitle);
      JFreeChart xylineChart = ChartFactory.createXYLineChart(
         chartTitle ,
         null,
         null,
         createDataset() ,
         PlotOrientation.VERTICAL ,
         true , true , false);
         
      ChartPanel chartPanel = new ChartPanel( xylineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 1024 , 256 ) );
      final XYPlot plot = xylineChart.getXYPlot( );
     
      //remove axes
      Axis axis = plot.getDomainAxis();
      axis.setTickLabelsVisible(false);  // осевые метки значений
      axis.setAxisLineVisible(false);    // осевая линия
      axis.setTickMarksVisible(false);   // осевые метки делений
      ValueAxis axis_2 = plot.getRangeAxis();
      axis_2.setTickLabelsVisible(false);  // осевые метки значений
      axis_2.setAxisLineVisible(false);    // осевая линия
      axis_2.setTickMarksVisible(false);   // осевые метки делений
      
      XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
      /*XYSplineRenderer renderer = new XYSplineRenderer();*/
      renderer.setSeriesPaint( 0 , Color.RED );
      renderer.setSeriesPaint( 1 , Color.GREEN );
      renderer.setSeriesPaint( 2 , Color.YELLOW );
      renderer.setSeriesStroke( 0 , new BasicStroke( 3.0f ) );
      renderer.setSeriesStroke( 1 , new BasicStroke( 3.0f ) );
      renderer.setSeriesStroke( 2 , new BasicStroke( 3.0f ) );
      renderer.setSeriesStroke( 3 , new BasicStroke( 3.0f ) );
      renderer.setShapesVisible(false);
      plot.setRenderer( renderer ); 
      plot.setBackgroundPaint(Color.WHITE);
      plot.setDomainGridlinesVisible(false);
      plot.setRangeGridlinesVisible(false);
      setContentPane( chartPanel ); 
   }
   
   private XYDataset createDataset( ) {
      final XYSeries MAMA = new XYSeries( "MAMA" );
      MAMA.add( 1.0 , 1.0 );
      MAMA.add( 3.0 , 1.0 );
      MAMA.add( 3.0 , 3.0 );
      MAMA.add( 5.0 , 3.0 );
      MAMA.add( 5.0 , 1.0 );
      MAMA.add( 7.0 , 1.0 );
      
      
      
    /*  //БУКВА М
      MAMA.add( -3.0 , 9.0 );
      MAMA.add( -2.0 , 4.0 );
      MAMA.add( -1.0 , 1.0 );          
      MAMA.add( 0.0 , 0.0 );
      MAMA.add( 1.0 , 1.0 );
      MAMA.add( 2.0 , 4.0 );
      MAMA.add( 3.0 , 9.0 );
      //БУКВА А
      MAMA.add( 4.0 , 8.0 );
      MAMA.add( 5.0 , 7.0 );
      MAMA.add( 6.0 , 6.0 );
      MAMA.add( 7.0 , 5.0 );
      MAMA.add( 8.0 , 4.0 );
      MAMA.add( 9.0 , 3.0 );
      MAMA.add( 10.0 , 2.0 );
      MAMA.add( 11.0 , 1.0 );
      MAMA.add( 12.0 , 0.0 );
      //БУКВА М
      MAMA.add( 12.0 , 9.0 );
      MAMA.add( 13.0 , 4.0 );
      MAMA.add( 14.0 , 1.0 );
      MAMA.add( 15.0 , 0.0 );
      MAMA.add( 16.0 , 1.0 );
      MAMA.add( 17.0 , 4.0 );
      MAMA.add( 18.0 , 9.0 );
      //БУКВА А
      MAMA.add( 19.0 , 8.0 );
      MAMA.add( 20.0 , 7.0 );
      MAMA.add( 21.0 , 6.0 );
      MAMA.add( 22.0 , 5.0 );
      MAMA.add( 23.0 , 4.0 );
      MAMA.add( 24.0 , 3.0 );
      MAMA.add( 25.0 , 2.0 );
      MAMA.add( 26.0 , 1.0 );
      MAMA.add( 27.0 , 0.0 );*/
      
     
      
      final XYSeries MULA = new XYSeries( "MULA" );
      MULA.add( 7.0 , 1.0 );
      MULA.add( 9.0 ,3.0 );
      MULA.add( 9.0 , 1.0 );
      MULA.add( 11.0 , 3.0 );
      MULA.add( 11.0 , 1.0 );
      MULA.add( 13.0 , 1.0 ); 
   /*  //БУКВА М
      MULA.add( 28.0 , 9.0 );          
      MULA.add( 29.0 , 4.0 );
      MULA.add( 30.0 , 1.0 );
      MULA.add( 31.0 , 0.0 );
      MULA.add( 32.0 , 1.0 );
      MULA.add( 33.0 , 4.0 );
      MULA.add( 34.0 , 9.0 );
      //БУКВА Ы
      MULA.add( 35.0 , 3.0 );
      MULA.add( 36.0 , 1.5 );
      MULA.add( 37.0 , 0.7 );
      MULA.add( 38.0 , 0.35 );
      MULA.add( 39.0 , 0.18 );
      MULA.add( 40.0 , 0.0 );
      //БУКВА Л
      MULA.add( 41.0 , 1.0 );
      MULA.add( 42.0 , 2.0);
      MULA.add( 43.0 , 3.0 );
      MULA.add( 44.0 , 4.0);
      MULA.add( 45.0 , 5.0);
      MULA.add( 46.0 , 6.0);
      MULA.add( 47.0 , 7.0);
      MULA.add( 48.0 , 8.0);
      MULA.add( 49.0 , 9.0);
      //БУКВА А
      MULA.add( 50.0 , 8.0 );
      MULA.add( 51.0 , 7.0 );
      MULA.add( 52.0 , 6.0 );
      MULA.add( 53.0 , 5.0 );
      MULA.add( 54.0 , 4.0 );
      MULA.add( 55.0 , 3.0 );
      MULA.add( 56.0 , 2.0 );
      MULA.add( 57.0 , 1.0 );
      MULA.add( 58.0 , 0.0 );*/
      
      final XYSeries PAMY = new XYSeries( "PAMY" ); 
      PAMY.add( 13.0 , 3.0 );
      PAMY.add( 13.0 , 1.0 );
      PAMY.add( 16.0 , 2.0 );
      PAMY.add( 19.0 , 1.0 );
      /*
      //БУКВА РУ
      PAMY.add( 59.0 , 0.0 );          
      PAMY.add( 60.0 , 1.0 );          
      PAMY.add( 63.0 , 2.0 ); 
      PAMY.add( 68.0 , 3.0 );
      PAMY.add( 75.0 , 4.0 );
      PAMY.add( 84.0 , 5.0 );
      PAMY.add( 95.0 , 6.0 );
      PAMY.add( 108.0 , 7.0 );
      PAMY.add( 123.0 , 8.0 );
      PAMY.add( 140.0 , 9.0 );   
      //БУКВА А
      PAMY.add( 141.0 , 8.0 );
      PAMY.add( 142.0 , 7.0 );
      PAMY.add( 143.0 , 6.0 );
      PAMY.add( 144.0 , 5.0 );
      PAMY.add( 145.0 , 4.0 );
      PAMY.add( 146.0 , 3.0 );
      PAMY.add( 147.0 , 2.0 );
      PAMY.add( 148.0 , 1.0 );
      PAMY.add( 149.0 , 0.0 );
      //БУКВА М
      PAMY.add( 149.0 , 9.0 );
      PAMY.add( 150.0 , 4.0 );
      PAMY.add( 151.0 , 1.0 );
      PAMY.add( 152.0 , 0.0 );
      PAMY.add( 153.0 , 1.0 );
      PAMY.add( 154.0 , 4.0 );
      PAMY.add( 155.0 , 9.0 );
      //БУКВА У
      PAMY.add( 155.0 , 0.0 );
      PAMY.add( 156.0 , 5.0 );
      PAMY.add( 157.0 , 8.0 );
      PAMY.add( 158.0 , 9.0 );
      PAMY.add( 159.0 , 8.0 );
      PAMY.add( 160.0 , 5.0 );
      PAMY.add( 161.0 , 0.0 );*/
      final XYSeries FUCK = new XYSeries( "FUCK" );
      FUCK.add( 19.0 , 3.0 );
      FUCK.add( 21.0 , 3.0 );
      FUCK.add( 22.0 , 1.0 );
      FUCK.add( 23.0 , 1.0 );
      FUCK.add( 25.0 , 3.0 );
      
      final XYSeriesCollection dataset = new XYSeriesCollection( );          
      dataset.addSeries( MAMA );          
      dataset.addSeries( MULA );          
      dataset.addSeries( PAMY );
      dataset.addSeries( FUCK );
      return dataset;
   }

   public static void main( String[ ] args ) {
      CreatePlot chart = new CreatePlot("AnalogCryptography",
         "МАМА МЫЛА РАМУ");
      chart.pack( );          
      RefineryUtilities.centerFrameOnScreen( chart );          
      chart.setVisible( true ); 
   }
}