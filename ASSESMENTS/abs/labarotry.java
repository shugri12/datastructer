package abs;

public class labarotry extends medicalserves{
    int testcharg;//lcgta baritanka
    labarotry(int serviceid,String servename,int basecosty ,int testcharg){
        super(serviceid,servename,basecosty);
        this.testcharg=testcharg;
    }

    @Override
    int totalcos() {
        return basecost+testcharg;
    }
}
