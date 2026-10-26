package testrr;

public class subclassfulltime extends employesalry {
    double allowance;//LACGTA DHERADKA

    subclassfulltime(String NAME, int employeid, double basicsalry, String deprtement ,double allowance,String category) {
        super(NAME, employeid, basicsalry,deprtement ,category);
        {
            this.allowance = allowance;
        }

    }

    @Override
    double calculatesalary() {

       return basicsalry + allowance;

    }

    @Override
    void displayinfo() {
        super.displayinfo();{

        }
    }
}
