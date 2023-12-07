package loop;

public class Continue {
    public static void main(String[] args) {
        int i = 1;

        while (1 <= 5){
            if(i == 3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
