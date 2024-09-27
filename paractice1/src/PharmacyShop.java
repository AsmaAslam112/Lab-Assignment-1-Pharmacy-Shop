public class PharmacyShop {
    private Address address;
    private Medicine medicines;
    private int medicineCount;
    private Person owner;

    public PharmacyShop(Address address, Medicine medicines, int medicineCount) {
        this.address = address;
        this.medicines = medicines;
        this.medicineCount = medicineCount;

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Medicine getMedicines() {
        return medicines;
    }

    public void setMedicines(Medicine medicines) {
        this.medicines = medicines;
    }

    public int getMedicineCount() {
        return medicineCount;
    }

    public void setMedicineCount(int medicineCount) {
        this.medicineCount = medicineCount;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Medicine[] getList() {
        return list;
    }

    public void setList(Medicine[] list) {
        this.list = list;
    }

    Medicine[] list = new Medicine[100];

    {
        list[0] = new Medicine("M001", "B123", "PharmaCoper", new Date(15, 8, 2025), 100, "Paracetamol", 50.0);
        list[1] = new Medicine("M002", "B124", "HealthMed", new Date(10, 12, 2024), 80, "Ibuprofen", 75.0);
        list[2] = new Medicine("M003", "B124", "BioPharma", new Date(20, 5, 2026), 50, "Amoxicilin", 120.0);
    }

    public String searchMedicinebyid(String Id) {
        int i;
        for (i = 0; i < list.length; i++) {
            if (list[i].getMedicineid().equals(Id))
                return "Medicine found";
        }
        return  "";
    }

    public String searchbyMedicinename(String name) {
        int i;
        for (i = 0; i < list.length; i++) {
            if (list[i].getName().equals(name))
                return "name";
        }

        return "";
    }
}