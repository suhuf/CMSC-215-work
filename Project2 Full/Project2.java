
/*
*
* This program takes student information via a text file and then uses OOP and inheritance to make respective objects
*
* Of said students. Their data is then processed and calculated for honors society requirements.
*
* Many variables are in snakecase as I was in a rush and I am used to writing variables in snakecase from python
* experience
*
* */



import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;   // Used to streamline adding elements to an array

public class Project2 {

    public static void main(String[] args) throws Exception{

        ArrayList<String> Undergraduate_params = new ArrayList<>();   /* This is a list of the parameters that indicate
                                                                      that a student is to be assigned the undergrad sub-class   */
        ArrayList<String> Graduate_params = new ArrayList<>();          // Same as above but for graduates.

        ArrayList<Student> Students = new ArrayList<>();   // Array that is made of the custom Student supertype.


        Collections.addAll(Undergraduate_params, "Junior", "Senior", "Freshman", "Sophomore");
        Collections.addAll(Graduate_params, "Masters", "Doctorate" );




    java.io.File stud_info = new java.io.File("students.txt");   // Students.txt is set as the desired object file

    if(!stud_info.exists()){  // Checks if said file exists, if not the program closes and notifies user.

        System.out.println("File does not exist, file containing students info is required to proceed.");
        System.exit(1);
    }



        Scanner input = new Scanner(stud_info);   // The file is fed to the scanner as a new scanner object named input

    while (input.hasNext()){    // Every time there is a new line, this loop re-runs, the line is saved as a string and
                                // Then split to specific variables which will be passed to the objects

        String line = input.nextLine();

        String[] parts = line.split(" ");  /* Line is split according to whitespace delimiter */

        String student_name = parts[0];

        int student_credit = Integer.parseInt(parts[1]); // int parse these
        int student_qp = Integer.parseInt(parts[2]);
        String school_level = parts[3];

        if (Graduate_params.contains(school_level)){

            Students.add(new Graduate(student_name, student_credit, student_qp, school_level));
        }
        else{
            Students.add(new Undergraduate(student_name, student_credit, student_qp, school_level));
        }

        /* The type of subclass object to create is defined according to what their 4th parameter is, if it is amongst
        * The undergraduate parameters, an undergraduate subclass object is made, and the same for graduate. */

    }

        for (Student p : Students) {
            System.out.println(p);

            // Prints all students regardless of school level from an array

    }

    double totalGPAs=0;

        for (Student s : Students){
            totalGPAs +=  s.gpa();

        }
        double averageGPA = totalGPAs / (double) Students.size();

        double threshold = ((averageGPA + 4)/2);

        threshold = Math.round(threshold * 100.0)/100.0;

        // Each student calls its gpa method to calculate the GPA, the GPA is then stored into a raw threshold variable
        // after calculations. The threshold variable is then standardized via rounding to have proper GPA format


        Student.setGpaThreshold(threshold);  // Gpa threshold is set via the past made method.

        System.out.println("GPA Threshold For membership is: " + threshold);

        System.out.println("Eligible Honors Society Students: ");

        for (Student s : Students){

            if (s.eligibleForHonorSociety()){

                // For each student the boolean is checked to be true for honors society eligibility

                System.out.println(s);

            }

        }




    }
}


