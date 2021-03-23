public class Znak {
    public static void Operate(String str, int arr1, int arr2) {
        int plust = str.indexOf('+');
        int minus = str.indexOf('-');
        int divide = str.indexOf('/');
        int multip = str.indexOf('*');

        if(plust!=-1)  {  System.out.println(arr1 + arr2);   }
        if(minus!=-1)  {  System.out.println(arr1 - arr2);   }
        if(divide!=-1) {  System.out.println(arr1 / arr2);   }
        if(multip!=-1) {  System.out.println(arr1 * arr2);   }
    }



    public static void ComputeRim(int x, int y) {
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

        System.out.println("x= " + x + " y= " + y + " c = " + c);
        System.out.println(c1);
    }
}
