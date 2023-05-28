class DigitalAd extends Ad{
    private int dur_sec, timezone;
    DigitalAd(int code_type, int code_prod, int duration, int details, int dur_sec, int timezone){
        super(code_type,code_prod,duration,details);
        this.dur_sec = dur_sec;
        this.timezone = timezone;
    }

    public String toString(){
        return super.toString() + "/n" + "Duration in seconds: " + dur_sec + "/n" + "Timezone: " + timezone ;
    }




}