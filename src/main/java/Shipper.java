public class Shipper {
    private String shipperName;
    private String shipperPhone;
    private int shipperID;

    public Shipper(String shipperName, String shipperPhone, Integer shipperID){
        this.shipperName = shipperName;
        this.shipperPhone = shipperPhone;
        this.shipperID = shipperID;
    }

    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public String getShipperPhone() {
        return shipperPhone;
    }

    public void setShipperPhone(String shipperPhone) {
        this.shipperPhone = shipperPhone;
    }

    public int getShipperID() {
        return shipperID;
    }

    public void setShipperID(int shipperID) {
        this.shipperID = shipperID;
    }


}
