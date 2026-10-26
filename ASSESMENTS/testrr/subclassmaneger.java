package testrr;

public class subclassmaneger extends employesalry{
    int bouns;//faidada
    subclassmaneger(String NAME,int employeid,double basicsalry,String depertement,int bouns,String category){
        super(NAME,employeid,basicsalry,depertement,category);
        this.bouns=bouns;
    }

    @Override
    double calculatesalary() {

       return basicsalry+bouns;
    }

    @Override
    void displayinfo() {
        super.displayinfo();

    }
}

