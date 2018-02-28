import java.sql.Connection;
import java.sql.PreparedStatement;

public class DataBaseCommands {

    public static void sendNewMedicineToDataBase(Medicine medicine) {
        try {
            Connection connection = DataBaseConnector.connection();
            PreparedStatement preparedStatement =
                    connection.prepareStatement("INSERT INTO ListOfMedicines ( MedicineName, MedicinePrice) VALUES (?,?)");
            preparedStatement.setString(1, medicine.getMedicineName());
            preparedStatement.setDouble(2, medicine.getMedicinePrice());
            preparedStatement.executeUpdate();
            System.out.println("Added record");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void removeMedicineFromDataBase() {

    }
}

