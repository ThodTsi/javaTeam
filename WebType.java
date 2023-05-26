public class WebType extends AdType{
    private int ppd, cost_auto, extrap_cost;
    WebType(int code, String description, String afm, int ppd, int cost_auto, int extrap_cost){
        super(code,description,afm);
        this.ppd = ppd;
        this.cost_auto = cost_auto;
        this.extrap_cost;
    }

}