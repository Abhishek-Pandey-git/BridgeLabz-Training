package com.collectors;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//book class
class Book {
    private String title;
    private String genre;
    private int pages;

    public Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }
}

//execution class

public class PageStats {
	public static void main(String[] args) {
		List<Book> books = List.of(
			    new Book("Clean Code", "Programming", 464),
			    new Book("Effective Java", "Programming", 416),
			    new Book("The Hobbit", "Fantasy", 310),
			    new Book("Harry Potter", "Fantasy", 500),
			    new Book("Atomic Habits", "Self-Help", 320)
			);
		
		//stream
		
		Map<String,DoubleSummaryStatistics>pageStats=books.stream().collect(Collectors.groupingBy(e->e.getGenre(),Collectors.summarizingDouble(Book::getPages)));
		

	}
}
