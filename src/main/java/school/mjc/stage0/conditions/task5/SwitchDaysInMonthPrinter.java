package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month < 1 || month > 12) {
            System.out.println("wrong number!");
        } else {


            int numberOfDays;
            switch (month) {
                case 2:
                    numberOfDays = 28;
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    numberOfDays = 30;
                    break;
                default:
                    numberOfDays = 31;
                    break;
            }

            System.out.println(numberOfDays);
        }
    }
}
