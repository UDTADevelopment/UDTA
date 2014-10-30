package um.UDTADevelopment.game;

import um.UDTADevelopment.reference.Rand;
import um.UDTADevelopment.reference.SettingsKindOf;

/**
 * Created by nija123098 on 9/19/2014.
 */
public class Player {
    static int LifeP = 100;
    static int goldcount = 100;
    static int based = 20;

    public static void life(int damage){
        LifeP = LifeP + damage;
    }
    //
    public static void goldp(int goldp){
        goldcount = goldcount + goldp;
    }
    //
    public static int dodamage(){
        based = 20;
        int damagetodo =  based + Rand.Rand(SettingsKindOf.extrad);//extraD
        if (Rand.Rand(99) <= SettingsKindOf.critchance){//critchance
            return 2*damagetodo;
        }
        return damagetodo;
    }
    //
    public static int rLP(){
        return LifeP;
    }
    //
    public static int rgoldcount(){
        return goldcount;
    }
}
