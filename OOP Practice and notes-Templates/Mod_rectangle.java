public class Mod_rectangle extends modernGeometric{


private double width;
private double height;

public Mod_rectangle() {


}

public Mod_rectangle (double width, double height){

    this.width = width;
    this.height = height;


}

public double getWidth(){
    return width;
    }

    public double getHeight(){

    return height;
    }


    public void setWidth(double width){
    this.width = width;
    }

    public void setHeight(double height){
    this.height = height;
    }

@Override

    public double getPerimiter(){

    return 2 * (width + height);}

    public double getArea() {
        return width * height;
    }

}




