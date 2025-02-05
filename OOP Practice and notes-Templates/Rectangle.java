public class Rectangle extends GeometricObj1{

    private double width;
    private double height;

    public Rectangle(){


    }

    public Rectangle(double width, double height){

        this.width = width;
        this.height = height;
    }


    public Rectangle(double width, double height, String color, boolean filled){

        this.width = width;
        this.height = height;

        setColor(color); /// calling methods from geometric object1 through extend
        setFilled(filled);
    }

    // Getters and setters:

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){

        return width * height;

    }

    public double getPerimeter(){

        return 2 * (width + height);
    }

}
