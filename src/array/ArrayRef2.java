package array;

public class ArrayRef2  {
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
        for (int i = 0; i < student.length; i++) {
            System.out.println("학생"+(i +1) + "점수 : "+  student[i]);
        }




    }
}


