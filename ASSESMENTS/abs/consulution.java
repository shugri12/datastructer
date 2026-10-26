package abs;

public  class consulution extends medicalserves {
    int dectorfee;// lacgta dhakhtrka
    consulution(int  serviceid,String servename,int basecost ,int dectorfee){
        super(serviceid,servename,basecost);
        this.dectorfee=dectorfee;
    }


    @Override
    int totalcos() {
        return basecost+dectorfee;
    }
}
