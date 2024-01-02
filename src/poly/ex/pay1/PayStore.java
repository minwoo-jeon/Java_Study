package poly.ex.pay1;

public abstract class PayStore {

    //새로운 페이가 추가되면 변하는부분
     public static Pay findPay(String option) {
            if (option.equals("kakao")) {
                return  new KakaoPay();
            } else if (option.equals("naver")) {
                return  new NaverPay();
            } else if (option.equals("newPay")) {
                return  new NewPay();
            } else {
                return  new DefaultPay();
            }
        }
    }

