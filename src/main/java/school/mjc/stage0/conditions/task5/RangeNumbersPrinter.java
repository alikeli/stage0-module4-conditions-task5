package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {

        switch (number) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("number is between 1 and 5");
                break;
            case 6, 7, 8, 9, 10:
                System.out.println("number is between 6 and 10");
                break;
            default:
                System.out.println("out of range");
                break;
        }
    }
}
