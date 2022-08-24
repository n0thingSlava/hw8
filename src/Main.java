import java.time.LocalDate;

public class Main {
    ///Метод к задаче 1
    public static void yaer(int year) {
        System.out.print(year + "-");
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void yaerHot() {
        System.out.print("високосный год");
    }

    public static void yaerNot() {
        System.out.print("не високосный год");
    }

    //метод к задаче 2
    public static void osIOS() {
        System.out.print("OC iOS-");
    }

    public static void osANDR() {
        System.out.print("OC Android-");
    }

    public static void osLite() {
        System.out.print("установить lite-версию");
    }

    public static void osObblch() {
        System.out.print("установить обычную версию");
    }

    //метод к задаче 3
    public static void distanceDeliv() {
        int deliveryDistance = 40;
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance >= 60) {
            days++;
        }
        System.out.printf("Доставка займет %d день", days);
    }


    public static void main(String[] args) {
        //////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Задание №1:");
        int year = 2021;
        if (isLeapYear(year)) {
            yaer(year);
            yaerHot();
        } else {
            yaer(year);
            yaerNot();
        }
        System.out.println();
        System.out.println();
        //////////////////////////////////////////////////////////////////////////////
        System.out.println("Задание №2:");
        int currentYear = LocalDate.now().getYear();
        int classClient = 2022;
        int OS = 0;
        String version = currentYear > year ? "облегченную" : "";
        String system = OS == 0 ? "ios" : "android";
        System.out.printf("Вам рекомендуется установить %s версию OS %s", version, system);
        System.out.println();

        System.out.println("Задание №3");
        distanceDeliv();
    }

}
