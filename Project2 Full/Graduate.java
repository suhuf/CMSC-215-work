public class Graduate extends Student{

    //This is the Graduate subclass, there is only one independent instance variable specified here which is
    // Degree type, the rest are inherited from the superclass


    // private String class_rank;

    private String degree_type;


    public Graduate(String name, int credit_hours, int quality_points, String degree_type) {
        super(name, credit_hours, quality_points);

        this.degree_type = degree_type;

        // Degree type is set to what is passed and the other parameters are taken from githubthe super class.
    }


    @Override

    public boolean eligibleForHonorSociety(){

        if(super.gpa() > gpa_threshold && (degree_type.equals("Masters"))){
            return true;
        }
        return false;

        // If the degree type is masters AND the gpa, which is taken from the super class, is up-right they are eligible.
    }


    @Override

    public String toString(){

        return "Student name: " + name + " Student gpa: " + gpa() + " Degree sought: " + degree_type;

    }

}
