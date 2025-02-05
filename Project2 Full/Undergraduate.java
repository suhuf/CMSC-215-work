public class Undergraduate extends Student{


//This is the Undergraduate subclass, there is only one independent instance variable specified here which is
    // school year, the rest are inherited from the superclass


    // private String class_rank;
    private String school_year;

    public Undergraduate(String name, int credit_hours, int quality_points, String school_year) {
        super(name, credit_hours, quality_points);
        this.school_year = school_year;

        // School year is set to what is passed and the other parameters are taken from the super class.
    }


    @Override

    public boolean eligibleForHonorSociety(){

        if(super.gpa() > gpa_threshold && (school_year.equals("Junior") || school_year.equals("Senior"))){
            return true;
        }
        return false;

        // If gpa threshold met and (&&) the school year string is above Sophomore, eligibility is confirmed.
    }

    @Override

    public String toString(){

        return "Student name: " + name + " Student Year: "+ school_year + " Student gpa: " + gpa();

    }
}


