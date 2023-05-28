class PrintedAd extends Ad{
    private int words, position;
    PrintedAd(int code_type, int code_prod, int duration, int detail, int words, int position){
        super(code_type,code_prod,duration,detail);
        this.words = words;
        this.position = position;


    }

    public String toString(){
        return super.toString() + "/n" + "Words: " + words + "/n" + "Position: " + position ;
    }

}