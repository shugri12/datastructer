package exception;

public class MAINEXCE {
    static void main() {
        System.out.println("===== EXAM REGISTRATION SYSTEM =====");
        studenetregist s1 = new studenetregist("juu221", "farax", 17, 77, 4);
        s1.rijest();
        s1.displayinfo();
        studenetregist s2 = new studenetregist("juu212", "ali", 21, 88, 3);
        s2.rijest();
        s2.displayinfo();
        studenetregist s3 = new studenetregist("juu233", "faizo", 22, 66, 2);
        s3.rijest();
        s3.displayinfo();
    }


    }

