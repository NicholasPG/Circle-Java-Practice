import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Tester {

    public static void main(String[] args) {

        ArrayList<Circle> circles = new ArrayList<Circle>();

        for (int i = 0; i < 30; i++)
            circles.add(Circle.circleMaker(5, 70, 250,
                    255, 0, 5, 0, 5));

        Collections.sort(circles, Comparator.comparingDouble(Circle::getDiameter));

        circles.forEach(System.out::println);

        StoplightPanel stoplightPanel = new StoplightPanel();
        CirclePanel circlePanel = new CirclePanel(circles);

        JFrame frame = new JFrame("This Frame");
        frame.getContentPane().add(stoplightPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        JFrame frame2 = new JFrame("This Other Frame");

        frame2.getContentPane().add(circlePanel);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.pack();
        frame2.setVisible(true);

        JFrame frame3 = new JFrame("This Other Other Frame");

        frame3.getContentPane().add(new ColorDemoPanel());
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.pack();
        frame3.setVisible(true);



        //Create array of drawable objects that are half circles and half squares
        ArrayList<Drawable> shapes = new ArrayList<Drawable>();
        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0) {
                shapes.add(Circle.circleMaker(5, 70, 0, 255,
                        0, 255, 0, 255));
            } else {
                shapes.add(Square.squareMaker(5, 70, 0, 255,
                        0, 255, 0, 255));
            }
        }
        //sort the ArrayList of shapes
        Collections.sort(shapes, Comparator.comparingDouble(Drawable::getSize));
        //Create panel for drawing shapes
        DrawablePanel shapesPanel = new DrawablePanel(shapes);
        //create and edit frame to put panel in
        JFrame frame4 = new JFrame("Circles and Squares");
        frame4.getContentPane().add(shapesPanel);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.pack();
        frame4.setVisible(true);












    }
}
