package hospital;

public class patient {
    String name;
    double  consulfee;//lanbarka laso janayo
    public patient(String name,double consulfee){
        this.name=name;
        this.consulfee=consulfee;
    }
     void displayinfo(){
        System.out.println("PATIENTNAME"+name);
        System.out.println("PIILAMOUNT"+consulfee);


    }


}
