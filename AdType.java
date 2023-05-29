public class AdType {

    private int code;
    private String description,afm;
    AdType(int code,String description, String afm){
        this.code = code;
        this.description = description;
        this.afm = afm;
    }

    public String getAfm(){
        return this.afm;
    }

    public int getCode(){
        return this.code;
    }
    
    public String getClassName(){
        return this.getClass().getSimpleName();
    }

}