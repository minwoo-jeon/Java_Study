package poly.ex.pay1;

public class PayService {

    //클라이언트 부분 새로운 페이가 추가되도 해당 클래스는 변함이없다
    public void processPay(String option, int amount) {


        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        Pay pay = PayStore.findPay(option);

        //실제 결제를 하는 부분
        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }


}
