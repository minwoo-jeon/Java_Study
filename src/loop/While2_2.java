package loop;

public class While2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endnum = 3;

        while (i <= endnum) {
            sum = sum + i;
            System.out.println("i=" + i + "sum=" + sum);
            i++;
        }
    }
}
