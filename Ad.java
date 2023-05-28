public class Ad{
    private int code_type, code_prod, duration, details;
    Ad(int code_type, int code_prod, int duration, int details){
        this.code_type = code_type;
        this.code_prod = code_prod;
        this.duration = duration;
        this.details = details;
    }

    public String toString(){
        return "Code of type: " + code_type + "/n" + "Code of product: " + code_prod + "/n" + "Duration in days: " + duration + "/n" + "Details: " + details; 
    }

    public int getDuration(){
        return duration;
    }



}