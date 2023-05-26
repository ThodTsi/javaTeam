class DigitalAd extends Ad{
    private int dur_sec, timezone;
    DigitalAd(int code_type, int code_prod, int duration, int detail, int dur_sec, int timezone){
        super(code_type,code_prod,duration);
        this.dur_sec = dur_sec;
        this.timezone = timezone;
    }
}