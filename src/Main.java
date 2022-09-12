public class Main {
    public static void main(String[] args) {
        //task1.1
        int[] numbers = new int[] {1, 2, 3};
        //System.out.println(numbers.length); //работает!!

        //task1.2
        double[] doubles = {1.57, 7.654, 9.986};


        //task1.3
        boolean compare = 11 > 6;
        boolean x = false;
        boolean[] boos = new boolean[] {compare, x, true};

        //task2
        //почему при отсутствии запятых или иных разделителей в скобках команды sout значения переменных складываются при использовании знака + ?
        System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        System.out.println(doubles[0] + ", " + doubles[1] + ", " + doubles[2]);
        System.out.println(boos[0] + ", " + boos[1] + ", " + boos[2]);

        //task3
        System.out.println(numbers[2] + ", " + numbers[1] + ", " + numbers[0]);
        System.out.println(doubles[2] + ", " + doubles[1] + ", " + doubles[0]);
        System.out.println(boos[2] + ", " + boos[1] + ", " + boos[0]);

        //task4
        int i = 0;
        for (; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
            numbers[i]++;
            }
            System.out.println(numbers[i]);
        }
    }
}