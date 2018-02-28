import java.sql.Connection;
import java.sql.PreparedStatement;

public class DataBaseCommands {

    public static void sendNewMedicineToDataBase(Medicine medicine) {
        try {
            Connection connection = DataBaseConnector.connection();
            PreparedStatement create =
                    connection.prepareStatement("INSERT INTO ListOfMedicines ( MedicineName, MedicinePrice) VALUES (?,?)");
            //create.setInt(1, );
            create.setString(1, medicine.getMedicineName());
            create.setDouble(2, medicine.getMedicinePrice());
            create.executeUpdate();
            System.out.println("Added record");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void removeMedicineFromDataBase() {

    }
}

