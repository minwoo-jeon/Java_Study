package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private  int itemCount;

    ShoppingCart() {

    }

    public void addItem(Item item) {
        //검증로직
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찻습니다");
            return;
        }
        //정상로직
         items[itemCount] = item;   // = >   xoo2참조값을   xaxoo1[0]배열에 값을 넣는다.
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item =  items[i];
            System.out.println("상품명:"+item.getName()+ ", 합계" + item.getTotalPrice());
        }
        System.out.println("전체 가격합" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}



