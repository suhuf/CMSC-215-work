import java.sql.SQLOutput;

public class moreStrings {


    public static void main(String[] args){

        String s1 = "qaruadah. Quaah";
        String s2 = new String("Programm this yo");
        String s3 = "wavasu w47265 52852095820387 xs";

        System.out.println(s1.replace('a','w' ));


        System.out.println(s3.replaceFirst("wavasu", "john"));

        System.out.println("Java fun is?".matches("Java.*"));

        System.out.println("440-11-3333".matches("\\d{3}-\\{2}-\\d{4}")); // Ie Does the provided number have 3

        // Digits followed by 2 digits followed by 4.

        char[] chars = s2.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            System.out.println(chars[i]);
        }

        String[] tokens = "Java#HTML#Perl".split("#");

        System.out.println(tokens[0]);

        String ss1 = " Welcome ";
        String ss2 = " welcome ";

        String ss3 = ss1.replace('e', 'E');

        System.out.println(ss3);

        String[] token = "Welcome to Java and HTML".split(" ");

        ss1 = token[0];
        ss2 = token[1];

        System.out.println(ss1);
        System.out.println(ss2);

        StringBuilder s9 = new StringBuilder("elepahnt attc");

        s9.append("reddddddd");

        System.out.println(s9);

        // ss1.replaceFirst("")


        System.out.println(String.valueOf(false));

    }
}
