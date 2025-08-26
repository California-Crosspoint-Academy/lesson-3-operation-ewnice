//Receipt1.java

//Author: Eunice
//Period: A 

public class Receipt1 {
    public static void main(String[] args) {
       
        String name = "*            ----COSTCO FOOD COURT----           *";
        String a = "CHICKEN BAKE . . . . . . $";
        double b = 3.99;
        String c = "* " + a + b + "                 *";
        String d = "CHEESE PIZZA . . . . . . $";
        double e = 1.99;
        String f = "* " + d + e + "                 *";
        String g = "HOT DOG & SODA . . . . . . $";
        double h = 1.50;
        String i = "* " + g + h + "0" + "               *";
        String j = "DOUBLE CHOCOLATE CHUNK COOKIE . . . . . . $";
        double k = 2.49;
        String l = "* " + j + k + "*";
        String m = "COLD BREW MOCHA FREEZE . . . . . . $";
        double n = 2.99;
        String o = "* " + m + n + "       *";
        String p = "* Tax . . . . . . $";
        double q = 1.3;
        String r = p + q + "0" + "                          *";
        String s = "* Total . . . . . . $";
        double t = 14.29;
        String u = s + t + "                       *";

        System.out.println("**************************************************");
        System.out.println(name);
        System.out.println(c);
        System.out.println(f);
        System.out.println(i);
        System.out.println(l);
        System.out.println(o);
        System.out.println("*                                                *");
        System.out.println(r);
        System.out.println(u);
        System.out.println("**************************************************");
    }  
}