package um.UDTADevelopment.game.Terrain;

import um.UDTADevelopment.reference.Rand;
import um.UDTADevelopment.reference.SettingsKindOf;

/**
 * Created by nija123098 on 9/19/2014.
 */
public class Terrain {
    static int terrain[][];
    public static void TerrainGen(){
        //int terrain[][];
        terrain = new int[5][5];
        for(int c=0;c<5;c++){
            for(int o=0;o<5;o++){
                terrain[c][o] = Rand.Rand(SettingsKindOf.numofbio);
            }
        }

    }
    public static int TerrainRead(int c1, int c2){
        return terrain[c1][c2];
    }
}
