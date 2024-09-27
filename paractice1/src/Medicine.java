public class Medicine {
    private String medicineid;
    private String batchNumber;
    private String manufacturer;
    private Date expiryDate;
    private int quantity;
    private String name;
    private double price;

    public Medicine(String medicineid, String batchNumber, String manufacturer, Date expiryDate, int quantity, String name, double price) {
        this.medicineid = medicineid;
        this.batchNumber = batchNumber;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public String getMedicineid() {
        return medicineid;
    }

    public void setMedicineid(String medicineid) {
        this.medicineid = medicineid;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "medicineid='" + medicineid + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", expiryDate=" + expiryDate +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
