





public abstract class modernGeometric {

    private String color = "white";
    private boolean filled;
    private java.util.Date date;


    protected modernGeometric(){

        date = new java.util.Date();
        this.color = color;
        this.filled = filled;

    }

    public String toString(){
        return "created on " + date + "\n color" + color + "isFilled: " + filled;
    }




    public java.util.Date getDateCreated(){
        return date;
    }

    public abstract double getArea();


    public abstract double getPerimiter();








}
