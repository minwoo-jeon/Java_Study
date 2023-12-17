package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count=" + bigData.count);       //결과값 예상 : 0
        System.out.println("bigData.data=" + bigData.data); //결과값 예상 : null

        System.out.println("bigData.data.value = " + bigData.data.value); //nullPointerException
    }
}
