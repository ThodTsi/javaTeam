public class DigitalType extends AdType{
    
    private int ppsMor, ppsNoon, ppsAfternoon, ppsNight;
    DigitalType(int code, String description, String afm, int ppsMor, int ppsNoon, int ppsAfternoon, int ppsNight){
        super(code,description,afm);
        this.ppsMor = ppsMor;
        this.ppsNoon = ppsNoon;
        this.ppsAfternoon = ppsAfternoon;
        this.ppsNight = ppsNight;
    }

    public int cost(int dur, String timezone,int days){
        int c;
        if(timezone=="Morning"){
            c = ppsMor;
        }else if(timezone=="Noon"){
            c = ppsNoon;
        }else if(timezone=="Afternoon"){
            c = ppsAfternoon;
        }else{
            c = ppsNight;
        }
        return c*dur*days;
    }


    public String getClassName(){
        return this.getClass().getSimpleName();
    }

}