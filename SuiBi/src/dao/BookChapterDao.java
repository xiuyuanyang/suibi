package dao;

import java.util.List;

import beans.BookChapter;

public interface BookChapterDao {

	int insertBookChapter(BookChapter bc); 
	
	int deleteBookChapter(BookChapter bc);
	
	BookChapter findBookChapterById(String bcid);
	
	List<BookChapter> findBookChapterByBook(String bkid);
	
	int updateBookChapter(BookChapter bc);
}
