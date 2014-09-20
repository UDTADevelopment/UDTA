package src.um.CodeTrekkers.game.Terrain.TerrainEv;

import um.CodeTrekkers.game.Ev.Nothing_AbsolutlyNothing;
import um.CodeTrekkers.game.Ev.Well_SomethingHappened;
import um.CodeTrekkers.reference.Rand;
import um.CodeTrekkers.reference.rio;

/**
 * Created by nija123098 on 9/19/2014.
 */
public class Hill {
    public static void Hill(){
        rio.out("'tis a Hill");
        //
        //# of events
        int numofev = 1;
        //
        switch (Rand.Rand(numofev)){
            case (0):{
                Nothing_AbsolutlyNothing.Nothing_AbsolutlyNothing();
            }
            case (1):{
                Well_SomethingHappened.Well_SomethingHappened();
            }

        }
    }
}
