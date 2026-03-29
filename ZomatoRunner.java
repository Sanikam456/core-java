class ZomatoRunner {
    public static void main(String[] args) {
        System.out.println("First Line method call");
        String customer1 = Zomato.validateAndRegister("user123", "Pass1234");
        System.out.println(customer1);
        System.out.println("Second Line method call");
        String customer2 = Zomato.validateAndRegister("user456", "Word5678");
        System.out.println(customer2);
        System.out.println("------Second time method call------");
        boolean result=Zomato.validateRegisterFields(9867643656l,"monisha@1234","monisha M","monisha_M");
       System.out.println(result);
}
}

