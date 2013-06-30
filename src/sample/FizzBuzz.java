package sample;

/**
 * 演習課題解答例<br>
 * 3の倍数は「Fizz」、5の倍数は「Buzz」、3と5との公倍数は「FizzBuzz」と出力<br>
 * 
 * @author tomo*h
 * 
 */
public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            StringBuilder sb = new StringBuilder();
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (sb.length() == 0) {
                sb.append(i);
            }
            System.out.println(sb.toString());
        }
    }
}
