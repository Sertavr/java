//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while (i % 2 == 0 || i % 3 != 0) {
            i++;
            sum += i;
            System.out.println(i);
        }


    }
}