class MakeupOrderRunner {
    public static void main(String[] args) {

        MakeupOrder order1 = new MakeupOrder();
        double price1 = order1.getPriceByProductName("Lipstick");
        System.out.println("Product Price: " + price1);
        double total1 = order1.getTotalAmount(price1, 2);
        System.out.println("Total Price: " + total1);
        double final1 = order1.getDiscount(total1);
        System.out.println("Discount Price: " + final1);
        System.out.println("----------------------");

        MakeupOrder order2 = new MakeupOrder();
        double price2 = order2.getPriceByProductName("Foundation");
        System.out.println("Product Price: " + price2);
        double total2 = order2.getTotalAmount(price2, 1);
        System.out.println("Total Price: " + total2);
        double final2 = order2.getDiscount(total2);
        System.out.println("Discount Price: " + final2);
        System.out.println("----------------------");

        MakeupOrder order3 = new MakeupOrder();
        double price3 = order3.getPriceByProductName("Eyeliner");
        System.out.println("Product Price: " + price3);
        double total3 = order3.getTotalAmount(price3, 3);
        System.out.println("Total Price: " + total3);
        double final3 = order3.getDiscount(total3);
        System.out.println("Discount Price: " + final3);
        System.out.println("----------------------");

        MakeupOrder order4 = new MakeupOrder();
        double price4 = order4.getPriceByProductName("Mascara");
        System.out.println("Product Price: " + price4);
        double total4 = order4.getTotalAmount(price4, 2);
        System.out.println("Total Price: " + total4);
        double final4 = order4.getDiscount(total4);
        System.out.println("Discount Price: " + final4);
        System.out.println("----------------------");

        MakeupOrder order5 = new MakeupOrder();
        double price5 = order5.getPriceByProductName("Makeup Kit");
        System.out.println("Product Price: " + price5);
        double total5 = order5.getTotalAmount(price5, 1);
        System.out.println("Total Price: " + total5);
        double final5 = order5.getDiscount(total5);
        System.out.println("Discount Price: " + final5);
    }
}