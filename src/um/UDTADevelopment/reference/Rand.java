package um.UDTADevelopment.reference;

import java.util.Random;

/**
 * Created by nija123098 on 9/19/2014.
 */
public class Rand {
    public static int Rand(int max){
        Random r = new Random();
        int rand = r.nextInt((max - 0) + 1) + 0;
        //rio.outi(rand);
            return rand;
    }
}
