package array;

public class Array1 {
    public static void main(String[] args) {
        int[] student; //배열 변수 선언
        student = new int[5]; //배열 생성

        System.out.println(student); //배열참조값 조회

        //변수 값 대입
        student[0] = 90;
        student[1] = 80;
        student[2] = 70;
        student[3] = 60;
        student[4] = 50;

        
        //변수 값 사용
        System.out.println("학생 1 점수 :" + student[0]);
        System.out.println("학생 2 점수 :" + student[1]);
        System.out.println("학생 3 점수 :" + student[2]);
        System.out.println("학생 4 점수 :" + student[3]);
        System.out.println("학생 5 점수 :" + student[4]);



    }
}
