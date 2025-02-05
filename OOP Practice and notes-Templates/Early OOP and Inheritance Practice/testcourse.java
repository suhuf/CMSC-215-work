

public class testcourse {

    public static void main(String[] args){

        Course course1 = new Course("Data strucs");
        Course course2 = new Course("data sys");

        course1.addStudent("p j");
        course1.addStudent("c sin");
        course1.addStudent("jess w");

        course2.addStudent("pj");
        course2.addStudent("K w");

        System.out.println("number of studs in c1: " +

                course1.getNumberOstudents());

        String[] students = course1.getStudents();

        for (int i = 0; i < course1.getNumberOstudents(); i++)



            if(i != course1.getNumberOstudents()){

                System.out.print("not reached limit, students: " + students[i] + ", ");

            }

            else if (i == course1.getNumberOstudents() -1 ){
                System.out.println("reached limit students " + students[i]);
            }



        System.out.println();
        System.out.print("Number of students in course2: " +
                course2.getNumberOstudents());
    }

}