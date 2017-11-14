import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Paint;
import java.io.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.ChartUtilities; 

public class CreateImage {

   public static void main( String[ ] args )throws Exception {
	   /*final XYSeries MAMA = new XYSeries( "MAMA" );
	      //БУКВА М
	      MAMA.add( -3.0 , 9.0 );
	      MAMA.add( -2.0 , 4.0 );
	      MAMA.add( -1.0 , 1.0 );          
	      MAMA.add( 0.0 , 0.0 );
	      MAMA.add( 1.0 , 1.0 );
	      MAMA.add( 2.0 , 4.0 );
	      MAMA.add( 3.0 , 9.0 );
	      
	      final XYSeries MAMA_1 = new XYSeries( "MAMA_1" );
	      //БУКВА А
	      MAMA_1.add( 4.0 , 8.0 );
	      MAMA_1.add( 5.0 , 7.0 );
	      MAMA_1.add( 6.0 , 6.0 );
	      MAMA_1.add( 7.0 , 5.0 );
	      MAMA_1.add( 8.0 , 4.0 );
	      MAMA_1.add( 9.0 , 3.0 );
	      MAMA_1.add( 10.0 , 2.0 );
	      MAMA_1.add( 11.0 , 1.0 );
	      MAMA_1.add( 12.0 , 0.0 );
	      
	      final XYSeries MAMA_2 = new XYSeries( "MAMA_2" );
	      //БУКВА М
	      MAMA_2.add( 12.0 , 9.0 );
	      MAMA_2.add( 13.0 , 4.0 );
	      MAMA_2.add( 14.0 , 1.0 );
	      MAMA_2.add( 15.0 , 0.0 );
	      MAMA_2.add( 16.0 , 1.0 );
	      MAMA_2.add( 17.0 , 4.0 );
	      MAMA_2.add( 18.0 , 9.0 );
	      
	      final XYSeries MAMA_3 = new XYSeries( "MAMA_3" );
	      //БУКВА А
	      MAMA_3.add( 19.0 , 8.0 );
	      MAMA_3.add( 20.0 , 7.0 );
	      MAMA_3.add( 21.0 , 6.0 );
	      MAMA_3.add( 22.0 , 5.0 );
	      MAMA_3.add( 23.0 , 4.0 );
	      MAMA_3.add( 24.0 , 3.0 );
	      MAMA_3.add( 25.0 , 2.0 );
	      MAMA_3.add( 26.0 , 1.0 );
	      MAMA_3.add( 27.0 , 0.0 );*/
	   final XYSeries MAMA = new XYSeries( "MAMA" );
	      MAMA.add( 1.0 , 1.0 );
	      MAMA.add( 3.0 , 1.0 );
	      MAMA.add( 3.0 , 3.0 );
	      MAMA.add( 5.0 , 3.0 );
	      MAMA.add( 5.0 , 1.0 );
	      MAMA.add( 7.0 , 1.0 );
	      
	      final XYSeries MULA = new XYSeries( "MULA" );
	      MULA.add( 7.0 , 1.0 );
	      MULA.add( 9.0 ,3.0 );
	      MULA.add( 9.0 , 1.0 );
	      MULA.add( 11.0 , 3.0 );
	      MULA.add( 11.0 , 1.0 );
	      MULA.add( 13.0 , 1.0 ); 
	      
	      final XYSeries PAMY = new XYSeries( "PAMY" ); 
	      PAMY.add( 13.0 , 3.0 );
	      PAMY.add( 13.0 , 1.0 );
	      PAMY.add( 16.0 , 2.0 );
	      PAMY.add( 19.0 , 1.0 );
	      
	      final XYSeries FUCK = new XYSeries( "FUCK" );
	      FUCK.add( 19.0 , 3.0 );
	      FUCK.add( 21.0 , 3.0 );
	      FUCK.add( 22.0 , 1.0 );
	      FUCK.add( 23.0 , 1.0 );
	      FUCK.add( 25.0 , 3.0 );
    
      final XYSeriesCollection dataset = new XYSeriesCollection( );
      dataset.addSeries(MAMA);
      dataset.addSeries(MULA);
      dataset.addSeries(PAMY);
      dataset.addSeries(FUCK);
      //dataset.addSeries(MAMA);
      //dataset.addSeries(MAMA_1);
      //dataset.addSeries(MAMA_2);
      //dataset.addSeries(MAMA_3);

      
      JFreeChart xylineChart = ChartFactory.createXYLineChart(
         null, 
         null,
         null, 
         dataset,
         PlotOrientation.VERTICAL, 
         false, true, false);
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
      renderer.setSeriesPaint( 0 , Color.BLACK );
      renderer.setSeriesPaint( 1 , Color.BLACK );
      renderer.setSeriesPaint( 2 , Color.BLACK);
      renderer.setSeriesPaint( 3 , Color.BLACK);
      renderer.setSeriesStroke( 0 , new BasicStroke( 3.0f ) );
      renderer.setSeriesStroke( 1 , new BasicStroke( 3.0f ) );
      renderer.setSeriesStroke( 2 , new BasicStroke( 3.0f ) );
      renderer.setSeriesStroke( 3 , new BasicStroke( 3.0f ) );
      renderer.setShapesVisible(false);
      plot.setBackgroundPaint(Color.WHITE);
      plot.setDomainGridlinesVisible(false);
      plot.setRenderer( renderer ); 
      
      int width = 1024;   /* Width of the image */
      int height = 256;  /* Height of the image */ 
      File XYChart = new File( "XYLineChart.jpeg" ); 
      ChartUtilities.saveChartAsJPEG( XYChart, xylineChart, width, height);
   }
}