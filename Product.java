public class Product{

    private int code;
    private String afm,description;
    
    Product(int code, String afm, String description){
        this.code = code;
        this.afm = afm;
        this.description = description;

    }

    public int getCode(){
        return this.code;
    }

    public String toString(){
        return "Code:\t" + this.code + "\tAFM:\t" + this.afm + "\tDescription:\t" + this.description;
    }
}