public class Main {
    public static void yaer(int year){
        System.out.print(year + "-");
    }
    public static void yaerHot(){
        System.out.print("високосный год");
        }
    public static void yaerNot() {
        System.out.print("не високосный год");
    }
        public static void main(String[] args) {
            int year = 2021;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                 yaer(year);
                 yaerHot();
            } else {
                yaer(year);
                yaerNot();
                }
    }
}