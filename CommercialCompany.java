public class CommercialCompany{
    
    private String afm, name;
    
    CommercialCompany(String afm, String name){
        this.afm = afm;
        this.name = name;
    }

    public String toString(){
        return "Afm:\t" + afm  + "\tName:\t" + name;
    }

    public String getAfm(){
        return this.afm;
    }

    public String getName(){
        return this.name;
    }

    private void createFile(String, ArrayList<String> CommercialCompany){
        throws IOException {
            FileWriter writer = new FileWriter(file + ".txt");
            int size = CommercialCompany.size()
            for (int i = 0;i<size;i++){
                writer.write("AFM: " + CommercialCompany.getAfm() + "\nName: " + CommercialCompany.getName());
            } 
            writer.close();

        }
        
    }

    public String toStringFile(){
        return "\n\tCOMPANY\n\t{\n\t\tNAME " + name + "\n\t\tAFM " + afm ;
    }

}