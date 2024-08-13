public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");
        int[] expenses = {950000, 768000, 45000, 98000, 447000};
        int total = 0;
        for (int element : expenses) {
            total = total + element;
        }
        System.out.println("Сумма трат за месяц составит " + total + " рублей.");
        System.out.println();
        System.out.println("Задача №2");
        int maxExpenses = 44000;
        int minExpenses = 1000000;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpenses) {
                maxExpenses = expenses[i];
            }
        }
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] < minExpenses) {
                minExpenses = expenses[i];
            }

        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей. Максимальная сумма трат за неделю составила " + maxExpenses + " рублей.");
        System.out.println();
        System.out.println("Задача №3");
        int[] expenses2 = {640000, 104000, 37000, 553000, 341000};
        float total2 = 0f;
        for (int element : expenses2) {
            total2 = (total2 + element) / 4;
        }
        System.out.println(total2);
        System.out.println();
        System.out.println("Задача №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }


}



