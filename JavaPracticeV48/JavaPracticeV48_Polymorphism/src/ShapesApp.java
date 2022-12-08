import com.exercise._shapes_abstract_class.*;

public class ShapesApp {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.9, 12.3);
        Circle circle = new Circle(12.3);

        triangle.computeArea();
        circle.computeArea();
    }
    
}
