package generics3;

import java.util.ArrayList;

public class Library {
	
	private ArrayList<String> Books= new ArrayList<String>();
	private ArrayList<String> Video= new ArrayList<String>();
	private ArrayList<String> Newspaper= new ArrayList<String>();
	
	public ArrayList<String> getBooks() {
		return Books;
	}
	public void setBooks(ArrayList<String> books) {
		Books = books;
	}
	public ArrayList<String> getVideo() {
		return Video;
	}
	public void setVideo(ArrayList<String> video) {
		Video = video;
	}
	public ArrayList<String> getNewspaper() {
		return Newspaper;
	}
	public void setNewspaper(ArrayList<String> newspaper) {
		Newspaper = newspaper;
	}
	
	
}
