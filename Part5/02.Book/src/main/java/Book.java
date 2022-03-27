public class Book {
    private String author;
    private String title;
    private int pageCount;
    
    public Book(String author, String title, int pages){
        this.author = author;
        this.title = title;
        pageCount = pages;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.title;
    }
    
    public int getPages(){
        return this.pageCount;
    }
    
    public String toString(){
        return this.getAuthor() + ", " + this.getName() + ", " + this.getPages() + " pages";
    }
}
