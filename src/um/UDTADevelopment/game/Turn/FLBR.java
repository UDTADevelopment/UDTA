package um.UDTADevelopment.game.Turn;

/**
 * Created by nija123098 on 9/20/2014.
 */
public class FLBR {
    public static void foreword(){
        Turn.der = 0;//not needed
        switch (Turn.der){
            case (0):{
                Turn.y = Turn.y++;
            }break;
            case (1):{
                Turn.x = Turn.x--;
            }break;
            case (2):{
                Turn.y = Turn.y--;
            }break;
            case (3):{
                Turn.x = Turn.x++;
            }break;
        }
    }
    public static void left(){
        Turn.der = 1;
        switch (Turn.der){
            case (3):{
                Turn.y = Turn.y++;
            }break;
            case (0):{
                Turn.x = Turn.x--;
            }break;
            case (1):{
                Turn.y = Turn.y--;
            }break;
            case (2):{
                Turn.x = Turn.x++;
            }break;
        }
    }
    public static void back(){
        Turn.der = 2;
        switch (Turn.der){
            case (2):{
                Turn.y = Turn.y++;
            }break;
            case (3):{
                Turn.x = Turn.x--;
            }break;
            case (0):{
                Turn.y = Turn.y--;
            }break;
            case (1):{
                Turn.x = Turn.x++;
            }break;
        }
    }
    public static void right(){
        Turn.der = 3;
        switch (Turn.der){
            case (1):{
                Turn.y = Turn.y++;
            }break;
            case (2):{
                Turn.x = Turn.x--;
            }break;
            case (3):{
                Turn.y = Turn.y--;
            }break;
            case (0):{
                Turn.x = Turn.x++;
            }break;
        }
    }
}
