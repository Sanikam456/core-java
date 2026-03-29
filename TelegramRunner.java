class TelegramRunner {
    public static void main(String[] args) {
        System.out.println("First Line method Call");
        String sanika = Telegram.validateAndRegister(96860079921L, "Chandul123", "04-11-2006", "smesahua", "sanin");
        System.out.println(sanika);
        System.out.println("second Line method Call");
        String likith = Telegram.validateAndRegister(98447200651L, "15438123", "13-02-2006", "Likith naye", "likishgowda");
        System.out.println(likith);
		System.out.println("------third time method call------");
        boolean result=Telegram.validateRegisterFields(9867643278l,"monisha@1234","monisha","monisha M");
        System.out.println(result);
    }
}
