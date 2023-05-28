public class Ad{
    private int code_type, code_prod, duration, detail;
    Ad(int code_type, int code_prod, int duration, int detail){
        this.code_type = code_type;
        this.code_prod = code_prod;
        this.duration = duration;
        this.detail = detail;
    }

    public String toString(){
        return "Code of type: " + code_type + "/n" + "Code of product: " + code_prod + "/n" + "Duration in days: " + duration + "/n" + "Details: " + detail; 
    }




}