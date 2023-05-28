class WebAd extends Ad{
    private int autoshow, extrap;
    WebAd(int code_type, int code_prod, int duration, int detail, int autoshow, int extrap){
        super(code_type,code_prod,duration,detail);
        this.autoshow = autoshow;
        this.extrap = extrap;
    }

    public String toString(){
        return super.toString() + "/n" + "Autoshow: " + autoshow + "/n" + "Extra pages: " + extrap ;
    }



}