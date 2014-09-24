
package um.UDTADevelopment.game;

import um.UDTADevelopment.game.Terrain.Terrain;
import um.UDTADevelopment.game.Turn.Turn;
import um.UDTADevelopment.reference.rio;

/**
 * Created by nija123098 on 9/1/2014.
 */
public class game {
    public static void game(){
        Terrain.TerrainGen();
        //
        //Story Gen
        if (true){
            rio.out("how meany turns?");
            Turn.Turnloop(rio.ini());
        }else{}
    }
}