public class SimpleString {
    public static void main(String[] args) {
        String a = "wake up in the morning";
        String b = " and i dab";
        String c = a + b;
        String d = "tell me how many characters do you think there are in this sentence??";
        int e = d.length();
        String f = "papa's pizzaria";
        String g = f.substring(7,12);
        String h = "how old am i? ";
        int i = 17;
        String j = h + i;
        String k = "his name is \"John\"";
        String l = "This class is SO hard"; 
        String m = "im so tired";

        System.out.println(c); //concatenation connects 2 string lines
        System.out.println(e); //the length method helps find the amount of characters in a string
        System.out.println(g); //substrings can isolate a specific part in a string
        System.out.println(j); //concatenation using int and string can connect words and numbers
        System.out.println(k); //allows the sentence to keep quotation marks 
        System.out.println(l.toLowerCase()); //turns every character to lower case
        System.out.println(m.toUpperCase()); //turns every character to upper case)
    }  
}