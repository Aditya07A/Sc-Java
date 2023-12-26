package cwh;



public class cwh_practice3 {

    public static void main(String[] args) {
        // problem-1
        String name1 = "JACk Parker";
        name1 = name1.toLowerCase();
        // System.out.println(name);

        // problem -2
        String name = "J A C k ";
        name = name.replace(' ', '_');
        // System.out.println(name);
        // problem-3
        String letter = "Dear <|name|>,Thanks a lot";
        letter = letter.replace("<|name|>", "Adi");
        // System.out.println(letter);
        // problem -4
       // String myString = "this line has   double and triple spaces";
        // System.out.println(myString.indexOf(" "));
        // System.out.println(myString.indexOf(" "));

        // problem-5
        String letter2 = "Dear Harry\n\tThis java course is Nice.\n\tThanks!";
        System.out.println(letter2);
        
    
    }
}
