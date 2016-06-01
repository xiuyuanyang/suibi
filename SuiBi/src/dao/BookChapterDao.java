package dao;

import java.util.List;

import beans.BookChapter;

public interface BookChapterDao {

	int insertBookChapter(BookChapter bc); 
	
	int deleteBookChapter(BookChapter bc);
	
	BookChapter findBookChapterByChapterId(String bcid);
	
	List<BookChapter> findBookChapterByBookId(String bkid);
	
	int updateBookChapter(BookChapter bc);
}
