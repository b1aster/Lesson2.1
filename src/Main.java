public class Main {
    public static void main(String[] args) {

        // Задача 1
        checkLeapYearAndPrint(2012);
        checkLeapYearAndPrint(2022);

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
}