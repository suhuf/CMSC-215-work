public class test {

    public static void main(String[] args) {

        Circle4 circle = new Circle4(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The Radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2, 4);

        System.out.println("\n rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("the perimeter is " + rectangle.getPerimeter());
    }



    }


