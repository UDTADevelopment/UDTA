package um.CodeTrekkers.menu;

import um.CodeTrekkers.game.game;
import um.CodeTrekkers.reference.rio;

/**
 * Created by Jack on 9/1/2014.
 */
public class menu {
    public static void menuov(){
        intro();
        menu();
    }
    public static void intro(){
        rio.out("Hello World, and you.");
        rio.out("welcome to UDTA?");
        rio.out("we wish you would help us in dev");
        rio.out("This program is licensed");
    }
    public static void menu(){
        rio.out("Game?");
        boolean GameYN = rio.inb();
        if (GameYN = true){
            game.game();
        }else{}
    }


}