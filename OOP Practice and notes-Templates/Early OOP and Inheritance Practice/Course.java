public class Course {

    private String courseName;
   private String[] students = new String[100];
    private int numberOstudents;

    public Course(String courseName){
        this.courseName = courseName;
    }
    public void addStudent(String student){

        students[numberOstudents] = student;
        numberOstudents++;

    }

    public String[] getStudents(){
        return students;


    }

    public int getNumberOstudents(){
        return numberOstudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){

        // add student dropping feature. 10.9
        numberOstudents--;
    }


}
