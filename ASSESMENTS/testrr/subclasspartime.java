package testrr;

public class subclasspartime extends employesalry {
    int hoursworked;// INTA SACAD UU SHAQEYO QOFKA
    int hourlyrate;// SACDI INTA LACGA UU KUSHAQEYO

    subclasspartime(String NAME, int employeid, double basicsalry, String depertement, int hoursworked, int hourlyrate, String category) {
        super(NAME, employeid, basicsalry, depertement, category);
        this.hoursworked = hoursworked;
        this.hourlyrate = hourlyrate;
    }

    @Override
    double calculatesalary() {
        return hoursworked * hourlyrate;
    }

    @Override
    void displayinfo() {
        super.displayinfo();
        {


        }
    }
}
