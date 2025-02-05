/*


Mulai Stewart, 1/21/2025. This program stores the information of basketball players and then calculates their average age,

The tallest player that is under the average age is then calculated and specified. This project was done via OOP concepts..

... and thinking in mind



*/




import java.util.Scanner;
import java.util.ArrayList;



public class Project1 {


    /* Main function of the program, scanner is opened and an array list is set that takes the customer object type - Player
    which is constructed and defined later on in the program */


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        ArrayList<Player> players = new ArrayList<>();



            while (true){
                System.out.println("Enter player's name, age, and height in feet and inches: ");

                String input = scanner.nextLine();

                if (input.equals("") || input.equals(" ")){



                    break;}  /* this is a while loop that breaks if either no input is entered or a space char alone is entered... */

                String[] parts = input.split(" ");

                String name = parts[0];
                int heightFT = Integer.parseInt(parts[2]);
                int heightINCH = Integer.parseInt(parts[3]);
                int age = Integer.parseInt(parts[1]);

                // The users input is split according to where spaces are present in their string and then assigned the ...

                //  Appropriate expected variables accordingly

                Height lHeight = new Height(heightFT, heightINCH); // Makes a new height object which is defined later ...
                // with the input as its parameters

                players.add(new Player(name, lHeight, age)); // The custom height object is now input as a parameter for...

                // the player object, the player object which is now created is added to its own player type arraylist


                }

        if(players.isEmpty()){
            System.out.println("No Data Entered. ");


        }
        else{

            int totalAges = 0;
            ArrayList<Player> bAvgPlayers = new ArrayList<>();

            for (Player player : players){
                totalAges += player.getAge();
            }

            double averageAge = totalAges / (double) players.size();

            // For each player in the player list, their age is taken and then added to a total, the total is then divided ...

            // By the list's size to calculate the average. The value is cast to a double.


            System.out.println("Average age is: " + averageAge);

            for(Player player : players){
                if(player.getAge() < averageAge){
                    bAvgPlayers.add(player);

                    /* For each player in the players list, if their age attribute is less than the calculated ...
                     average they are added to a new list that will calculate if they are the tallest player amongst themselves*/

                }
            }

            Player tallestPlayer = null;  // This is the placeholder for the object to avoid exceptions
            int maxHeight = 0;

            for (Player player : bAvgPlayers){
                int PlayerHeight = player.getHeight().toInches(); // Max Height is calculated via inches for ease in calcuations compared to feet + inches
                if(PlayerHeight > maxHeight){
                    maxHeight = PlayerHeight;
                    tallestPlayer = player;
                }
            }

            if(tallestPlayer != null){  // To avoid exceptions/errors, if the tallest player is still null, ie there was no ...
                // Tallest player assigned, then the program will not try to use the .toString method.

            System.out.println("The tallest player with less than average age is: ");

                System.out.println(tallestPlayer.toString());
            }

            else{
                System.out.println("There was only one player entered so we cannot choose a below average age player...");
            }
        }




            }




    public static class Player{

        private String name;
        private int age;
        private Height height;



        public Player(String name, Height height, int age){  // The player object is constructed with the custom Height ...

            // type parameter and some others

            this.name = name;
            this.height = height;  // Assigns the values of these types to what is passed in
            this.age = age;


        }

        public String getName(){


            return name;
        }

        public int getAge(){
            return age;
        }

        public Height getHeight(){


            return height;
        }


        @Override

         public String toString(){

            return "Name: " + getName() + " Age: " + getAge() + " " + height.toString();


            // this method overrides the Object to string method so that we can use the syntax for learning our own ...

            // Object's attributes

         }



    }



    public static class Height{
        private int heightInFt;
        private int heightinInches;





        public Height(int heightInFt, int heightinInches) {

            this.heightInFt = heightInFt + (heightinInches / 12);
            this.heightinInches = heightinInches % 12;

            // If the height in inches is over 12, that value is divided by 12, then if it is 1 it will be added to the ...

            // Normalized value in feet + inches
        }



        public int toInches(){

            return heightinInches * 12 + heightinInches;

            // This reverses the normalization by multiplying by 12 as 1 foot is 12 inches and then adding the inches to itself

            }


        @Override

        public String toString() {

            return "Height in feet: " + heightInFt + "'" + " " + heightinInches + "\"";

        }






}
}
