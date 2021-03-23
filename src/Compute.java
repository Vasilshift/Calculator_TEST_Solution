import java.util.Arrays;
import java.util.Scanner;

public class Compute {
    public static void main(String[] args) {
//  case when string is digits
        String str = "2+3";
        String items[] = str.split("\\s*(\\s|\\+|-|/|\\*)\\s*");
        int ent[] = new int[items.length];
        for(int i=0;i<items.length;i++){
            try{
                ent[i] = Integer.parseInt(items[i]);

            }catch(NumberFormatException e){
                //Error
            }
        }
        int plust = str.indexOf('+');
        int minus = str.indexOf('-');
        int divide = str.indexOf('/');
        int multip = str.indexOf('*');

        if(plust!=-1){
            System.out.println();
            System.out.println(ent[0] + ent[1]);
        }
        if(minus!=-1){
            System.out.println();
            System.out.println(ent[0] - ent[1]);
        }
        if(divide!=-1){
            System.out.println();
            System.out.println(ent[0] / ent[1]);
        }
        if(multip!=-1){
            System.out.println();
            System.out.println(ent[0] + ent[1]);
        }

// CASE when string is ROME digits

        String text = "I+II";
        String[] words = text.split("\\s*(\\s|\\+|-|/|\\*)\\s*");
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
        }
        String a = words[0];
        String b = words[1];
        int I = a.indexOf("I");
        int x = I;
        if(I != -1){ x = 1;  }
        int II = a.indexOf("II");
        if(II != -1){ x = 2;  }
        int III = a.indexOf("III");
        if(III != -1){ x = 3;  }

        int I1 = b.indexOf("I");
        int y = I1;
        if(I1 != -1){ y = 1;  }
        int I2 = b.indexOf("II");
        if(I2 != -1){ y = 2;  }
        int I3 = b.indexOf("III");
        if(I3 != -1){ y = 3;  }

        int c = x + y;
        String c1 = Integer.toString(c);
        if(c == 1) {c1 = "I";}
        if(c == 2) {c1 = "II";}
        if(c == 3) {c1 = "III";}
        if(c == 4) {c1 = "IV";}
        if(c == 5) {c1 = "V";}
        if(c == 6) {c1 = "VI";}
        if(c == 7) {c1 = "VII";}
        if(c == 8) {c1 = "VIII";}
        if(c == 9) {c1 = "IX";}
        if(c == 10) {c1 = "X";}
        if(c == 11) {c1 = "XI";}
        if(c == 12) {c1 = "XII";}
        if(c == 13) {c1 = "XIII";}
        if(c == 14) {c1 = "XIV";}
        if(c == 15) {c1 = "XV";}
        if(c == 16) {c1 = "XVI";}
        if(c == 17) {c1 = "XVII";}
        if(c == 18) {c1 = "XVIII";}
        if(c == 19) {c1 = "XIX";}
        if(c == 20) {c1 = "XX";}





        System.out.println(c1);



//        if(a == "I"){ int x = 1;
//            try {
//                //int x = Integer.valueOf(a);
//                int y = 1;
//                System.out.println(y);
//            } catch (NumberFormatException e) {
//                System.err.println("Неверный формат строки!");
//            }
//        }

//        boolean str1 = str.matches("\\+");
//        if(str1) {
//            System.out.println(ent[0] + ent[1]);
//            System.out.println("don't plus");
//
//        }
//        else {
//            System.out.println();
//            System.out.println("что-то не то");
//        }








//        boolean arab = str1.matches("1|2|3|4|5|6|7|8|9|10");
//        if(arab){
//            try {
//                int a = Integer.valueOf(str1);
//                //int str4 = str4 + str3;
//                System.out.println(a+7);
//            } catch (NumberFormatException e) {
//                System.err.println("Неверный формат строки!");
//            }
//        }
//        else {
//            boolean rim = str1.matches("I|II|III|IV|V|VI|VII|VIII|IX|X");
//            if(rim){
//                int I = 1, II = 2;
//                System.out.println(I);
//            }
//
//        }





    }
}
