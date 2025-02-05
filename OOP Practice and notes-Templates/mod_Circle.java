




public class mod_Circle extends modernGeometric{




    private double radius;

    public mod_Circle(){

    }
    public mod_Circle(double radius){
        this.radius = radius;
    }


    public double getArea(){

        return radius * radius * Math.PI;


    }

    public double getPerimiter(){


        return 2*radius *Math.PI;

    }

    public void printCircle() {
        System.out.println("Circle is created: " + getDateCreated() + radius);

    }
}
