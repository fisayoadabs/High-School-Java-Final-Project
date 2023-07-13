
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Fisayo
 */
public class CluesGame {
    static Scanner in = new Scanner(System.in);
    static int min =1;
    static int max=2;
    static String[] guilty=new String[3];
    public static void main(String [] arg){ //Main class which lets the program run.
        display();
         
       
    }
    public static void display(){ //Start menu which hold all the other methods inside
        System.out.println("Long ago the four nations lived in harmony\nthen everything changed when the avatars ATTACKED\nThe avatars are secret beings who protected our world");
        System.out.println("However, one has turned to darkness and is the cause of the suffering\nYour Mission is to use guesses and clues to discover and capture the rouge avatar!\n");
            System.out.println("These are the Avatars:Aang, Korra, Roku, Kiyoshi, Wan, Yang");
            System.out.println("These are the elements: Air, Water, Fire, Earth, Metal, Lightning");
            System.out.println("These are the kingdoms:Fire Nation, Earth Kingdom, Ba Sin Se, FireLord Palace, Water Tribe, Air Temple");
           Guilty();
           boolean running = true;
       while(running){
            position();
            System.out.println("Would you like to accuse?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            int option=in.nextInt();
            in.nextLine();
            if(option==1){
                accuse();
                break;
            
            }
    }
        }
    public static String[]Guilty(){ // creates all charaters weapons and rooms. Additionally decides the guilty aspects
        String[] Names= new String[]{"Aang", "Korra", "Roku", "Wan", "Kiyoshi", "Yang"};
        String[]Weapons=new String[]{"Air", "Water", "Fire", "Earth", "Metal", "Lightning"};
        String[]Locations= new String[]{"Fire Nation", "Earth Kingdom", "Ba Sin Se", "FireLord Palace", "Water Tribe", "Air Temple"};
        Random rand = new Random();  
        int randomName=rand.nextInt(Names.length);
      	guilty[0]=(Names[randomName]);
        Random ran = new Random();  
        int randomWeapon=ran.nextInt(Weapons.length);
      	guilty[1]=(Weapons[randomWeapon]);
        Random rad = new Random();  
        int randomLocation=rad.nextInt(Locations.length);
      	guilty[2]=(Locations[randomLocation]);
        return guilty; }
   
    public static String[] position(){ //Decides if player is in a room or not to allow guessing. And allows secret pasages to other rooms
        int number=(int)(Math.random() * (max - min + 1) + min);
        String[]room= new String[]{"Fire Nation", "Earth Kingdom", "Ba Sin Se", "FireLord Palace", "Water Tribe", "Air Temple"};    
        if (number==1){
        Random rad = new Random();  
        int randomroom=rad.nextInt(room.length);
        if(room[1]==room[randomroom]){
            System.out.println("You are in the "+room[randomroom]+". Would you like to move to "+room[2]+"?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            int okay=in.nextInt();
            if(okay==1){
                System.out.println("You took the secret passage and are in room "+room[2]);
                System.out.println("Would you like to Guess?");
                System.out.println("1.Yes");
                System.out.println("2.No");
                int choice=in.nextInt();
            in.nextLine();
            if(choice==1){
                room[randomroom]=room[2];
                System.out.println(guess(room, randomroom, rad));}    
        
            }
        } else if(room[0]==room[randomroom]){
            System.out.println("You are in the "+room[randomroom]+". Would you like to move to "+room[3]+"?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            int okay=in.nextInt();
            if(okay==1){
                System.out.println("You took the secret passage and are in room "+room[3]);
                System.out.println("Would you like to Guess?");
                System.out.println("1.Yes");
                System.out.println("2.No");
                int choice=in.nextInt();
            in.nextLine();
            if(choice==1){
                room[randomroom]=room[3];
                System.out.println(guess(room, randomroom, rad));}    
        
            }
        }else
        System.out.println("You are in the "+room[randomroom]);
        System.out.println("Would you like to Guess?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            int choice=in.nextInt();
            in.nextLine();
            if(choice==1){
                System.out.println(guess(room, randomroom, rad));}    
        
        }else{
            System.out.println("You are not in a kingdom so you cannot make a guess.");
        }
       return room; }
    public static String[]guess(String[] room, int randomroom, Random rad){ //Guessing method which allows users to input their avatars and weapons but room is already provided  
        String [] guesses=new String[3];
            System.out.println("Who do you suspect?");
            guesses[0]=in.nextLine();
            System.out.println("With what do you suspect with?");
            guesses[1]=in.nextLine();
            guesses[2]=room[randomroom];
            System.out.println("You suspected "+guesses[0]+" with the "+guesses[1]+" element in room "+guesses[2]);
            guesscompare(guesses,guilty);
        return guesses;}
    public static String[]accuse(){ //Accusing method which allows the user to input who to blame as the suspect with room choice provided. 
        String[]accusation=new String[3];
         System.out.println("Who are you accusing");
         accusation[0]=in.nextLine();
         System.out.println("With what are you accusing?");
         accusation[1]=in.nextLine();
         System.out.println("Where are you accusing?");
         accusation[2]=in.nextLine();
         accusecompare(accusation,guilty);
        return accusation;}
    public static void guesscompare(String[]guesses, String[]guilty){ //Compares the guessed charaters to the guilty and regardless of the result a clue is provided
        if (guesses[0] == guilty[0]) {
            if (guesses[1] == guilty[1]) {
                if (guesses[2] == guilty[2]) {
                   System.out.println("no clue");
                } else {
                    System.out.println("Your clue:" + guilty[2]);
                } }
                else{
                            System.out.println("Your clue:" + guilty[1]);}
                        }
                else{
                            System.out.println("Your clue:" + guilty [0]);}

    
     
    }
    public static void accusecompare(String[]accusation, String[]guilty){ //compares the users accused charaters to the guilty and responds with win or lose based on the result.
if(accusation[0]==guilty[0] || guilty[1]==accusation[1] || accusation[2]==guilty[2]){
             System.out.println("Congratulations. You caught the avatar");
         }else{
             System.out.println("The avatar has gotten away. You failed to capture Avatar "+guilty[0]+" with the "+guilty[1]+" Element in the "+guilty[2]+".");
         }
     }
}
