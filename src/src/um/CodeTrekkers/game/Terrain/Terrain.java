package src.um.CodeTrekkers.game.Terrain;

import um.CodeTrekkers.reference.Rand;
import um.CodeTrekkers.reference.SettingsKindOf;

/**
 * Created by nija123098 on 9/19/2014.
 */
public class Terrain {
    public static void TerrainGen(){
        int terrain[][];
        terrain = new int[5][5];
        for(int c=0;c<5;c++){
            for(int o=0;o<5;o++){
                terrain[c][o] = Rand.Rand(SettingsKindOf.numofbio);
            }
        }

    }
}
