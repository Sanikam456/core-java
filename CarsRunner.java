class CarsRunner{
public static void main(String []args){
	 Cars ref = new Cars("BMW","corolla",2026,"Black",4000000.00);
        ref.brand = "Toyota";
        ref.model = "Corolla";
        ref.year = 2022;
        ref.color = "Blue";
        ref.price = 25000.00;

        ref.getCarsData();
    }
}
