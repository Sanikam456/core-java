class SnackOrderRunner {
    public static void main(String[] args) {

        SnackOrder order1 = new SnackOrder();
        double price1 = order1.getPriceBySnackName("Samosa");
        System.out.println("Snack Price: " + price1);
        double total1 = order1.getTotalAmount(price1, 2);
        System.out.println("Total Price: " + total1);
        double final1 = order1.getDiscount(total1);
        System.out.println("Discount Price: " + final1);
        System.out.println("----------------------");

        SnackOrder order2 = new SnackOrder();
        double price2 = order2.getPriceBySnackName("Burger");
        System.out.println("Snack Price: " + price2);
        double total2 = order2.getTotalAmount(price2, 1);
        System.out.println("Total Price: " + total2);
        double final2 = order2.getDiscount(total2);
        System.out.println("Discount Price: " + final2);
        System.out.println("----------------------");

        SnackOrder order3 = new SnackOrder();
        double price3 = order3.getPriceBySnackName("Pani Puri");
        System.out.println("Snack Price: " + price3);
        double total3 = order3.getTotalAmount(price3, 3);
        System.out.println("Total Price: " + total3);
        double final3 = order3.getDiscount(total3);
        System.out.println("Discount Price: " + final3);
        System.out.println("----------------------");

        SnackOrder order4 = new SnackOrder();
        double price4 = order4.getPriceBySnackName("Noodles");
        System.out.println("Snack Price: " + price4);
        double total4 = order4.getTotalAmount(price4, 2);
        System.out.println("Total Price: " + total4);
        double final4 = order4.getDiscount(total4);
        System.out.println("Discount Price: " + final4);
        System.out.println("----------------------");

        SnackOrder order5 = new SnackOrder();
        double price5 = order5.getPriceBySnackName("Cutlet");
        System.out.println("Snack Price: " + price5);
        double total5 = order5.getTotalAmount(price5, 4);
        System.out.println("Total Price: " + total5);
        double final5 = order5.getDiscount(total5);
        System.out.println("Discount Price: " + final5);
    }
}