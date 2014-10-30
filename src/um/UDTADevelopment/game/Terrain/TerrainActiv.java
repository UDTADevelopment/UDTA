package um.UDTADevelopment.game.Terrain;

import um.UDTADevelopment.game.Terrain.TerrainEv.Hill;
import um.UDTADevelopment.game.Terrain.TerrainEv.HillyHills;
import um.UDTADevelopment.game.Terrain.TerrainEv.Swamp;
import um.UDTADevelopment.game.Terrain.TerrainEv.Valley;
import um.UDTADevelopment.reference.rio;

/**
 * Created by nija123098 on 9/20/2014.
 */
public class TerrainActiv {
    public static void TerrainActivate(int tselect,int savestate){
        if (savestate == 0){
            switch (tselect){
                case (0):{
                    rio.out("EXCEPTION! HOW IS THIS POSSIBLE?");
                }break;
                case (1):{
                    Hill.Hill();
                }break;
                case (2):{
                    Swamp.Swamp();
                }break;
                case (3):{
                    Valley.Valley();
                }break;
                case (4):{
                    HillyHills.HillyHills(savestate);//TODO
                }break;
            }
        }
    if (savestate >= 1){
        switch (tselect){
            case (0):{
                rio.out("EXCEPTION! HOW IS THIS POSSIBLE?");
            }break;
            case (1):{
                Hill.Hill();
            }break;
            case (2):{
                Swamp.Swamp();
            }break;
            case (3):{
                Valley.Valley();
            }break;
            case (4):{
                HillyHills.HillyHills(savestate);
            }break;
        }

    }
    }
}
