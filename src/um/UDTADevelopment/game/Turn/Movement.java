package um.UDTADevelopment.game.Turn;

import um.UDTADevelopment.reference.rio;

/**
 * Created by nija123098 on 9/20/2014.
 */
public class Movement {
    public static void Mtern(){
        rio.out("Direction?");
        int Mt = rio.ini();
        //
        switch (Mt){
            case (0):{//foreword
                FLBR.foreword();
            }break;
            case (1):{//left
                FLBR.left();
            }break;
            case (2):{//back
                FLBR.back();
            }break;
            case (3):{//right
                FLBR.right();
            }break;
        }
    }
}
