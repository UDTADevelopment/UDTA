package um.UDTADevelopment.game.Terrain;

import um.UDTADevelopment.reference.Rand;
import um.UDTADevelopment.reference.SettingsKindOf;
import um.UDTADevelopment.reference.rio;

/**
 * Created by nija123098 on 9/19/2014.
 */
public class Terrain {

    public static int mapsize = 10;
    public static int terrain[][];
    public static int been[][];

    public static void TerrainGen(){
        terrain = new int[mapsize][mapsize];
        for(int c=0;c<mapsize;c++){
            for(int o=0;o<mapsize;o++){
                terrain[c][o] = -1;//set up for possible map function

            }
        }

        been = new int[mapsize][mapsize];
        for(int c=0;c<mapsize;c++){
            for(int o=0;o<mapsize;o++){
                been[c][o] = 0;//set up for possible map function

            }
        }
    }
    //
    public static int TerrainRead(int c1, int c2){
        if (terrain[c1][c2] == -1){
            terrain[c1][c2] = Rand.Rand(SettingsKindOf.numofbio);
        }
        return terrain[c1][c2];
    }
    public static int been(int c3, int c4){
        if (been[c3][c4] == 0){
            return 0;
        }else{
            return 1;
        }
    }
}
