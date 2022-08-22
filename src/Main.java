import java.time.LocalDate;

public class Main {
    ///Метод к задаче 1
    public static void yaer(int year) {
        System.out.print(year + "-");
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
        int deliveryDistance = 20;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет 1 день");
        return;
        } else {
            if (deliveryDistance > 20 && deliveryDistance < 60) {
                System.out.println("Доставка займет 2 деня");
            return;
            } else {
                if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                    System.out.println("Доставка займет 3 день");
                return;
                }
            }
        }
    }

    public static void main(String[] args) {
        //////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Задание №1:");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
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
        int clientOS = 1; // 1=Andorid ; 0= iOS
        if (clientOS == 0) {
            osIOS();
        } else if (clientOS == 1) {
            osANDR();
        }
        int currentYear = LocalDate.now().getYear();
        int classClient = 2022;
        if (clientOS == 0 && classClient < currentYear) {
            osObblch();
        } else if (clientOS == 0 && classClient >= currentYear) {
            osLite();
        } else if (clientOS == 1 && classClient < currentYear) {
            osObblch();
        } else if (clientOS == 1 && classClient >= currentYear) {
            osLite();
        }
        System.out.println();
        System.out.println();
        //////////////////////////////////////////////////////////////////////////////
        System.out.println("Задание №3:");
        distanceDeliv();

        }
    }
