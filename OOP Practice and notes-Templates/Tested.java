public class Tested {


    public static void main(String [] args){
        Object[] objects = {new Tiger(), new Chicken(), new apple()};

        for(int i=0; i<objects.length;i++){
            if (objects[i] instanceof edible){
                System.out.println(((edible) objects[i]).howToEat());
            }
            else{
                System.out.println("Object is not edible");
            }
        }

    }


}



class Animal{


}

class Chicken extends Animal implements edible{


    public String howToEat() {
        return "Chicken: Fry em' ";
    }
}

class Tiger extends Animal{

        }

        abstract class Fruit implements edible{



        }

        class apple extends Fruit{

        public String howToEat(){
            return "Apple: Apple the cider";
        }

 }

 class Orange extends Fruit{
    public String howToEat(){
        return "orange the juyice";
    }
 }