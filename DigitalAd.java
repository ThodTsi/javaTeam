class DigitalAd extends Ad{

    private int dur_sec;
    private String timezone;

    DigitalAd(int code_type, int code_prod, int duration, String details, int dur_sec, String timezone){
        super(code_type,code_prod,duration,details);
        this.dur_sec = dur_sec;
        this.timezone = timezone;
    }

    public String toString(){
        return super.toString() + "\tDuration in seconds: " + dur_sec + "\tTimezone: " + timezone + "\t";
    }
    

    public String getTimezone(){
        return this.timezone;
    }

    public int getDursec(){
        return this.dur_sec;
    }

    public String toStringFile(){
        return super.toStringFile() + "\n\t\tDURATION_IN_SECONDS " + dur_sec + "\n\t\tTIMEZONE " + timezone + "\n\t\tTYPE Digital\n\t}";
    }

}