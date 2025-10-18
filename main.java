package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Smartphone sm = new Smartphone();
        Smartphone.Camera cp = sm.new Camera();
   
        System.out.println("LETS START TAKING PICTURES!!");
        System.out.println("----------------------------");
        
        System.out.println("CLICK Q TO TAKE A PIC");
        String inputQ = sc.nextLine();
        
        
        while(inputQ.equalsIgnoreCase("Q") && sm.getBat() != 0){
        cp.takephoto();
        System.out.println("------------------------");
            System.out.println("CLICK Q TO TAKE A PIC AGAIN");
              System.out.println("CLICK W TO EXIT");
              System.out.println("------------------------");
            inputQ = sc.nextLine();
             sm.getBatteryStatus();
        }
                      System.out.println("------------------------");
if(sm.getBat()== 0){
        System.out.println("YOU CANT TAKE ANOTHER PICTURE(ZERO BAT!)");
}
        
        
        
        sm.getBatteryStatus();
  
        
        // TODO code application logic here
    }
}
