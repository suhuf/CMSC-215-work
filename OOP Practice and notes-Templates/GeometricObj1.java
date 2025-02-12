public class GeometricObj1 {

    private String color = "black";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObj1(){
        dateCreated = new java.util.Date();
    }

    public GeometricObj1(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;


    }

    // Getters and setters

    public String getColor(){

        return color;

    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){

        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;

    }

}
