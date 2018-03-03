package dataBase;

import models.Medicine;

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

    public static void removeMedicineFromDataBase(String medicineName) {

        try {
            Connection connection = DataBaseConnector.connection();
            PreparedStatement preparedStatement =
                    connection.prepareStatement(" DELETE FROM  ListOfMedicines WHERE MedicineName = ?");
            preparedStatement.setString(1, medicineName);
            preparedStatement.executeUpdate();
            System.out.println("Removed record");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void changeMedicinePrice(String medicineName, double newPrice) {
        try {
            Connection connection = DataBaseConnector.connection();
            PreparedStatement preparedStatement =
                    connection.prepareStatement(" UPDATE ListOfMedicines SET MedicinePrice = ? WHERE MedicineName = ?");
            preparedStatement.setDouble(1,newPrice);
            preparedStatement.setString(2, medicineName);
            preparedStatement.executeUpdate();
            System.out.println("Price changed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

