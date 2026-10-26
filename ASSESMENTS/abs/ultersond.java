package abs;

public class ultersond extends medicalserves{
    int addetionalfee;// lacgta dheradka;
    ultersond(int sericeid,String serivecename,int  basecost,int addetionalfee){
        super(sericeid,serivecename,basecost);
        this.addetionalfee=addetionalfee;
    }

    @Override
    int totalcos() {
        return basecost+addetionalfee;
    }
}
