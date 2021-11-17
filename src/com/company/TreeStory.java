import java.util.Scanner;

public class TreeStory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*  Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
            Enter your amazing code here!
        */
        // __Name__ is a __ adjective__ __noun__. They are always __adverb__ __verb__.

        System.out.println("How old are you?");
        int age = sc.nextInt();
        if(age < 13){
            // Insert exit code
            System.out.println("Sorry you must be at least 13 to use this program.");
            System.exit(0);
        }
        System.out.println("Enter a name:");
        String name = sc.next();
        System.out.println("Enter an adjective:");
        String adjective = sc.next();
        String noun;
        boolean isInvalidWord;
        int profanity = 0;
        do{
            System.out.println("Enter a noun:");
            noun = sc.next().toLowerCase();
            isInvalidWord = noun.equals("dork")
                    || noun.equals("jerk")
                    || noun.contains("or")
                    || noun.contains("er");

            if(isInvalidWord){
                System.out.println("That language is not allowed. Try again.");;
                profanity++;
            }
        }while(isInvalidWord);

        System.out.println("Enter an adverb:  ");
        String adverb = sc.next();
        System.out.println("Enter a verb ending with -ing:");
        String verb = sc.next();

        System.out.println("Your TreeStory: ");;
        System.out.printf("%s is a %s %s. ", name, adjective, noun);
        System.out.printf("(S)He is always %s %s. ", adverb, verb);

        if(profanity == 3){
            System.out.println("Good work even though your ignorant ass don't have any manners");
        } else if (profanity > 3) {
            System.out.println("Insults and disrespect are for the intellectually and morally poor");
        }
    }

}