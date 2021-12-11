package owlcounter;

public class CountyOwlData {
    private String countyName;
    private int owlNumber;

    public CountyOwlData(String countyName, int owlNumber) {
        this.countyName = countyName;
        this.owlNumber = owlNumber;
    }

    public String getCountyName() {
        return countyName;
    }

    public int getOwlNumber() {
        return owlNumber;
    }
}
