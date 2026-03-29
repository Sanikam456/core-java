class LaptopsRunner{
public static void main(String[]args)
{
	Laptops ref = new Laptops("Hp","inspiron i5","Intel i5",16,15.6,25000.00);

        ref.brand = "Dell";
        ref.modelName = "XPS 15";
        ref.processor = "Intel i7";
        ref.ramGB = 16;
        ref.screenSize = 15.6;
        ref.price = 1200.00;
        ref.getLaptopsData();
}
}