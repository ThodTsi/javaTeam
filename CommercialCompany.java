public class CommercialCompany{
    private String afm, name;
    
    CommercialCompany(String afm, String name){
        this.afm = afm;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getAfm(){
        return this.afm;
    }

}