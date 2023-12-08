package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //컴파일 오류발생 (데이터 타입이 맞지않음)
        intValue = (int)doubleValue; //형변환 명시적 형변환
        System.out.println(intValue);
    }
}
