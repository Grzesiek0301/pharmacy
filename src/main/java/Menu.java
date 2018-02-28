public class Menu {

    public void displayMenu() {

        StringBuilder builder = new StringBuilder();
        while (true) {
            builder.append("What do you want to do ?\n")
                    .append("If you want to add medicine to pharmacy press 1\n")
                    .append("If you want to remove medicine from pharmacy press 2\n")
                    .append("If you want to see all medicine in pharmacy press 3\n")
                    .toString();
            System.out.println(builder);
            triggerMenu(ReadDataFromUser.readNumberFromUser());

        }
    }

    private void triggerMenu(int number) {

        switch (number) {
            case 1:
                System.out.println("number1");
                break;
            case 2:
                System.out.println("number2");
                break;
            case 3:
                System.out.println("number3");
                break;
        }
    }
}
