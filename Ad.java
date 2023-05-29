public class Ad{
    private int code_type, code_prod, duration;
    private String details;
    Ad(int code_type, int code_prod, int duration, String details){
        this.code_type = code_type;
        this.code_prod = code_prod;
        this.duration = duration;
        this.details = details;
    }

    public String toString(){
        return "Code of type: " + code_type + "\nCode of product: " + code_prod + "\nDuration in days: " + duration + "\nDetails: " + details; 
    }

    public int getDur(){
        return this.duration;
    }

    public int getTypeCode(){
        return this.code_type;
    }



}