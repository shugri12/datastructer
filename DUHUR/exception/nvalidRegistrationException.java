package exception;

public class nvalidRegistrationException extends Exception {

    nvalidRegistrationException(String message) {
        super(message);

    }
}
class studenetregist{
    String studentid;
    String studentname;
    int age;
    double examinationmark;
    int subject;

studenetregist(String  studentid,String studentname,int age,double examinationmark,int subject){
    this.studentid=studentid;
    this.studentname=studentname;
    this.age=age;
    this.examinationmark=examinationmark;
    this.subject=subject;

}
void validate()throws  nvalidRegistrationException{
    if(examinationmark<0||examinationmark>100){
        throw new  nvalidRegistrationException("exam mark must be betwen 1 and 100");
    }
    if(age<18){
        throw  new nvalidRegistrationException("age atlest 18");
    }
    if(subject<1 ||subject>5){
        throw  new  nvalidRegistrationException("subject must be betwen 1 and 5");
    }
    if(studentid.isEmpty()|| studentid==null){
        throw new nvalidRegistrationException("student cannot empty");
    }

}
void displayinfo(){
    System.out.println("STUDENTID"+" "+studentid);
    System.out.println("STUDENTNAME"+" "+studentname);
    System.out.println("AGE"+" "+age);
    System.out.println("EXAMINATIONMARK"+" "+ examinationmark);
    System.out.println("SUBJECT"+" "+subject);
}
void rijest(){
    try {
        validate();
        displayinfo();
    } catch (nvalidRegistrationException e){
        System.out.println("REGISTER EXEPTION");
        System.out.println("ERROR"+e.getMessage());
    }
    finally {
        System.out.println("REGISTRION ATTEMEP COMPLETED");
    }

}

}