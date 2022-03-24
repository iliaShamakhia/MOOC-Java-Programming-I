public class Book {
   private String title;
   private int numOfPages;
   private int publicationYear;
   
   public Book(String title, int pages, int year){
       this.title = title;
       this.numOfPages = pages;
       this.publicationYear = year;
   }
   
   public String getTitle(){
       return this.title;
   }
   
   public int getNumOfPages(){
       return this.numOfPages;
   }
   
   public int getPublicationYear(){
       return this.publicationYear;
   }
   
   @Override
   public String toString(){
       return this.title + ", " + this.numOfPages + " pages, " + this.publicationYear;
   }
}
