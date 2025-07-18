package JavaPractice.Question24;

public class Prescription {
    private  Medicine medicine;
    public boolean status;
    private String usage;
    public Prescription(String usage,Medicine medicine){
        this.usage=usage;
        this.medicine=medicine;
        this.status=false;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getUsage() {
        return usage;
    }

    public Medicine getMedicine() {
        return medicine;
    }

}
