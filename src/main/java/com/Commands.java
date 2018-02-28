package com;

import dataBase.DataBaseCommands;
import models.Medicine;

public class Commands {

    public static void addMedicineToDataBase() {
        displayMessage("Enter medicine's name:");
        String medicineName = ReadDataFromUser.readStringFromUser();
        displayMessage("Enter medicine's price:");
        int medicinePrice = ReadDataFromUser.readNumberFromUser();
        DataBaseCommands.sendNewMedicineToDataBase(new Medicine(medicineName, medicinePrice));
    }

    public static void removeMedicineFromDataBase() {

    }

    private static void displayMessage(String message) {
        System.out.println(message);
    }
}
