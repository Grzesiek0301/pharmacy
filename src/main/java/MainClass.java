public class MainClass {
    public static void main(String[] args) {

        Medicine apap = new Medicine("Apap", 20);

        DataBaseCommands.sendNewMedicineToDataBase(apap);

    }
}
