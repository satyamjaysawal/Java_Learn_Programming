public class Book {
    private String title;
    private String author;
    private int year;


    public Book(String title,String author,int  year){
        this.title=title;
        this.author=author;
        this.year=year;
    }
    public String getTitle(){
        return title;

    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
    public void displayInfo(){
        System.out.println("title :"+title);
        System.out.println("Author :"+ author);
        System.out.println("year :"+year);
    }



    public static void main(String[] args) {
        Book book=new Book("The Great Story","Satyam",1960);
        book.displayInfo();
    }
    
}
