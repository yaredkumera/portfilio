
package com.mycompany.siunitconverter;

import java.util.Scanner;

public class SiUnitConverter {

    public static void main(String[] args) {
        Scanner c=new   Scanner(System.in);
        int b=1;
        while(b==1){
             
        System.out.println("in  what    unit    do  you want to enter   the measurment?(K.M,M,CM,DM)");
        String measure=c.nextLine();
        System.out.println("enter   the size    in  "+measure);
        double  value=c.nextDouble();
         c.nextLine();
    if(measure.equals("KM")||measure.equals("km")){
            System.out.println(value+measure+"="+(1000*value)+"m");
            System.out.println(value+measure+"="+(100000*value)+"cm");
            System.out.println(value+measure+"="+(1000000*value)+"dm");
        }  
    else    if(measure.equals("m")||measure.equals("M")){
            System.out.println(value+measure+"="+(value/1000)+"km");
            System.out.println(value+measure+"="+(100*value)+"cm");
            System.out.println(value+measure+"="+(1000*value)+"dm");}
    else    if(measure.equals("cm")||measure.equals("CM")){
            System.out.println(value+measure+"="+(value/100000)+"km");
            System.out.println(value+measure+"="+(value/100)+"m");
            System.out.println(value+measure+"="+(10*value)+"dm");}
    else    if(measure.equals("dm")||measure.equals("DM")){
            System.out.println(value+measure+"="+(value/1000000)+"km");
            System.out.println(value+measure+"="+(value/1000)+"m");
            System.out.println(value+measure+"="+(value/10)+"cm");}
  
            System.out.println("do you try in another unit? if yes press '1' ,otherwise press any key");
             b=c.nextInt();
            if(b==1){
                
            }else{
                return;
            }
            
              c.nextLine();
        }
        
    
    }
}
