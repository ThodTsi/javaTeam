class WebAd extends Ad{

    private int autoshow, extrap;
    
    WebAd(int code_type, int code_prod, int duration, String details, int autoshow, int extrap){
        super(code_type,code_prod,duration,details);
        this.autoshow = autoshow;
        this.extrap = extrap;
    }

    public String toString(){
        return super.toString() + "\tAutoshow: " + autoshow + "\tExtra pages: " + extrap + "\t" ;
    }

    public int getAuto(){
        return this.autoshow;
    }
    public int getExtra(){
        return this.extrap;
    }

    public String toStringFile(){
        return super.toStringFile() + "\n\t\tAUTOSHOW " + autoshow + "\n\t\tEXTRA_PAGES " + extrap + "\n\t\tTYPE Web\n\t}";
    }
}