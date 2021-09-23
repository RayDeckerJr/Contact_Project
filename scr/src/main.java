/*
/////////////////
//////RVY////////
/////////////////
*/
import java.util.Scanner;


public class main {
    public static Scanner in;
    private static int menuSelect;

    public static void main(String args[]){
        in = new Scanner(System.in);
        title();
    }
    private static void title(){
        int choice;

        System.out.println("Hello User.");
        System.out.println("\nAllow me to tell you about the 1997 Film Contact starring Jodie Foster...\n");
        System.out.println("\nPlease Choose an Option:\n1. Description\n");
        choice = in.nextInt();

        switch (choice){
            case 1:
                //For Description
                Description();
                break;

            case 2:
                //For Plot
                //plot();
                break;
            case 3:
                //For Case
                //
                break;

            default:
                System.out.println("Invalid Option: \n\n");

                break;
        }
    }
//MENU SELECTIONS
    private static void Description(){
    System.out.println("Contact is a 1997 American science fiction drama film directed by Robert Zemeckis, based on the 1985 novel by Carl Sagan. Sagan and his wife Ann Druyan wrote the story outline for the film. It stars Jodie Foster as Dr. Eleanor \"Ellie\" Arroway, a SETI scientist who finds evidence of extraterrestrial life and is chosen to make first contact. The film also stars Matthew McConaughey, James Woods, Tom Skerritt, William Fichtner, John Hurt, Angela Bassett, Rob Lowe, Jake Busey and David Morse. The film features the Very Large Array in New Mexico, the Arecibo Observatory in Puerto Rico, the Mir space station, and the Space Coast surrounding Cape Canaveral.\n" +
            "\n");
    }
    private static void Plot(){

    }
    private static void Cast(){

    }
    private static void returnToTheMenu(){
        System.out.println("Do you wish to learn more?");
        menuSelect = in.nextInt();
        if(menuSelect == 1){
            title();
        }else if (menuSelect == 2){
            System.out.println("The universe is a pretty big place. If it's just us, seems like an awful waste of space.");
        }
    }


}
