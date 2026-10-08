package hospital;

import java.util.Scanner;


     class   outpatient extends patient {
         double labcharg;

         public outpatient(String name, double consfulfree, double labcharg) {
             super(name, consfulfree);
             this.labcharg = labcharg;
         }

         public double calculatebill() {
             return labcharg + consulfee;
         }




        }










