package mangement;

public class mainlab {
    static void main(String[] args){
        lab[] obj=new lab[6];
        obj[0]=new undergatestudent("JU001","Zada",300,18);
        obj[1]=new masterstudent("JU003","HASAN",500,800,80);
        obj[2]=new diplosment("JU005","OMAR","bach",240,6);
        obj[3]=new un("JU106","ALI",350,9);
        obj[4]=new masterstudent("JU189"," Ahmaed",900,100,900);
        obj[5]=new diplosment("JU121","Aisha Ahmad","devolp",788,99);

        System.out.println("-------Students------");

        for (lab o:obj){
            System.out.println(" ");
            o.displayinfo();
            System.out.println(" ");
        }

        System.out.println("---PAYMENT PROCESSING");
        proceespayment  (obj[0] ,100);

        System.out.println("---INVALID PAYMENT---");
        ProcessPayment(obj[2],1000 );

        double total=0,totalpaid=0,totalBlance=0;
        for (lab o:obj){

            total+=o.calculatetutionfe();
            totalpaid+=o.ammount;
            totalBlance+=o.getbalnce();
        }
        System.out.println("---FINANCIAL SUMMARY---");
        System.out.println("Total Tution: $"+total);
        System.out.println("Total Payments: $"+totalpaid);
        System.out.println("Total Blance: $"+totalBlance);


    }
}

