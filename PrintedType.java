public class PrintedType extends AdType{

    private int ppwFirst, ppwMid, ppwLast;
    PrintedType(int code, String description, String afm, int ppwFirst, int ppwMid, int ppwLast){
        super(code,description,afm);
        this.ppwFirst = ppwFirst;
        this.ppwMid = ppwMid;
        this.ppwLast = ppwLast;
    }
    
}