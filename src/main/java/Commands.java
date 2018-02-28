public class Commands {

    public void addMedicineToDataBase() {
        displayMessage("Enter medicine's name:");
        String medicineName = ReadDataFromUser.readStringFromUser();
        displayMessage("Enter medicine's price:");
        int medicinePrice = ReadDataFromUser.readNumberFromUser();
        DataBaseCommands.sendNewMedicineToDataBase(new Medicine(medicineName, medicinePrice));
    }

    public void removeMedicineFromDataBase(){

    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
