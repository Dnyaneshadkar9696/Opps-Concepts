package encapsulation;

public class Book {
	
	private String title;
	private String author;
	private int prise;
	
	Book(int prise){
		// constructor 
		// once price is set it is not changed
		
		this.prise = prise;
		
	}

    public int getPrise() {
    	return prise;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	

	

}
