package um.UDTADevelopment.reference;

import java.util.Scanner;

/**
 * Created by nija123098 on 9/1/2014.
 */
public class rio {

    public String ins(){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        //in.close();
        return input;
    }
    public boolean inb(){
        Scanner in = new Scanner(System.in);
        boolean input = in.nextBoolean();
        //in.close();
        return input;
    }
    public static int ini(){
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        //in.close();
        return input;
    }
    public static void out(String out){
        System.out.println(out);
    }
    public static void outi(int out){
        System.out.println(out);
    }
}