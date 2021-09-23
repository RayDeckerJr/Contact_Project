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
                Plot();
                break;
            case 3:
                //For Cast
                Cast();
                break;

            default:
                System.out.println("Invalid Option: \n\n");

                break;
        }
    }
//MENU SELECTIONS
    private static void Description(){
    System.out.println("Contact is a 1997 American science fiction drama film directed by Robert Zemeckis, based on the 1985 novel by Carl Sagan. Sagan and his wife Ann Druyan wrote the story outline for the film. It stars Jodie Foster as Dr. Eleanor \"Ellie\" Arroway, a SETI scientist who finds evidence of extraterrestrial life and is chosen to make first contact. The film also stars Matthew McConaughey, James Woods, Tom Skerritt, William Fichtner, John Hurt, Angela Bassett, Rob Lowe, Jake Busey and David Morse. The film features the Very Large Array in New Mexico, the Arecibo Observatory in Puerto Rico, the Mir space station, and the Space Coast surrounding Cape Canaveral.\n" +
            "\n\n");
    System.out.println("Sagan and Druyan began working on Contact in 1979. They wrote a film treatment more than 100 pages long and set up Contact at Warner Bros. with Peter Guber and Lynda Obst as producers. When development stalled, Sagan published Contact as a novel in 1985, and the film reentered development in 1989. Roland Joffé and George Miller had planned to direct, but Joffé dropped out in 1993, and Warner Bros. fired Miller in 1995. With Zemeckis as director, filming lasted from September 1996 to February 1997. Sony Pictures Imageworks handled most of the visual effects sequences.\n" +
            "\n\n");
    System.out.println("Contact was released on July 11, 1997. It grossed over $171 million worldwide, won the Hugo Award for Best Dramatic Presentation, and received numerous awards and nominations at the Saturn Awards.\n" +
            "\n");
    System.out.println("Edited by\tArthur Schmidt\n" +
            "Music by: Alan Silvestri\n" +
            "Production Company: South Side Amusement Company\n" +
            "Distributed by\tWarner Bros.\n" +
            "Release date: July 11, 1997\n" +
            "Running time\t150 minutes[1]\n" +
            "Country\tUnited States\n" +
            "Language\tEnglish\n" +
            "Budget\t$90 million\n" +
            "Box office\t$171.1 million");
    }
    private static void Plot(){

    }
    private static void Cast(){

    }
    private static void Options(){
        System.out.println("1. Description\n2. Plot\n3.Cast");
        menuSelect = in.nextInt();
        if(menuSelect == 1){
            Description();
        }else if (menuSelect == 2){
            Plot();
        }else if (menuSelect == 3){
            Cast();
        }
    }

    private static void returnToTheMenu(){
        System.out.println("Do you wish to learn more?");
        menuSelect = in.nextInt();
        if(menuSelect == 1){
            Options();
        }else if (menuSelect == 2){
            System.out.println("The universe is a pretty big place. If it's just us, seems like an awful waste of space.");
        }
    }


}
