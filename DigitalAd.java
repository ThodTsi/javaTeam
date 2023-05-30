class DigitalAd extends Ad{

    private int dur_sec;
    private String timezone;

    DigitalAd(int code_type, int code_prod, int duration, String details, int dur_sec, String timezone){
        super(code_type,code_prod,duration,details);
        this.dur_sec = dur_sec;
        this.timezone = timezone;
    }

    public String toString(){
        return super.toString() + "\tDuration in seconds: " + dur_sec + "\tTimezone: " + timezone ;
    }
    

    public String getTimezone(){
        return this.timezone;
    }

    public int getDursec(){
        return this.dur_sec;
    }





}