package objectsAndClasses;

public class Book {
    private final String authorName;
    private final int pageAmount;
    private final String publisherName;
    private int publicationYear;

    public Book(String authorName, int pageAmount, String publisherName, int publicationYear) {
        this.authorName = authorName;
        this.pageAmount = pageAmount;
        this.publisherName = publisherName;
        this.publicationYear = publicationYear;
    }

    public String getAuthorName(){
        return authorName;
    }
    public String getPublisherName() {
        return publisherName;
    }
    public int getPageAmount(){
        return pageAmount;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void  setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
}
