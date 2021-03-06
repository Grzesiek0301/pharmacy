package com;

import com.ReadDataFromUser;

import static com.Commands.changeMedicinePrice;
import static com.Commands.removeMedicineFromDataBase;
import static com.Commands.addMedicineToDataBase;

public class Menu {

    public void displayMenu() {


        while (true) {
            StringBuilder builder = new StringBuilder();
            builder.append("What do you want to do ?\n")
                    .append("If you want to add medicine to pharmacy press 1\n")
                    .append("If you want to remove medicine from pharmacy press 2\n")
                    .append("If you want to see all medicine in pharmacy press 3\n")
                    .append("If you want to change medicine's price press 4\n")
                    .toString();
            System.out.println(builder);
            triggerMenu(ReadDataFromUser.readNumberFromUser());
        }
    }

    private void triggerMenu(int number) {

        switch (number) {
            case 1:
                addMedicineToDataBase();
                break;
            case 2:
                removeMedicineFromDataBase();
                break;
            case 3:
                changeMedicinePrice();
                break;
            case 4:

        }
    }
}
