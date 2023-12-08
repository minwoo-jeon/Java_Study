package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m =10;
        if(m>0){
            int temp = m*2;
            System.out.println("temp = "+temp);
        }
        //System.out.println(temp); 변수 템프 접근불가
        System.out.println("m="+m);
    }
}
