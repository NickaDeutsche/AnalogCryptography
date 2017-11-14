import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Paint;
import java.io.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.ChartUtilities; 

public class Image {

	public static void main(String[] args) throws Exception{
		final JFreeChart chart = ChartFactory.createXYLineChart(
	            "Демонстрация графиков функций",
	            null,                        // x axis label
	            null,                        // y axis label
	            null,                        // data
	            PlotOrientation.VERTICAL,
	            true,                        // include legend
	            false,                       // tooltips
	            false                        // urls
	        );

	        chart.setBackgroundPaint(Color.white);

	        final XYPlot plot = chart.getXYPlot();
	        plot.setBackgroundPaint(Color.WHITE);

	        //plot.setDomainGridlinePaint(Color.gray);
	        //plot.setRangeGridlinePaint (Color.gray);
	        
	        // Определение отступа меток делений
	        //plot.setAxisOffset(new RectangleInsets (1.0, 1.0, 1.0, 1.0));

	        // Скрытие осевых линий и меток делений
	        ValueAxis axis = plot.getDomainAxis();
	        axis.setAxisLineVisible (false);    // осевая линия
	        
	        // Настройка NumberAxis
	        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
	        rangeAxis.setAxisLineVisible (false);
	        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

	        // Настройка XYSplineRenderer
	        // Precision: the number of line segments between 2 points [default: 5]
	        XYSplineRenderer r0 = new XYSplineRenderer();
	        r0.setSeriesShapesVisible (0, false);
	        
	        XYSplineRenderer r1 = new XYSplineRenderer();
	        r1.setPrecision(8); 
	        r1.setSeriesShapesVisible (0, false);
	        
	        XYSplineRenderer r2 = new XYSplineRenderer(1);
	        
	        r2.setSeriesShapesVisible (0, false);
	        r2.setSeriesPaint         (0, Color.orange);
	        r2.setSeriesStroke        (0, new BasicStroke(2.5f));
	        
	        // Наборы данных
	        DefaultXYDataset dataset0 = new DefaultXYDataset();
	        double[][] data0 = {{0, 1, 2, 3, 4, 5, 6}, {1, 3,  1, 3, 1.2, 1.5, 2}};
	        dataset0.addSeries(0, data0);
	        DefaultXYDataset dataset1 = new DefaultXYDataset();
	        double[][] data1 = {{7, 7.1, 7.5,  8, 9, 10, 10.5, 10.9, 11}, {1, 2, 2.7, 3, 2, 3, 2.7, 2, 1}};
	        dataset0.addSeries(1, data1);
	        DefaultXYDataset dataset2 = new DefaultXYDataset();
	        double[][] data2 = {{12, 13, 13.6, 13.8, 14, 14.6, 15.6}, {1.5, 1, 1.3, 2, 2.7, 3 ,2.5 }};
	        dataset0.addSeries(2, data2);
	        DefaultXYDataset dataset3 = new DefaultXYDataset();
	        double[][] data3 = {{17, 17.5, 17.7, 18, 18.5, 19, 19.3, 19.5, 20}, {1.5, 1, 1.5, 2.5, 3, 2.5, 1.5, 1, 1.5}};
	        dataset0.addSeries(3, data3);
	        
	        plot.setDataset(0, dataset0);
	        plot.setDataset(1, dataset1);
	        plot.setDataset(2, dataset2);
	        plot.setDataset(3, dataset3);
	        
	     // Подключение Spline Renderer к наборам данных
	        plot.setRenderer(0, r0);
	        plot.setRenderer(1, r1);
	        plot.setRenderer(2, r2);
	        
	        int width = 1024;   /* Width of the image */
	        int height = 256;  /* Height of the image */ 
	        File XYChart = new File( "image1.jpeg" ); 
	        ChartUtilities.saveChartAsJPEG( XYChart, chart, width, height);
	        

	}

}
