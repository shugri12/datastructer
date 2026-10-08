package hospital;

import java.util.Scanner;


    class inputpatient extends patient{
        Scanner input =new Scanner(System.in);
        double roomcharg;
        int numberdays;
        public inputpatient(String neme,double consulfee,double roomcharg,int numberdays){
            super(neme,consulfee);
            this.roomcharg=roomcharg;
            this.numberdays=numberdays;
        }

        double calculatebill() {
            return roomcharg * numberdays + consulfee;
        }



        }




