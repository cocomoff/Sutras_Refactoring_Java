public class Main {
    public static void main(String[] args) {
	Shape line = new ShapeLine(0, 0, 100, 200);
	Shape rectangle = new ShapeRectangle(10, 20, 30, 40);
	Shape oval = new ShapeOval(100, 200, 300, 400);
	Shape[] shape = {
	    line, rectangle, oval
	};

	for (Shape s : shape) {
	    s.draw();
	}
    }
}
