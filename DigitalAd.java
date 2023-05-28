class DigitalAd extends Ad{
    private int dur_sec;
    private String timezone;
    DigitalAd(int code_type, int code_prod, int duration, int details, int dur_sec, String timezone){
        super(code_type,code_prod,duration,details);
        this.dur_sec = dur_sec;
        this.timezone = timezone;
    }

    public String toString(){
        return super.toString() + "/n" + "Duration in seconds: " + dur_sec + "/n" + "Timezone: " + timezone ;
    }
    
    public int getDur(){
        return dur_sec;
    }

    public String TimeZone(){
        return timezone;
    }

}