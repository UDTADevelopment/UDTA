package um.UDTADevelopment.game;

import um.UDTADevelopment.reference.Rand;
import um.UDTADevelopment.reference.SettingsKindOf;

/**
 * Created by nija123098 on 9/19/2014.
 */
public class Player {
    int LifeP = 100;
    int goldcount = 100;
    int based = 20;

    public void damaged(int damage){
        LifeP = LifeP - damage;
    }
    //
    public void goldp(int goldp){
        goldcount = goldcount - goldp;
    }
    //
    public int dodamage(){
        based = 20;
        int damagetodo =  based + Rand.Rand(SettingsKindOf.extrad);//extraD
        if (Rand.Rand(99) <= SettingsKindOf.critchance){//critchance
            return 2*damagetodo;
        }
        return damagetodo;
    }
    //
    public void heal(int hplus){
        LifeP = LifeP + hplus;
    }
    //
    public int rLP(){
        return LifeP;
    }
    //
    public int rgoldcount(){
        return goldcount;
    }
}
