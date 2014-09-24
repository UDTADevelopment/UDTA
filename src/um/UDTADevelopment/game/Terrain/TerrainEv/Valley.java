package um.UDTADevelopment.game.Terrain.TerrainEv;

import um.UDTADevelopment.game.Ev.Nothing_AbsolutlyNothing;
import um.UDTADevelopment.game.Ev.Well_SomethingHappened;
import um.UDTADevelopment.reference.Rand;
import um.UDTADevelopment.reference.rio;

/**
 * Created by nija123098 on 9/21/2014.
 */
public class Valley {
    public static void Valley(){
        rio.out("'tisk, 'tisk, 'tisk, a Valley");
        //
        //# of events
        int numofev = 1;
        //
        switch (Rand.Rand(numofev)){
            case (0): {
                Nothing_AbsolutlyNothing.Nothing_AbsolutlyNothing();
            }break;
            case (1):{
                Well_SomethingHappened.Well_SomethingHappened();
            }break;
        }
    }
}
