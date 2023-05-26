class PrintedAd extends Ad{
    private int words, position;
    Ad(int code_type, int code_prod, int duration, String detail, int words, int position){
        super(code_type,code_prod,duration,detail);
        this.words = words;
        this.position = position;


    }
}