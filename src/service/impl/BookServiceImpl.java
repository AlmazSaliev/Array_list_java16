package service.impl;

import dao.impl.GeneralDaoImpl;
import models.Book;
import service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {
    GeneralDaoImpl generalDao = new GeneralDaoImpl();
    @Override
    public Book saveBook(Long libraryId, Book book) {
        return generalDao.saveBook(libraryId, book);
    }

    @Override
    public List<Book> getAllBooks(Long libraryId) {
        return generalDao.getAllBooks(libraryId);
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        return generalDao.getBookById(libraryId, bookId);
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        return generalDao.deleteBook(libraryId, bookId);
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        generalDao.clearBooksByLibraryId(libraryId);
    }
}
