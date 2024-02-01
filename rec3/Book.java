package rec3;

/**
 * An immutable class containing information about a book.
 * 
 */
public class Book {
    /** The book's ISBN. */
    public final String isbn;
    /** The book's authors. */
    public final String[] authors;
    /** The book's title. */
    public final String title;
    /** The book's publisher. */
    public final String publisher;
    /** The book's GoodReads rating. */
    public final double rating;

    /**
     * Create a new BookData.
     * 
     * @param isbn      The book's ISBN.
     * @param authors   An array of authors.
     * @param title     The book's title.
     * @param publisher The book's publisher.
     * @param rating    The book's GoodReads rating.
     */
    Book(String isbn, String[] authors, String title, String publisher, double rating) {
        this.isbn = isbn;
        this.authors = authors.clone();
        this.title = title;
        this.publisher = publisher;
        this.rating = rating;
    }
    
    public String authorString() {
    	StringBuilder sb = new StringBuilder();
    		
    	for (int i=0; i<this.authors.length; i++) {
    		sb.append(authors[i]+", ");
    	}
    	
    	String result = sb.toString();
    	return result.substring(0, result.length() - 2);
    }

    public boolean equals(Object  b) {
    	return this.isbn.equals(((Book)b).isbn);
    }
    
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("<Book " + this.isbn + " '"+ this.title);
    	sb.append("' by " + authorString() + ". Publisher: "+this.publisher);
    	sb.append(". Rating: " + this.rating +"> ");
    	return sb.toString();    
    }
    
    public static final String [] columnNames() {
    	String [] colNames  = {"ISBN",
                "Title",
                "Author",
                "Publisher",
                "Rating"};
    	return colNames;    
    }	
}
