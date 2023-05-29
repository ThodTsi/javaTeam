public class DigitalType extends AdType{
    
    private int ppsMor, ppsNoon, ppsAfternoon, ppsNight;
    DigitalType(int code, String description, String afm, int ppsMor, int ppsNoon, int ppsAfternoon, int ppsNight){
        super(code,description,afm);
        this.ppsMor = ppsMor;
        this.ppsNoon = ppsNoon;
        this.ppsAfternoon = ppsAfternoon;
        this.ppsNight = ppsNight;
    }
}