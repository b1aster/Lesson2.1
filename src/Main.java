import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        checkLeapYearAndPrint(2012);
        checkLeapYearAndPrint(2022);

        // Разделитель
        System.out.println();

        // Задача 2
        checkDevice(0, 2015);
        checkDevice(1, 2022);
        checkDevice(3, 2022); // Ошибка

    }

    public static void checkLeapYearAndPrint(int year){

        boolean leap = false;

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    leap = true;

            } else {
                leap = true;
            }
        }

        if (leap){
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }

    public static void checkDevice(int os, int year){

        int currentYear = LocalDate.now().getYear();

        String osName = switch (os) {
            case 0 -> "iOS";
            case 1 -> "Android";
            default -> "Unknown";
        };

        if (osName.equals("Unknown")){
            System.err.println("Неверный тип ОС");
            return;
        }

        if (year < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке");
        } else {
            System.out.println("Установите приложение для " + osName + " по ссылке");
        }
    }
}