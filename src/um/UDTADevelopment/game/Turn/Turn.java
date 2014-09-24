package um.UDTADevelopment.game.Turn;

import um.UDTADevelopment.game.Terrain.Terrain;
import um.UDTADevelopment.game.Terrain.TerrainActiv;
import um.UDTADevelopment.reference.rio;

/**
 * Created by nija123098 on 9/19/2014.
 */
public class Turn {
    public static int x = (Terrain.mapsize/2)-1;//set center
    public static int y = x;//////////////////////point / spawn
    public static int der = 0;
    public static void Turnloop(int looptimes){
        int looplifecheck = 0;
        while (looplifecheck <= 10000){
            while (looptimes >= 0) {
                Turn();
                looplifecheck++;
                looptimes--;
            }
        }
        rio.out("Honestly");
        rio.out("you have no life");
    }
    //
    public static int check = 0;
    public static void Turn(){
        Movement.Mtern();
        //
        int whaterrain = Terrain.TerrainRead(x,y);
        TerrainActiv.TerrainActiv(whaterrain);
        //
    }
    public static void MoveA(){
        if (x>4){
            x = 4;
        }
        if (x<0){
            x = 0;
        }
        if (y>5){
            y = 4;
        }
        if (x<0){
            x=0;
        }
    }
}
