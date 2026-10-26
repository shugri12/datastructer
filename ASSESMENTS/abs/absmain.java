package abs;

public class absmain {
    static void main(){
        medicalserves ab1=new consulution(123,"consulition",20,22);
        ab1.totalcos();
        ab1.disblayserviceinfo();
        System.out.println("  ");
        medicalserves ab2=new ultersond(2344,"ultersond",23,32);
        ab1.totalcos();
        ab2.disblayserviceinfo();
        System.out.println("   ");
        medicalserves ab3=new labarotry(4555,"labrotry",88,88);
        ab3.totalcos();
        ab3.disblayserviceinfo();
        double total=0;
        total+=ab1.totalcos()+ab2.totalcos()+ab3.totalcos();
        System.out.println(" - - -----");
        System.out.println("TOTAL HOSPITAL$"+" "+total);




    }



}




