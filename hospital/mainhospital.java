package hospital;

public class mainhospital {
    public static void main(){
        System.out.println();
        outpatient o1=new outpatient( "zada",48,18);
        System.out.println("NAME: "+o1.name);
        System.out.println("LAB CHARG:$"  + o1.labcharg);
        System.out.println("FeeNumber:$"+o1.consulfee);
        System.out.println("TOTAL:$" + o1.calculatebill());

        System.out.println(" ");
        outpatient o2=new outpatient("faraxan",67,77);
        System.out.println("NAME:"+o2.name);
        System.out.println("LAB CHARG:$"  + o2.labcharg);
        System.out.println("FeeNumber:$"+o2.consulfee);
        System.out.println("TOTAL:$" + o2.calculatebill());

        System.out.println(" ");
        outpatient o3=new outpatient("zakriye",51,44);
        System.out.println("NAME:"+o1.name);
        System.out.println("LAB CHARG:$"  + o3.labcharg);
        System.out.println("FeeNumber:$"+o3.consulfee);
        System.out.println("TOTAL:$" + o3.calculatebill());

        System.out.println(" ");
        outpatient o4=new outpatient("sacdiyo",67,770);
        System.out.println("NAME:"+o4.name);
        System.out.println("LAB CHARG:$"  + o4.labcharg);
        System.out.println("feenumber:$"+o4.consulfee);
        System.out.println("TOTAL:$" + o4.calculatebill());


        System.out.println(" ");
        System.out.println(" ");

        inputpatient in=new inputpatient("ali",30,21,7);
        System.out.println("NAME:"+  in.name);
        System.out.println("CONSFUL:$"  + in.consulfee);
        System.out.println("Room Charge: $" + in.roomcharg);
        System.out.println("Number of Days: " + in.numberdays);
        System.out.println("Total Bill: $" +in.calculatebill());
        System.out.println("");

        inputpatient in2=new inputpatient("Abdi",5,40,9);
        System.out.println("NAME:"+  in2.name);
        System.out.println("CONSFUL:$"  + in2.consulfee);
        System.out.println("Room Charge: $" + in2.roomcharg);
        System.out.println("Number of Days: " + in2.numberdays);
        System.out.println("Total Bill: $" +in2.calculatebill());
        System.out.println("");

        inputpatient in3=new inputpatient("Halimo",7,68,8);
        System.out.println("NAME:"+  in3.name);
        System.out.println("CONSFUL: $"  + in3.consulfee);
        System.out.println("Room Charge: $" + in3.roomcharg);
        System.out.println("Number of Days: " + in3.numberdays);
        System.out.println("Total Bill: $" +in3.calculatebill());
        System.out.println("");

        inputpatient in4=new inputpatient("Xawo",8,50,10);
        System.out.println("NAME:"+  in4.name);
        System.out.println("CONSFUL: $"  + in4.consulfee);
        System.out.println("Room Charge: $" + in4.roomcharg);
        System.out.println("Number of Days: " + in4.numberdays);
        System.out.println("Total Bill: $" +in4.calculatebill());
        System.out.println("");

    }




    }

