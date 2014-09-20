package um.UDTADevelopment.game.Terrain;

import um.UDTADevelopment.game.Terrain.TerrainEv.Hill;
import um.UDTADevelopment.game.Terrain.TerrainEv.Swamp;

/**
 * Created by nija123098 on 9/20/2014.
 */
public class TerrainActiv {
    public static void TerrainActiv(int terr){
        switch (terr){
            case (0):{
                Hill.Hill();
            }break;
            case (1):{
                Swamp.Swamp();
            }break;
        }
    }
}
