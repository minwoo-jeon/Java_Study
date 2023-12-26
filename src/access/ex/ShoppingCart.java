package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemsCount;

    public ShoppingCart() {

    }

    public void addItem(Item item) {
        if (itemsCount >= items.length) {
            System.out.println("장바구니에는 상품을 최대 10개만 담을 수 있습니다");
            return;
        }
         items[itemsCount] = item;
         itemsCount++;

    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemsCount; i++) {
            Item item = items[i];
            System.out.println("상품명:"+ item.getName() + ",합계" + item.totalPrice());
        }
        System.out.println("전체 가격 합 :" + totalPrice() );
    }

    public int totalPrice() {
        int total = 0;
        for (int i = 0; i < itemsCount; i++) {
            Item item = items[i];
            total += item.totalPrice();
        }return total;
    }

}



