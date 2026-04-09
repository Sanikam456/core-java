class DrinkOrderRunner {
    public static void main(String[] args) {

        DrinkOrder order1 = new DrinkOrder();
        double price1 = order1.getPriceByDrinkName("Tea");
        System.out.println("Drink Price: " + price1);
        double total1 = order1.getTotalAmount(price1, 2);
        System.out.println("Total Price: " + total1);
        double final1 = order1.getDiscount(total1);
        System.out.println("Discount Price: " + final1);
        System.out.println("----------------------");

        DrinkOrder order2 = new DrinkOrder();
        double price2 = order2.getPriceByDrinkName("Coffee");
        System.out.println("Drink Price: " + price2);
        double total2 = order2.getTotalAmount(price2, 1);
        System.out.println("Total Price: " + total2);
        double final2 = order2.getDiscount(total2);
        System.out.println("Discount Price: " + final2);
        System.out.println("----------------------");

        DrinkOrder order3 = new DrinkOrder();
        double price3 = order3.getPriceByDrinkName("Milkshake");
        System.out.println("Drink Price: " + price3);
        double total3 = order3.getTotalAmount(price3, 3);
        System.out.println("Total Price: " + total3);
        double final3 = order3.getDiscount(total3);
        System.out.println("Discount Price: " + final3);
        System.out.println("----------------------");

        DrinkOrder order4 = new DrinkOrder();
        double price4 = order4.getPriceByDrinkName("Lassi");
        System.out.println("Drink Price: " + price4);
        double total4 = order4.getTotalAmount(price4, 2);
        System.out.println("Total Price: " + total4);
        double final4 = order4.getDiscount(total4);
        System.out.println("Discount Price: " + final4);
        System.out.println("----------------------");

        DrinkOrder order5 = new DrinkOrder();
        double price5 = order5.getPriceByDrinkName("Mocktail");
        System.out.println("Drink Price: " + price5);
        double total5 = order5.getTotalAmount(price5, 4);
        System.out.println("Total Price: " + total5);
        double final5 = order5.getDiscount(total5);
        System.out.println("Discount Price: " + final5);
    }
}