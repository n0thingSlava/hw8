public class Main {
    public static void yaer(int year) {
        System.out.print(year + "-");
    }
    public static int getClientOS(String name) {
        String osName = "iOS";
        int clientOS = getClientOS(osName);
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void yaerHot() {
        System.out.print("високосный год");
    }

    public static void yaerNot() {
        System.out.print("не високосный год");
    }

    public static void main(String[] args) {
        System.out.println("Задание №1:");
        ///////////////////////////////////////////
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            yaer(year);
            yaerHot();
        } else {
            yaer(year);
            yaerNot();
        }
        System.out.println();
        System.out.println("Задание №2:");
     ///////////////////////////////////////
        int clientOS = 1; // 1=Andorid ; 0= iOS
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке")
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
}