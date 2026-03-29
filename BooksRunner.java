class BooksRunner
{
public static void main (String []book)
{
	 Books ref = new Books(502," C Programming Guide",56.67f,"Education",77.98f);
        ref.id = 501;
        ref.bookName = "Java Programming Guide";
        ref.price = 45.99f;
        ref.category = "Education";
        ref.rating = 4.9f;
        ref.getBooksData(); 
    }
}

