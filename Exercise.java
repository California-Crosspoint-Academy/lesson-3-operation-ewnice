//Eunice Chan
// 2025-08-25

public class Exercise {
        public static void main(String[] args) {
            // question 1
            String s = "The number of rabbits is ";
            int argh = 129;
            String report = s + argh + ".";
            System.out.println(report); //print out "the number of rabits is 129."

            //question 2
            String p = "Groovy Dude";
            System.out.println(p.toUpperCase()); //print out "GROOVY DUDE"

            //question 3
            String g = "Computer Science is for nerds"; 
            System.out.println(g.toLowerCase()); //print out "compuer science is for nerds"

            //quesetion 4
            String m = "The Gettysburg Address";
            String c = m.substring(4); 
            System.out.println(c); //print out "Gettysburg Address"

            //question 5
            String b = "Four score and seven years ago";
            String cc = b.substring(7,12);
            System.out.println(cc); //print out characters from 7th to 12th index "ore a"

            //question 6
            String ss = "Surface tension";
            int count = ss.length();
            System.out.println(count); //print out # of characters in "Surface Tension" which is 15

            //question 7
            String look = "Look here!";
            String has = " has ";
            String chara = " characters.";
            int ten = look.length();
            String sentence = "\"" + look + "\"" + has + ten + chara;
            System.out.println(sentence); //print out ""Look here!"" has 10 characters."

            //question 8
            String all = "All \"good men\" should come to the aid to their country.";
            System.out.println(all); //print out "All "good men" should come to the aid to their country."
        
            //question 9
            String hi = "Hello \nHello again";
            System.out.println(hi); //print out a line break between "Hello" and "Hello Again" 

            //question 10
            String back = "A backslash look like this \\, ...right?";
            System.out.println(back); //print out a single back slash to make "A backslash looks like this \, ...right?"

            //question 11
            String pq = "Eddie Haskel";
            int hm = pq.length();
            String ed = pq.substring(hm - 4);
            System.out.println(ed); //print out the letters only starting from the amount of characters minus 4 making "skel"

            //question 12
            String her = "Herman Munster";
            String herm = her.substring(5,6); 
            System.out.println(herm); //print out "n" which is at the 5th index in the String
        }
}

           
           
    

           