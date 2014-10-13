package um.UDTADevelopment.game.Terrain;

import um.UDTADevelopment.reference.Rand;
import um.UDTADevelopment.reference.SettingsKindOf;

/**
 * Created by nija123098 on 9/19/2014.
 */
public class Terrain {

    public static int mapsize = 10;
    public static int terrain[][];

    public static void TerrainGen(){
        terrain = new int[mapsize][mapsize];
        for(int c=0;c<mapsize;c++){
            for(int o=0;o<mapsize;o++){
                terrain[c][o] = -1;//set up for possible map function
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
    ///////////////////////////////////////////////////////////////////////////////////
    /* //WIP TODO
    public static void Terrain (int x, int y){
        if (terrain[x][y]> SettingsKindOf.numofbio){

        }
        if (terrain[x][y]<=0){

        }
    }
    public static int terrainret()
    */
}
