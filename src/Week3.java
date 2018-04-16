import java.util.ArrayList;
import java.util.Arrays;

public class Week3 {
    public static void main(String[] args) {
        // Junior
        // 1.
        System.out.println("Hello World");
        System.out.println();

        // 2.
        int a = 1;
        int b = 7;
        System.out.println(a + b);
        System.out.println();

        // 3.
        String first = "John";
        String last = "Turkson";
        System.out.println(first + " " + last);
        System.out.println();

        // 4.
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }
        System.out.println();

        // 5.
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        // Senior
        // 1.
        String[] letters = new String[]{"a", "b", "c"};
        String[] numbers = new String[]{"1", "2", "3"};
        // Using arrays:
        String[] resultant = new String[letters.length + numbers.length];
        for (int i = 0; i < letters.length; i++) {
            resultant[i] = letters[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            resultant[letters.length + i] = numbers[i];
        }
        for (String s : resultant) {
            System.out.print(s);
        }
        System.out.println("\n");

        // Using ArrayLists:
        ArrayList<String> letterList = new ArrayList<>(Arrays.asList(letters));
        ArrayList<String> numberList = new ArrayList<>(Arrays.asList(numbers));
        ArrayList<String> resultantList = new ArrayList<>();
        resultantList.addAll(letterList);
        resultantList.addAll(numberList);
        System.out.println(resultantList);
        System.out.println();

        // 2.
        int[] firstTenNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : firstTenNumbers) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        //3.
        for (int i : firstTenNumbers) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        // 4.
        int sum = 0;
        for (int i : firstTenNumbers) {
            sum += i;
        }
        System.out.println(sum + "\n");

        // 5.
        System.out.println(divisibleBy(firstTenNumbers, 3));
        System.out.println();

        // Full Stack
        // 1.
        for (int i = 0; i < 26; i++) {
            System.out.println((char) (i + 65));
        }
        System.out.println();

        // 2.
        String testString = "The quick brown fox jumps over the lazy dog.";
        System.out.println(reverse(testString));
        System.out.println();

        // 3.
        Object[] theKitchenSink = new Object[]{"something", 7, true, 5.5};
        Object[] kniSnehctiKeht = reverse(theKitchenSink);
        for (Object o : kniSnehctiKeht) {
            System.out.println(o);
        }
        System.out.println();

         // 4.
        boolean[] someBools = new boolean[]{true, false, false, true, true, true, false, false, false, false, true};
        for (int i = 0; i < someBools.length; i++) {
            int trues = boolCount(someBools, i);

            String result = "From index 0 to " + i + ", there ";
            if (trues == 1) {
                result += "is " + trues + " true.";
            } else {
                result += "are " + trues + " trues.";
            }
            System.out.println(result);
        }
    }

    public static int divisibleBy(int[] numbers, int n) {
        int count = 0;
        for (int i : numbers) {
            if (i % n == 0) {
                count++;
            }
        }
        return count;
    }

    public static String reverse(String s) {
        String reversed = "";
        String[] contents = s.split("");
        for (int i = contents.length - 1; i >= 0; i--) {
            reversed += contents[i];
        }
        return reversed;
    }

    // Overloading is a cool feature.
    public static Object[] reverse(Object[] o) {
        Object[] reversed = new Object[o.length];
        Object[] copy = o;
        for (int i = copy.length - 1; i >=0; i--) {
            reversed[copy.length - 1 - i] = copy[i];
        }
        return reversed;
    }

    public static int boolCount(boolean[] b, int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (b[i]) {
                count++;
            }
        }
        return count;
    }
}
