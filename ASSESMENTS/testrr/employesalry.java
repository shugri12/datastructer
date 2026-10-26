package testrr;

public class employesalry {
    String NAME;
    int employeID;
    double basicsalry;
    String departement;
    String category;

    employesalry(String NAME, int employeID, double basicsalry, String departement , String category) {
        this.NAME = NAME;
        this.employeID = employeID;
        this.basicsalry = basicsalry;
        this.departement = departement;
        this.category=category;

    }

    double calculatesalary() {
        return basicsalry;

    }
        void displayinfo () {
            System.out.println("name" + " " + NAME);
            System.out.println("employeid"+"  " + employeID);
            System.out.println("basicsalry  $  "+ " " +basicsalry);
            System.out.println("DEPERTEMENT"+"  "  +departement);
            System.out.println("category"+ "  "+category);


        }

    }


