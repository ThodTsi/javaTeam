class PrintedAd extends Ad{
    private int words, position;
    PrintedAd(int code_type, int code_prod, int duration, int details, int words, String position){
        super(code_type,code_prod,duration,details);
        this.words = words;
        this.position = position;


    }

    public String toString(){
        return super.toString() + "/n" + "Words: " + words + "/n" + "Position: " + position ;
    }

    public int getWords(){
        return this.words;
    }

    public int getPosition(){
        return this.position;
    }

    public int getDur(){
        return this.duration;
    }


}