import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        System.out.println("Please, enter the string ");
        Scanner text = new Scanner(System.in);
        String str = text.nextLine();
//  case when string has ARAB digits
        boolean teststr = str.matches("(.*)1(.*)|(.*)2(.*)|(.*)3(.*)|(.*)4(.*)|(.*)5(.*)|(.*)6(.*)|(.*)7(.*)|(.*)8(.*)|(.*)9(.*)");
        System.out.println(teststr);
        if(teststr){
            String items[] = str.split("\\s*(\\s|\\+|-|/|\\*)\\s*");
            int ent[] = new int[items.length];
            for(int i=0;i<items.length;i++){
                try{
                    ent[i] = Integer.parseInt(items[i]);
                }catch(NumberFormatException e){
                    //Error
                }
            }
        int arr1 = ent[0];
        int arr2 = ent[1];
        Znak.Operate(str, arr1, arr2);

        }
        // CASE when string is ROME digits
        else {
            String[] words = str.split("\\s*(\\s|\\+|-|/|\\*)\\s*");
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
            }
            String a = words[0];
            String b = words[1];
            int x = 0, y = 0;

            if ("I" == a.intern()) {
                x = 1;
            }
            if ("II" == a.intern()) {
                x = 2;
            }
            if ("III" == a.intern()) {
                x = 3;
            }
            if ("IV" == a.intern()) {
                x = 4;
            }
            if ("V" == a.intern()) {
                x = 5;
            }
            if ("VI" == a.intern()) {
                x = 6;
            }
            if ("VII" == a.intern()) {
                x = 7;
            }
            if ("VIII" == a.intern()) {
                x = 8;
            }
            if ("IX" == a.intern()) {
                x = 9;
            }
            if ("X" == a.intern()) {
                x = 10;
            }

            if ("I" == b.intern()) {
                y = 1;
            }
            if ("II" == b.intern()) {
                y = 2;
            }
            if ("III" == b.intern()) {
                y = 3;
            }
            if ("IV" == b.intern()) {
                y = 4;
            }
            if ("V" == b.intern()) {
                y = 5;
            }
            if ("VI" == b.intern()) {
                y = 6;
            }
            if ("VII" == b.intern()) {
                y = 7;
            }
            if ("VIII" == b.intern()) {
                y = 8;
            }
            if ("IX" == b.intern()) {
                y = 9;
            }
            if ("X" == b.intern()) {
                y = 10;
            }

            Znak.ComputeRim(x, y);
        }
    }
}
