package comd.ex;

public class Ex4 {
    public static void main(String[] args) {

       /* 문제: "평점에 따른 영화 추천하기"
        요청한 평점 이상의 영화를 찾아서 추천하는 프로그램을 작성하자.
        어바웃타임 - 평점9
        토이 스토리 - 평점8
        고질라 - 평점7
        평점 변수는 double rating을 사용하세요. if문을 활용해서 문제를 풀자.*/

        double rating = 7.1;
        
        if(rating <= 9){
            System.out.println("어바웃타입을 추천합니다");
        }
        if(rating <= 9){
            System.out.println("토이스토리를 추천합니다");
        }
        if(rating <= 7){
            System.out.println("고질라를 추천합니다");
        }
    }
}