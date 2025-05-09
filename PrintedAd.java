class PrintedAd extends Ad{

    private int words;
    private String position;

    PrintedAd(int code_type, int code_prod, int duration, String details, int words, String position){
        super(code_type,code_prod,duration,details);
        this.words = words;
        this.position = position;


    }

    public String toString(){
        return super.toString() + "\tWords: " + words + "\tPosition: " + position + "\t";
    }

    public int getWords(){
        return this.words;
    }

    public String getPosition(){
        return this.position;
    }

    public String toStringFile(){
        return super.toStringFile() + "\n\t\tTYPE Print\n\t\tWORDS " + words + "\n\t\tPOSITION " + position + "\n\t}";
    }

}