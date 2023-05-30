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
}