public class Baggage {

    private int flightNumber;
    private float weight;
    private float size;
    private boolean isVIP;

    public Baggage(int flightNumber, float weight, float size, boolean isVIP) {
        this.flightNumber = flightNumber;
        this.weight = weight;
        this.size = size;
        this.isVIP = isVIP;
    }

    public int getFlightNumber() {

        return this.flightNumber;
    }

    public float getWeight() {

        return this.weight;
    }

    public float getSize() {

        return this.size;
    }

    public boolean getIsVIP() {

        return this.isVIP;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void setIsVIP(boolean isVip) {

        this.isVIP = isVip;
    }

    public String toString(){
        return "Flight number: "+this.flightNumber+" ,Weight -> "+this.weight+" ,Size -> "+this.size+",isVIP -> "+this.isVIP ;
    }

}