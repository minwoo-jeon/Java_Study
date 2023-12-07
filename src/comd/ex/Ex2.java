package comd.ex;

public class Ex2 {
    public static void main(String[] args) {
        /*주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램을 작성하자. 다음과 같은 기준을 따른다.
        거리가 1km 이하이면: "도보"
        거리가 10km 이하이면: "자전거"
        거리가 100km 이하이면: "자동차"
        거리가 100km 초과이면: "비행기*/

        int dist = 120;

        if(dist <= 1){
            System.out.println("도보");
        }else if(dist <= 10){
            System.out.println("자전거");
        }else if(dist <= 100){
            System.out.println("자동차");
        }else{
            System.out.println("비행기");
        }
    }
}
