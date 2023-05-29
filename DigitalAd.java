class DigitalAd extends Ad{
    private int dur_sec, timezone;
    DigitalAd(int code_type, int code_prod, int duration, String details, int dur_sec, int timezone){
        super(code_type,code_prod,duration,details);
        this.dur_sec = dur_sec;
        this.timezone = timezone;
    }

    public String toString(){
        return super.toString() + "/nDuration in seconds: " + dur_sec + "/nTimezone: " + timezone ;
    }




}