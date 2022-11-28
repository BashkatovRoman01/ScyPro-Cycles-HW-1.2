public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int goal = 2_459_000;
        int additionalDonation = 15000;
        int countMonth = 1;
        int savings = 0;
        double percent = 0.12;
        while (savings < goal) {
            if (countMonth % 12 == 0) {
                savings += savings * percent;
            }
            savings = savings + additionalDonation;
            countMonth++;
        }
        System.out.println("Месяц " + countMonth + ", сумма накоплений равна " + savings + " рублей");
        //Задание 2
        System.out.println("Задание 2");
        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        //Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int birthRateBy1000 = 17;
        int deathRateBy1000 = 8;
        int populationIncrease = birthRateBy1000 - deathRateBy1000;
        for (int year = 1; year <= 10; year++) {
            population = population * populationIncrease / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        //Задание 4
        System.out.println("Задание 4");
        int goal1 = 12_000_000;
        int countMonth1 = 0;
        int savings1 = 15000;
        double percent1 = 0.07;
        for (; savings1 < goal1; countMonth1++) {
            savings1 += savings1 * percent1;
            System.out.println("За месяц " + countMonth1 + " сумма накоплений составит " + savings1);
        }
        //Задание 5
        System.out.println("Задание 5");
        int goal2 = 12_000_000;
        int countMonth2 = 0;
        int savings2 = 15000;
        double percent2 = 0.07;
        for (; savings2 < goal2; countMonth2++) {
            savings2 += savings2 * percent2;
            if (countMonth2 % 6 == 0) {
                System.out.println("За месяц " + countMonth2 + " сумма накоплений составит " + savings2);
            }
        }
        //Задание 6
        System.out.println("Задание 6");
        int firstMonth = 0;
        int savings3 = 15000;
        double percent3 = 0.07;
        for (; firstMonth <= 9 * 12; firstMonth++) {
            savings3 += savings3 * percent3;
            System.out.println("За месяц " + firstMonth + " сумма накоплений составит " + savings3);
        }
        //Задание 7
        System.out.println("Задание 7");
        int firstFriday=5;
        for (int day=firstFriday; day<=31; day=day+7) {
            System.out.println("Сегодня пятница,"+day+ " -е число. Необходимо подготовить отчет.");
        }
        //Задание 8
        System.out.println("Задание 8");
        int firstYear = 0;
        int year=firstYear;
        int thisYear = 2022;
        int startObservationYear = thisYear - 200;
        int finishObservationYear = thisYear + 100;
        int period = 79;
        while (year <= finishObservationYear) {
            if (year >= startObservationYear) {
                System.out.println(year);
            }
            year += period;
        }
        //Задание 9
        System.out.println("Задание 9");
        int f=2;
        for (int i = 1; i <=10 ; i++) {
            System.out.println(f+ " * "+i+" = "+f*i);
        }
    }
}