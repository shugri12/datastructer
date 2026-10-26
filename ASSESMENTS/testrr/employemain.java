package testrr;

public class employemain {
    static void main() {
        employesalry[] e = {
                new subclassfulltime("farxiyo", 133, 200, "it", 222, "full_time"),
        new subclasspartime("zada", 133, 1200, "natwork", 24, 120, "part_time"),
        new subclassmaneger("caisho", 2344, 233, "multimedia", 22, "maneger")
};

        System.out.println("EMPLOYE SALRY REPORT");
        System.out.println();

        for (employesalry emp : e){
            emp.displayinfo();
            System.out.println();


    }
    }
}