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
        return "Code: " + this.code + "\tAFM: " + this.afm + "\tDescription: " + this.description ;
    }

    public String toStringFile(){
        return "\n\tITEM\n\t{\n\t\tCODE " + code + "\n\t\tDESCR " + description + "\n\t\tSUPPLIER_AFM " + afm + "\n\t}" ;
    }

}