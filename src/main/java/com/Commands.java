package com;

import dataBase.DataBaseCommands;
import models.Medicine;

import static com.ReadDataFromUser.*;
import static dataBase.DataBaseCommands.*;

public class Commands {

    public static void addMedicineToDataBase() {
        displayMessage("Enter medicine's name:");
        String medicineName = readStringFromUser();
        displayMessage("Enter medicine's price:");
        double medicinePrice = readDoubleFromUser();
        sendNewMedicineToDataBase(new Medicine(medicineName, medicinePrice));
    }

    public static void removeMedicineFromDataBase() {
        displayMessage("Enter medicine's name to remove:");
        String medicineName = readStringFromUser();
        DataBaseCommands.removeMedicineFromDataBase(medicineName);
    }

    private static void displayMessage(String message) {
        System.out.println(message);
    }
}
