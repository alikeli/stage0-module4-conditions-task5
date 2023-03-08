package school.mjc.stage0.conditions.task5;

public class BasicSwitch {
    public static void main(String[] args) {
        int a = 25;
        switch (a) {
            default:
                System.out.println("default");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 10:
                System.out.println("ten");
                break;
            case 20:
                System.out.println("twenty");
                break;
        }
    }
}
