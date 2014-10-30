package um.UDTADevelopment.game.Ev;

import um.UDTADevelopment.game.Player;
import um.UDTADevelopment.reference.Rand;
import um.UDTADevelopment.reference.rio;

/**
 * Created by nija123098 on 10/29/2014.
 */
public class LotsOfStuff {
    public static void FlotsOfStuff(int savestate) {
        rio.out("lots of stuff is about to happen, think fast.");
        if (savestate == 0){
            rio.out("1 or 2");
            int cby1or2 = rio.ini();
            int r = Rand.Rand(1);
            if (r == cby1or2){
                rio.out("player - 10 money or what ever the currency is");
                Player.goldp(-10);
            }
            if (r == cby1or2){
                rio.out("player gains 10 currency");
            }
        }
        if (savestate == 1){
            rio.out("you are lucky, nothing has happened, despite the text");
        }
    }
}
