public class Main_Mod {


    public static void main(String[] args){

        modernGeometric G1 = new mod_Circle(5);
        modernGeometric G2 = new Mod_rectangle(5, 3);

        System.out.println("Obejcts having == area is.... : " + equalArea(G1, G2));


        geoInfo(G1);
        geoInfo(G2);

    }


    public static boolean equalArea(modernGeometric ob1, modernGeometric ob2 ){

        return ob1.getArea() == ob2.getArea();
    }

    public static void geoInfo(modernGeometric obj){
        System.out.println();
        System.out.println("The area is " + obj.getArea());
        System.out.println("The perimiter is " + obj.getPerimiter());
    }



}
