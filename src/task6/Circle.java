package task6;

public class Circle {
    double radius;

    // No-argument constructor
    public Circle() {
        this.radius = 1.0; // Default radius
    }

    // Constructor with radius argument
    public Circle(double radius) {
        this.radius = radius;
    }

    // To calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Circle circle1 = new Circle();
	        System.out.println("Circle 1 Radius: " + circle1.radius);
	        System.out.println("Circle 1 Circumference: " + circle1.calculateCircumference());

	        // Create a circle with a specified radius
	        Circle circle2 = new Circle(5.0);
	        System.out.println("Circle 2 Radius: " + circle2.radius);
	        System.out.println("Circle 2 Circumference: " + circle2.calculateCircumference());
	}

}
