public class Medicine {

    private String medicineName;
    private double medicinePrice;

    public Medicine(String medicineName, double medicinePrice) {
        this.medicineName = medicineName;
        this.medicinePrice = medicinePrice;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public double getMedicinePrice() {
        return medicinePrice;
    }

    public void setMedicinePrice(double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }
}
