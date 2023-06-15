public class Ad {

    private int code_type, code_prod, duration;
    private String details;

    Ad(int code_type, int code_prod, int duration, String details) {
        this.code_type = code_type;
        this.code_prod = code_prod;
        this.duration = duration;
        this.details = details;
    }

    public String toString() {
        return "Code of type: " + code_type + "\tCode of product: " + code_prod + "\tDuration in days: " + duration
                + "\tDetails: " + details + "\t";
    }

    public int getDur() {
        return duration;
    }

    public int getTypeCode() {
        return this.code_type;
    }

    public int getProdCode() {
        return this.code_prod;
    }

    public String toStringFile() {
        return "\tADV\n\t{\n\t\tADVTYPE_CODE " + code_type + "\n\t\tITEM_CODE " + code_prod + "\n\t\tDURATION "
                + duration + "\n\t\tJUSTIFICATION " + details;
    }

}