class Books {
    int id;
    String bookName;
    float price ;
    String category;
    float rating;
    public Books(int id,String bookName,float price ,String category,float rating) {
        System.out.println("I am the Book constructor with parameter:"+id+","+bookName+","+price+","+category+","+rating);
    }
    public void getBooksData() {
        System.out.println("----- Book Details -----");
        System.out.println("Id: " + id);
        System.out.println("Book Name: " + bookName);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
        System.out.println("Rating: " + rating);
       
    }
}