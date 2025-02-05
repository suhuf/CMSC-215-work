public class Student {

   protected String name;
    protected int credit_hours;
    protected int quality_points;
    protected static double gpa_threshold;

    // A Super class of student is created, this super class has variables that are protected instead of private so that
    // it is not necessary to create getter methods in the class


    public Student(String name, int credit_hours, int quality_points){
        this.name = name;
        this.credit_hours = credit_hours;
        this.quality_points = quality_points;

        // Constructor for student parent class that all subclasses must follow

    }

    public double gpa(){

        double raw_gpa = (double)quality_points/(double)credit_hours;

        return Math.round(raw_gpa * 100.0)/100.0;

        // Raw gpa is calculated by dividing integers after casting to double, it is then standardized for proper GPA
        // format via rounding
    }

    public boolean eligibleForHonorSociety(){

        if(gpa() > gpa_threshold){
            return true;
        }
        return false;

        // This is the first method made for the Honor Society check, as requested. This will be overridden by sub-classes
    }

    @Override

    public String toString(){

    return "Student name: " + name + " Student Year year" + " Student gpa: " + gpa();

    }


    public static void setGpaThreshold(double gpa_threshold){

        Student.gpa_threshold = gpa_threshold;

        // GPA threshold is passed to the method and then set.

    }

}
