public class 실습문제4 {
    static void main(String[] args) {
        String drinkName = "아이브 에너지 드링크";
        int price = 1500;
        int insertMoney = 2000;
        boolean possible = insertMoney >= price;
        int change = possible ? (insertMoney - price) : 0;
        String result = """
                ======================
                자판기
                ======================
                음료       : %s
                가격       : %,d원
                투입금액 : %,d원
                구매가능 : %b
                거스름돈 : %d원
                ======================
                """.formatted(drinkName, price, insertMoney, possible , change);
        System.out.println(result);

    }
}
