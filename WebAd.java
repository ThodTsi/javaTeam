class WebAd extends Ad{
    private int autoshow, extrap;
    WebAd(int code_type, int code_prod, int duration, int detail, int autoshow, int extrap){
        super(code_type,code_prod,duration);
        int autoshow = autoshow;
        int extrap = extrap;
    }
}