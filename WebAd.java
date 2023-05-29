class WebAd extends Ad{
    private int autoshow, extrap;
    WebAd(int code_type, int code_prod, int duration, String details, int autoshow, int extrap){
        super(code_type,code_prod,duration,details);
        this.autoshow = autoshow;
        this.extrap = extrap;
    }

    public String toString(){
        return super.toString() + "\nAutoshow: " + autoshow + "\nExtra pages: " + extrap ;
    }

    public String getAuto(){
        return this.autoshow;
    }
    public String getExtra(){
        return this.extrap;
    }

}