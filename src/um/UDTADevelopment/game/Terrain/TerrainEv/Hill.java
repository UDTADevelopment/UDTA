package um.UDTADevelopment.game.Terrain.TerrainEv;

import um.UDTADevelopment.game.Ev.Nothing_AbsolutlyNothing;
import um.UDTADevelopment.game.Ev.Well_SomethingHappened;
import um.UDTADevelopment.reference.Rand;
import um.UDTADevelopment.reference.rio;

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
            }break;
            case (1):{
                Well_SomethingHappened.Well_SomethingHappened();
            }break;

        }
    }
}
