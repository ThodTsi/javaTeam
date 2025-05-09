public class AdType {

    private int code;
    private String description, afm;

    AdType(int code, String description, String afm) {
        this.code = code;
        this.description = description;
        this.afm = afm;
    }

    public String getAfm() {
        return this.afm;
    }

    public int getCode() {
        return this.code;
    }

    public String toStringFile() {
        return "\tADVTYPE\n\t{\n\t\tCODE " + code + "\n\t\tDESCR " + description + "\n\t\tAFM " + afm;
    }

}