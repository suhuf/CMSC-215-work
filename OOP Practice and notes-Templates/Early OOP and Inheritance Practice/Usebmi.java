public class Usebmi {

    public static void main(String[] args){

        BMI bmi1 = new BMI("ahmed", 22, 175, 70);
        System.out.println("The BMI FOR " + bmi1.getName() + " is "
        + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("ee", 215, 70);
        System.out.println("the BEEMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());

    }
}


