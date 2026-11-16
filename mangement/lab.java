package mangement;

class Invalidepayment extends Exception {
        Invalidepayment(String massege) {
            super(massege);
        }
    }
    public abstract class lab {
        String studentid;
        String name;
        String program;
        int ammount = 0;
        int tution;


        lab(String studentid, String name, String program, int amont) {
            this.studentid = studentid;
            this.name = name;
            this.program = program;
            this.ammount = amont;
        }


        abstract int calculatetutionfe();


        void displayinfo() {
            System.out.println("studentid" + " " + studentid);
            System.out.println("STUDENTNAME" + "" + name);
            System.out.println("PROGRAM" + "" + program);
            System.out.println("AMOUNT" + ammount);
            System.out.println("TUTION" + "" + tution);
        }

        double getbalnce() {
            return calculatetutionfe() - ammount;
        }

        void payment(double amount) throws Invalidepayment {
            if (amount < 0) {
                throw new Invalidepayment("PAYMENT MUST MORE THAN ZERO");
            }
            if (ammount > getbalnce()) {
                throw new Invalidepayment("PAYMENT EXECED OUTSTANDING");
            }
            ammount += amount;
        }







         class undergatestudent extends lab {
            int credithours;


            undergatestudent(String studentid, String name, String program, int amount, int credithours) {
                super(studentid, name, program, amount);
                if (credithours < 0) {
                    throw new IllegalArgumentException("can nt be negative");
                }
                this.credithours = credithours;
            }









            @Override
            int calculatetutionfe() {
                return
                        tution = credithours * 25;
            }


            @Override
            void displayinfo() {
                super.displayinfo();
            }
        }


    }

    class masterstudent extends lab {
        int semesterfe;
        int reserchfe;

        masterstudent(String studentid, String name, int amount, int semesterfe, int resrchfe) {
            super(studentid, name, "master Student", amount);
            if (semesterfe < 0) {
                throw new IllegalArgumentException("INVALIDE SEMSTER FEE");
            }
            this.semesterfe = semesterfe;
            this.reserchfe = resrchfe;

        }


        @Override
        int calculatetutionfe() {
            return
                    tution = semesterfe + 100;
        }

        @Override
        void displayinfo() {
            super.displayinfo();
        }
    }

    class diplosment extends lab{
        int numberofcourses;

        diplosment(String studentid, String name, String program, int amount, int numberofcourses) {
            super(studentid, name, program, amount);
            this.numberofcourses = numberofcourses;

        }

        void validate() throws Invalidepayment {
            if (numberofcourses < 0) {
                System.out.println("number can not be nagative");
            }

        }

        @Override
        int calculatetutionfe() {
            return
                    numberofcourses * 40;
        }
    }

    class tutionsystem {


        static void proceespayment(lab I,double amount){
            System.out.println("studentid"+ I.studentid);
            System.out.println("PAYMONT AMUNT"+I.ammount);
            try {
                I.payment(amount);
                System.out.println("Payment Successful");
                System.out.println("Udate Blance: $"+I.getbalnce());
            }catch (Invalidepayment e){
                System.out.println("Payment Faild");
                System.out.println("Error:"+e.getMessage());
            }
            finally {
                System.out.println("Transction Compleatid");
            }
        }
    }
























