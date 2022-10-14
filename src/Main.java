import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Массивы. Часть 1

        //Задание 1

        //Объявите три массива:
        //1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        //2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        //3. Произвольный массив – тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.

        byte[] numbers = new byte[]{1, 2, 3}; //1.
        double[] decimalFractions = {1.57, 7.654, 9.986}; //2.
        char[] trafficSignal = new char[]{'r', 'y', 'g'}; //3.

        //Задание 2
        System.out.println("Задание 2.");
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        // начиная с первого элемента, через запятую. Запятая между последним элементом одного массива и первым
        // элементом следующего не нужна.
        //- **Критерии оценки**
        //    - В консоль выведены все элементы первого массива в верном порядке через запятую
        //    - В консоль выведены все элементы второго массива в верном порядке через запятую
        //    - В консоль выведены все элементы третьего массива в верном порядке через запятую
        //    - На одной строчке расположены элементы только одного массива

        //1.

        for (byte i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //2.

        for (int i = 0; i < decimalFractions.length; i++) {
            System.out.print(decimalFractions[i]);
            if (i != decimalFractions.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //3.

        for (int i = 0; i < trafficSignal.length; i++) {
            System.out.print(trafficSignal[i]);
            if (i != trafficSignal.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3.");

        //Теперь ваша задача – распечатать все элементы всех трех массивов,
        // но начинать нужно не с первого элемента массива, а с последнего.
        // Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке,
        // а элементы другого массива – на другой.
        //Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        //1.

        for (int i = numbers.length - 1; i <= numbers.length && i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //2.

        for (int i = decimalFractions.length - 1; i <= decimalFractions.length && i >= 0; i--) {
            System.out.print(decimalFractions[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //3.

        for (int i = trafficSignal.length - 1; i <= trafficSignal.length && i >= 0; i--) {
            System.out.print(trafficSignal[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задание 4
        System.out.println("Задание 4.");

        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        //Распечатайте результат преобразования в консоль.

        for (byte i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;
            }
        }
        System.out.print(Arrays.toString(numbers));


    }
}
