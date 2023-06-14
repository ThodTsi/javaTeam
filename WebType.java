public class WebType extends AdType{

    private int ppd, cost_auto, extrap_cost;
    
    WebType(int code, String description, String afm, int ppd, int cost_auto, int extrap_cost){
        super(code,description,afm);
        this.ppd = ppd;
        this.cost_auto = cost_auto;
        this.extrap_cost = extrap_cost;
    }

    public int cost(int autoshow, int extrapages, int duration){
        if(autoshow == 1){
            return ppd * duration + cost_auto + extrapages * extrap_cost;
        }else{
            return ppd * duration + extrapages * extrap_cost;
        }
    }

    public String toStringFile(){
        return super.toStringFile() + "\n\t\tTYPE Web\n\t\tPRICE_PER_DAY " + ppd + "\n\t\tAUTOSHOW_COST " + cost_auto + "\n\t\tEXTRA_PAGES_COST " + extrap_cost + "\n\t}";
    }

}