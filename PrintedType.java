public class PrintedType extends AdType{

    private int ppwFirst, ppwMid, ppwLast;
    PrintedType(int code, String description, String afm, int ppwFirst, int ppwMid, int ppwLast){
        super(code,description,afm);
        this.ppwFirst = ppwFirst;
        this.ppwMid = ppwMid;
        this.ppwLast = ppwLast;
    }

    public int cost(int words, String pos, int dur){
        if (pos.equals("First")){
            return ppwFirst * words * dur;
        }else if(pos.equals("Mid")){
            return ppwMid * words * dur;
        }else{
            return ppwLast * words * dur;
        }
    }

    public String getClassName(){
        return this.getClass().getSimpleName();
    }
    
}