
package com.mycompany.stack;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ModernizedEthiopianCalendarSystem {
     
    String  newyearfunc(int TeinteQemer){
        String result="";
     if(TeinteQemer==0){
        result= "monday";
     }  else if(TeinteQemer==1){
        result= "tuesday";
     }
        else if(TeinteQemer==2){
        result= "wednesday";
     }else if(TeinteQemer==3){
        result= "thursday";
     }else if(TeinteQemer==4){
        result= "friday";
     }else if(TeinteQemer==5){
        result= "saturday";
     }else if(TeinteQemer==6){
        result= "sunday";
     }
     return result;
    }
    
    String dayOFmetqiM(int metqie){
        String  dayOFmetqieIFnewyearONmonday="";
        
        
        
         
        int normal=metqie-1;
        int specificday=normal%7;
        if(specificday==0){
           dayOFmetqieIFnewyearONmonday="monday";
        }else  if(specificday==1){
            dayOFmetqieIFnewyearONmonday="tuesday";
        }else if(specificday==2){
            dayOFmetqieIFnewyearONmonday="wednesday";
        }else if(specificday==3){
            dayOFmetqieIFnewyearONmonday="thursday";
        }else if(specificday==4){
            dayOFmetqieIFnewyearONmonday="friday";
        }else if(specificday==5){
            dayOFmetqieIFnewyearONmonday="saturday";
        }else if(specificday==6){
            dayOFmetqieIFnewyearONmonday="sunday";
        }
        return dayOFmetqieIFnewyearONmonday;
    }
    String dayOFmetqiT(int metqie){
          String  dayOFmetqieIFnewyearONtuesday="";
        
        
        
         
        int normal=metqie-1;
        int specificday=normal%7;
        if(specificday==0){
           dayOFmetqieIFnewyearONtuesday="tuesday";
        }else  if(specificday==1){
            dayOFmetqieIFnewyearONtuesday="wednesday";
        }else if(specificday==2){
            dayOFmetqieIFnewyearONtuesday="thursday";
        }else if(specificday==3){
            dayOFmetqieIFnewyearONtuesday="friday";
        }else if(specificday==4){
            dayOFmetqieIFnewyearONtuesday="saturday";
        }else if(specificday==5){
            dayOFmetqieIFnewyearONtuesday="sunday";
        }else if(specificday==6){
            dayOFmetqieIFnewyearONtuesday="monday";
        }
        return dayOFmetqieIFnewyearONtuesday;
        
    }
      String dayOFmetqiW(int metqie){
          String  dayOFmetqieIFnewyearONwednesday="";
        
        
        
         
        int normal=metqie-1;
        int specificday=normal%7;
        if(specificday==0){
           dayOFmetqieIFnewyearONwednesday="wednesday";
        }else  if(specificday==1){
            dayOFmetqieIFnewyearONwednesday="thursday";
        }else if(specificday==2){
            dayOFmetqieIFnewyearONwednesday="friday";
        }else if(specificday==3){
            dayOFmetqieIFnewyearONwednesday="saturday";
        }else if(specificday==4){
            dayOFmetqieIFnewyearONwednesday="sunday";
        }else if(specificday==5){
            dayOFmetqieIFnewyearONwednesday="monday";
        }else if(specificday==6){
            dayOFmetqieIFnewyearONwednesday="tuesday";
        }
        return dayOFmetqieIFnewyearONwednesday;
        
    }
      
      String dayOFmetqiTH(int metqie){
          String  dayOFmetqieIFnewyearONthursday="";
        
        
        
         
        int normal=metqie-1;
        int specificday=normal%7;
        if(specificday==0){
           dayOFmetqieIFnewyearONthursday="thursday";
        }else  if(specificday==1){
            dayOFmetqieIFnewyearONthursday="friday";
        }else if(specificday==2){
            dayOFmetqieIFnewyearONthursday="saturday";
        }else if(specificday==3){
            dayOFmetqieIFnewyearONthursday="sunday";
        }else if(specificday==4){
            dayOFmetqieIFnewyearONthursday="monday";
        }else if(specificday==5){
            dayOFmetqieIFnewyearONthursday="tuesday";
        }else if(specificday==6){
            dayOFmetqieIFnewyearONthursday="wednesday";
        }
        return dayOFmetqieIFnewyearONthursday;
        
    }
    
            String dayOFmetqiF(int metqie){
          String  dayOFmetqieIFnewyearONfriday="";
        
        
        
         
        int normal=metqie-1;
        int specificday=normal%7;
        if(specificday==0){
           dayOFmetqieIFnewyearONfriday="friday";
        }else  if(specificday==1){
            dayOFmetqieIFnewyearONfriday="saturday";
        }else if(specificday==2){
            dayOFmetqieIFnewyearONfriday="sunday";
        }else if(specificday==3){
            dayOFmetqieIFnewyearONfriday="monday";
        }else if(specificday==4){
            dayOFmetqieIFnewyearONfriday="tuesday";
        }else if(specificday==5){
            dayOFmetqieIFnewyearONfriday="wednesday";
        }else if(specificday==6){
            dayOFmetqieIFnewyearONfriday="thursday";
        }
        return dayOFmetqieIFnewyearONfriday;
        
    }
         int dayOFmetqiS(int metqie)  {
             int normal,specificday=0;
             if(metqie>=14){
                     normal=metqie-1;
         specificday=normal%7;
             }else{
                    normal=metqie+29;
         specificday=normal%7;
             }
           
        return specificday;
         } 
         
    String metqiefunc(String newy,int metqie){
       String day1="";
          ModernizedEthiopianCalendarSystem obj=new ModernizedEthiopianCalendarSystem();
        if(newy.equals("monday")){
            int dayOFmetqiifSaturday=obj.dayOFmetqiS(metqie);
            if(dayOFmetqiifSaturday==0){
                day1="monday";
            } if(dayOFmetqiifSaturday==1){
                day1="tuesday";
            } if(dayOFmetqiifSaturday==2){
                day1="wednesday";
            } if(dayOFmetqiifSaturday==3){
                day1="thursday";
            } if(dayOFmetqiifSaturday==4){
                day1="friday";
            } if(dayOFmetqiifSaturday==5){
                day1="saturday";
            } if(dayOFmetqiifSaturday==6){
                day1="sunday";
            } }
        
        else if(newy.equals("tuesday")){
            int dayOFmetqiifSaturday=obj.dayOFmetqiS(metqie);
            if(dayOFmetqiifSaturday==0){
                day1="tuesday";
            } if(dayOFmetqiifSaturday==1){
                day1="wednesday";
            } if(dayOFmetqiifSaturday==2){
                day1="thursday";
            } if(dayOFmetqiifSaturday==3){
                day1="friday";
            } if(dayOFmetqiifSaturday==4){
                day1="saturday";
            } if(dayOFmetqiifSaturday==5){
                day1="sunday";
            } if(dayOFmetqiifSaturday==6){
                day1="monday";
            } }
        
        else if(newy.equals("wednesday")){
            int dayOFmetqiifSaturday=obj.dayOFmetqiS(metqie);
            if(dayOFmetqiifSaturday==0){
                day1="wednesday";
            } if(dayOFmetqiifSaturday==1){
                day1="thursday";
            } if(dayOFmetqiifSaturday==2){
                day1="friday";
            } if(dayOFmetqiifSaturday==3){
                day1="saturday";
            } if(dayOFmetqiifSaturday==4){
                day1="sunday";
            } if(dayOFmetqiifSaturday==5){
                day1="monday";
            } if(dayOFmetqiifSaturday==6){
                day1="tuesday";
            } }
        
        else if(newy.equals("thursday")){
            int dayOFmetqiifSaturday=obj.dayOFmetqiS(metqie);
            if(dayOFmetqiifSaturday==0){
                day1="thursday";
            } if(dayOFmetqiifSaturday==1){
                day1="friday";
            } if(dayOFmetqiifSaturday==2){
                day1="saturday";
            } if(dayOFmetqiifSaturday==3){
                day1="sunday";
            } if(dayOFmetqiifSaturday==4){
                day1="monday";
            } if(dayOFmetqiifSaturday==5){
                day1="tuesday";
            } if(dayOFmetqiifSaturday==6){
                day1="wednesday";
            } }
        
       else if(newy.equals("friday")){
            int dayOFmetqiifSaturday=obj.dayOFmetqiS(metqie);
            if(dayOFmetqiifSaturday==0){
                day1="friday";
            } if(dayOFmetqiifSaturday==1){
                day1="saturday";
            } if(dayOFmetqiifSaturday==2){
                day1="sunday";
            } if(dayOFmetqiifSaturday==3){
                day1="monday";
            } if(dayOFmetqiifSaturday==4){
                day1="tuesday";
            } if(dayOFmetqiifSaturday==5){
                day1="wednesday";
            } if(dayOFmetqiifSaturday==6){
                day1="thursday";
            }
               
        }
        
        else if(newy.equals("saturday")){
            int dayOFmetqiifSaturday=obj.dayOFmetqiS(metqie);
            if(dayOFmetqiifSaturday==0){
                day1="saturday";
            } if(dayOFmetqiifSaturday==1){
                day1="sunday";
            } if(dayOFmetqiifSaturday==2){
                day1="monday";
            } if(dayOFmetqiifSaturday==3){
                day1="tuesday";
            } if(dayOFmetqiifSaturday==4){
                day1="wednesday";
            } if(dayOFmetqiifSaturday==5){
                day1="thursday";
            } if(dayOFmetqiifSaturday==6){
                day1="friday";
            }
               
        }
        
        else if(newy.equals("sunday")){
           int dayOFmetqiifSunday=obj.dayOFmetqiS(metqie);
            if(dayOFmetqiifSunday==0){
                day1="sunday";
            } if(dayOFmetqiifSunday==1){
                day1="monday";
            } if(dayOFmetqiifSunday==2){
                day1="tuesday";
            } if(dayOFmetqiifSunday==3){
                day1="wednesday";
            } if(dayOFmetqiifSunday==4){
                day1="thursday";
            } if(dayOFmetqiifSunday==5){
                day1="friday";
            } if(dayOFmetqiifSunday==6){
                day1="saturday";
            }
               
        }
        return day1;
    }
    public static void main( String [] args){
          while(true){
              
              int ameteMhiret;int ameteAlem;
              System.out.println("________________________________________________________________________________________________________________");
         ModernizedEthiopianCalendarSystem obj=new ModernizedEthiopianCalendarSystem();
        
        
        int yearsBeforeBirthOfChrist=5500;
           ameteMhiret=Integer.parseInt(JOptionPane.showInputDialog("enter the year you want to know its fasting and celebrations in Ethiopian orthodox tewahdo church OR  '-1' to exit"));
           if(ameteMhiret==-1){
               return;
           }
                  ameteAlem=yearsBeforeBirthOfChrist+ameteMhiret;//amete alem
          
        int MeteneRabiet=ameteAlem/4;//MeteneRabiet is called metene rabbit
        int TeinteQemer=(yearsBeforeBirthOfChrist+ameteMhiret+MeteneRabiet)%7;//TeinteQemer to determine the date of any new year
        int wengel=ameteAlem%4;
           int Medeb=(ameteAlem%19);
                                                              
         int wenber=Medeb-1;//wenber called wenber, you should correct it later if (ameteAlem%19)=0
           if(Medeb==0){
              wenber=18;  
           } else{
              wenber=Medeb-1;  
           }

         int metqie=(wenber*19)%30;//metqi,it needs more info about bahire hasab
        if(Medeb==1){
             metqie=30;
        }
           if(metqie>14 ){
             String newy= obj.newyearfunc(TeinteQemer);
               System.out.println("new year of  "+ameteMhiret+" is on :"+newy);
               System.out.println("metiqi of  "+ameteMhiret+" is MESKEREM :"+metqie) ;   
           String dayofmetqie= obj.metqiefunc(newy,metqie);
              
           int dayofnenevhfast=obj.dayOFnenevehfast(dayofmetqie,metqie,ameteMhiret);
            System.out.println("specific day of nenewe "+dayofnenevhfast);
               System.out.println("metqi is on: "+dayofmetqie);
           }else{
                 String newy= obj.newyearfunc(TeinteQemer);
               System.out.println("new year of  "+ameteMhiret+" is on :"+newy);
                System.out.println("metiqi of  "+ameteMhiret+" is TIKIMT :"+metqie) ;  
                   String dayofmetqie= obj.metqiefunc(newy,metqie);

                   int dayofnenevhfast=obj.dayOFnenevehfast(dayofmetqie,metqie,ameteMhiret);
                       System.out.println("specific day of nenewe "+dayofnenevhfast);
                                          System.out.println("metqi is on: "+dayofmetqie);
           }
          }
    }
    
   int funcOFneneveh(int dayofneneveh,int ameteMhiret,int metqie) {
       ModernizedEthiopianCalendarSystem obj=new ModernizedEthiopianCalendarSystem();
  int dayofneneveh2;
            dayofneneveh2=dayofneneveh%30;
              
             
            if(metqie>=14){
                
            if(dayofneneveh<=30){
                System.out.println("nenewe fast of  "+ameteMhiret+"E.C  WAS/WILL began on Tir :"+dayofneneveh); 
               
                obj.dayofabiytsome(dayofneneveh,ameteMhiret,metqie,dayofneneveh2);
              
                
            }
            else{
                 System.out.println("nenewe fast of  "+ameteMhiret+"E.C  WAS/WILL began on Yekatit :"+dayofneneveh2);
                 obj.dayofabiytsome(dayofneneveh,ameteMhiret,metqie,dayofneneveh2);
            }
            
            }
            
            
            else{
                System.out.println("nenewe fast of  "+ameteMhiret+"E.C  WAS/WILL began on Yekatit :"+dayofneneveh2);
               obj.dayofabiytsome(dayofneneveh,ameteMhiret,metqie,dayofneneveh2);
            }
            return dayofneneveh2;
}
   int easterTR(int abiytsomay,int metqie,int ameteMhiret){
       int abyt=abiytsomay+55;
                System.out.println("easter of "+ameteMhiret+"E.C is /will/was on megabit :"+abyt%30);
              return abyt;  
   }
    int easterYK(int abiytsomay,int metqie,int ameteMhiret){
        int abyt=abiytsomay+55;
        int abyt2=abyt%30;
        if(abyt==60){
            System.out.println("easter of "+ameteMhiret+"E.C is /will/was on megabit :30");
        }else if(abyt<60 ){
            System.out.println("easter of "+ameteMhiret+"E.C is /will/was on megabit :"+abyt2);
        }else if(abyt>60){
            System.out.println("easter of "+ameteMhiret+"E.C is /will/was on miazia :"+abyt2);
        }
        return abyt2;
    }
   int dayofabiytsome(int dayofneneveh,int ameteMhiret,int metqie,int dayofneneveh2){
        Scanner sc=new Scanner(System.in);
         int abiytsomay=dayofneneveh+14;
          int abiytsomay2=dayofneneveh2+14;
          int aby=abiytsomay%30;
          ModernizedEthiopianCalendarSystem obj=new ModernizedEthiopianCalendarSystem();
       if(metqie>=14){
            if(dayofneneveh<=30&&abiytsomay<=30){
               System.out.println("aby tsome  fast of  "+ameteMhiret+"E.C  WAS/WILL began on Tir : "+abiytsomay); 
               obj.easterTR(abiytsomay,metqie,ameteMhiret);
           }else if(dayofneneveh<=30&&abiytsomay>30){
                System.out.println("aby tsome  fast of  "+ameteMhiret+"E.C  WAS/WILL began on Yekatit : "+aby); 
               obj.easterYK(aby,metqie,ameteMhiret);
           }else if(dayofneneveh>30&&abiytsomay<=30){
               System.out.println("aby tsome  fast of  "+ameteMhiret+"E.C  WAS/WILL began on Yekatit : "+abiytsomay2); 
                 obj.easterYK(abiytsomay2,metqie,ameteMhiret);
           } else if(dayofneneveh>30&&abiytsomay>30){
               System.out.println("aby tsome  fast of  "+ameteMhiret+"E.C  WAS/WILL began on Yekatit : "+abiytsomay2); 
                 obj.easterYK(abiytsomay2,metqie,ameteMhiret);
           } 
       }
       
       else{
           if(abiytsomay<=30){
               System.out.println("aby tsome fast of  "+ameteMhiret+"E.C  WAS/WILL began on Yekatit : "+abiytsomay); 
                obj.easterYK(abiytsomay,metqie,ameteMhiret);
           }else{
               System.out.println("aby tsome fast of  "+ameteMhiret+"E.C  WAS/WILL began on Megabit : "+abiytsomay%30); 
               int abyt=(abiytsomay%30)+55;
               if(abyt==60){
                    System.out.println("easter of "+ameteMhiret+"E.C is /will/was on miazia :30");
               }else{
                   System.out.println("easter of "+ameteMhiret+"E.C is /will/was on miazia :"+abyt%30);
               }
           }
       }
       return abiytsomay2;
   }
   
    int dayOFnenevehfast(String dayofmetqie,int metqie,int ameteMhiret){
        ModernizedEthiopianCalendarSystem obj=new ModernizedEthiopianCalendarSystem();
        int dayofneneveh=0,dayofneneveh2=0,nene=0;
        if(dayofmetqie.equals("monday")){
              dayofneneveh=6+metqie;
             nene=obj.funcOFneneveh(dayofneneveh,ameteMhiret,metqie);
        }else  if(dayofmetqie.equals("tuesday")){
             dayofneneveh=5+metqie;
            nene=obj.funcOFneneveh(dayofneneveh,ameteMhiret,metqie);
        }else  if(dayofmetqie.equals("wednesday")){
             dayofneneveh=4+metqie;
            nene=obj.funcOFneneveh(dayofneneveh,ameteMhiret,metqie);
        }else  if(dayofmetqie.equals("thursday")){
             dayofneneveh=3+metqie;
            nene=obj.funcOFneneveh(dayofneneveh,ameteMhiret,metqie);
        }else  if(dayofmetqie.equals("friday")){
             dayofneneveh=2+metqie;
            nene=obj.funcOFneneveh(dayofneneveh,ameteMhiret,metqie);
        }else  if(dayofmetqie.equals("saturday")){
             dayofneneveh=8+metqie;
            nene=obj.funcOFneneveh(dayofneneveh,ameteMhiret,metqie);
        }
        
        else  if(dayofmetqie.equals("sunday")){
             dayofneneveh=7+metqie;
            nene=obj.funcOFneneveh(dayofneneveh,ameteMhiret,metqie);
        }
        return nene;
    }
    
    
}
