package exercise1;
 
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

       // for (int i = 0; i < hand.length; i++) {
         //   Card card = new Card();
           // Random rand = new Random();
           //card.setValue(rand.nextInt(13) + 1);
           //card.setSuit(Card.SUITS[rand.nextInt(4)]);
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
       // }

        
        hand[0]= new Card();
        hand[0].setValue(1);
        hand[0].setSuit("Hearts");        
        hand[1]= new Card();
        hand[1].setValue(2);
        hand[1].setSuit("Clubs");        
        hand[2]= new Card();
        hand[2].setValue(3);
        hand[2].setSuit("Diomonds");
        hand[3]= new Card();
        hand[3].setValue(4);
        hand[3].setSuit("Spades");
        hand[4]= new Card();
        hand[4].setValue(5);
        hand[4].setSuit("Clubs");
        hand[5]= new Card();
        hand[5].setValue(12);
        hand[5].setSuit("Hearts");
        hand[6]= new Card();
        hand[6].setValue(11);
        hand[6].setSuit("Hearts");
       
        Scanner input = new Scanner(System.in);
        System.out.println("enter value");
        int userValue =input.nextInt();
        System.out.println("enter suit");
       
         String userSuit= input.nextLine();
        for(int i =0;i<hand.length;i++){
            if(hand[i].getValue()==userValue &&
               hand[i].getSuit().equals(userSuit)){
                printInfo();
            }//end of if
        }//end of for
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
     
        
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
