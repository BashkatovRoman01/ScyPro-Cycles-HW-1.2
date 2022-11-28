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
    }
}