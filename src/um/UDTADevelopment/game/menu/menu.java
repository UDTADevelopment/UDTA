package um.UDTADevelopment.game.menu;

import um.UDTADevelopment.game.game;
import um.UDTADevelopment.reference.rio;

/**
 * Created by nija123098 on 9/1/2014.
 */
public class menu {
    public static void menuov(){
        intro();
        menu.menu();
    }
    public static void intro(){
        rio.out("Hello World, and you.");
        rio.out("welcome to UDTA?");
        rio.out("we wish you would help us in dev");
        rio.out("This program is licensed");
    }
    public static void menu(){
        rio.out("Game?");
        int GameYN = rio.ini();
        if (GameYN == 1){
            game.game();
        }else{}
    }


}