package atm;

import java.util.*;

public class Atm {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String pin = "0010 0100";
        String Try;
        String pass;
        int ulang =1;
        boolean done = false;


        do {
            System.out.println("Masukan "+ulang++);
            pass = n.nextLine();
            if(!pass.equals(pin)){
            
            }else{
                done = true;
            }
        } while (ulang <=3 && !done);
        if(done)
        {
            System.out.println("Tempat sekali");
        }else{
            System.out.println("Atm Terblokir");
        }
    }
}
