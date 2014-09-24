package um.UDTADevelopment.game.Terrain;

import um.UDTADevelopment.game.Terrain.TerrainEv.Hill;
import um.UDTADevelopment.game.Terrain.TerrainEv.Swamp;
import um.UDTADevelopment.game.Terrain.TerrainEv.Valley;
import um.UDTADevelopment.reference.rio;

/**
 * Created by nija123098 on 9/20/2014.
 */
public class TerrainActiv {
    public static void TerrainActiv(int terr){
        switch (terr){
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
            }
        }
    }
}
