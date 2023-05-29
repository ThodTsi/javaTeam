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
        if(timezone.equals("Morning")){
            c = ppsMor;
        }else if(timezone.equals("Noon")){
            c = ppsNoon;
        }else if(timezone.equals("Afternoon")){
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