import java.util.Scanner;

public class Week1_Challange {
    public static void main(String[] args) {

        System.out.println("Welcome to my game!");
        System.out.println();
        String rm1 = "upstairs";
        String rm2 = "basement";
        String rm3 = "attic";
        String rm4 = "dungeon";

        Scanner keyboard = new Scanner(System.in);


        System.out.println("As you enter the haunted house, you see two spooooky staircases. One leading " + rm1 + " and one leading to the " + rm2);
        System.out.println("Which option do you choose? Press 1 for upstairs or Press 2 for the basement");

        int ATB1 = keyboard.nextInt();
        if (ATB1 == 1)
        System.out.println("You have chosen to go to the basement");
            {
            System.out.println("In the basement you see a door that appears to lead outside. Do you open it or keep going? Press 1 to open the door or Press 2 to keep going");
                int ATB2 = keyboard.nextInt();
                if (ATB2 == 1)
                    System.out.println("The door was a trap and you're now trapped in a dungeon!");
                    if (ATB2 == 2)
                    System.out.println("You have chosen to go upstairs");
            }



        }

}
