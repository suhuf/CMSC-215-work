public class BMI {

    private String name;
    private int age;
    private double weight;
    private double height;

    private static final double kg_p_lb = 0.45359237;
    private static final double meters_p_inch = 0.0254;


    public BMI(String name, int age, double weight, double height)  // Constructor

    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }

    public BMI(String name, double weight, double height) {

        this(name, 20, weight, height);

    }

    public double getBMI(){

        double bmi = weight * kg_p_lb / ((height * meters_p_inch) * (height * meters_p_inch));

        return Math.round(bmi*100)/100.0;

    }

    public String getStatus(){
        double bmi = getBMI();

        if(bmi < 16)
            return "really underweight";
        else if (bmi < 18)
            return "underweight";
        else if (bmi < 24)
            return "normal weight";
        else if (bmi < 29)
            return "overweight";
        else if (bmi < 35)
            return "very overweight";
        else
            return "very very overweight";

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

}
