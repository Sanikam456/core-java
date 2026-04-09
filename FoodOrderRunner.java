class FoodOrderRunner {
    public static void main(String[] args) {

        FoodOrder order1 = new FoodOrder();
        double price1 = order1.getPriceByFoodName("Burger");
        System.out.println("Food Price: " + price1);
        double total1 = order1.getTotalAmount(price1, 2);
        System.out.println("Total Price: " + total1);
        double final1 = order1.getDiscount(total1);
        System.out.println("Discount Price: " + final1);
        System.out.println("----------------------");

        FoodOrder order2 = new FoodOrder();
        double price2 = order2.getPriceByFoodName("Pizza");
        System.out.println("Food Price: " + price2);
        double total2 = order2.getTotalAmount(price2, 1);
        System.out.println("Total Price: " + total2);
        double final2 = order2.getDiscount(total2);
        System.out.println("Discount Price: " + final2);
        System.out.println("----------------------");

        FoodOrder order3 = new FoodOrder();
        double price3 = order3.getPriceByFoodName("Sandwich");
        System.out.println("Food Price: " + price3);
        double total3 = order3.getTotalAmount(price3, 3);
        System.out.println("Total Price: " + total3);
        double final3 = order3.getDiscount(total3);
        System.out.println("Discount Price: " + final3);
        System.out.println("----------------------");

        FoodOrder order4 = new FoodOrder();
        double price4 = order4.getPriceByFoodName("Pasta");
        System.out.println("Food Price: " + price4);
        double total4 = order4.getTotalAmount(price4, 2);
        System.out.println("Total Price: " + total4);
        double final4 = order4.getDiscount(total4);
        System.out.println("Discount Price: " + final4);
        System.out.println("----------------------");

        FoodOrder order5 = new FoodOrder();
        double price5 = order5.getPriceByFoodName("Ice Cream");
        System.out.println("Food Price: " + price5);
        double total5 = order5.getTotalAmount(price5, 4);
        System.out.println("Total Price: " + total5);
        double final5 = order5.getDiscount(total5);
        System.out.println("Discount Price: " + final5);
    }
}