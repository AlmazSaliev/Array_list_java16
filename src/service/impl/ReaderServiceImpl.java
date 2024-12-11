package service.impl;

import dao.impl.GeneralDaoImpl;
import models.Reader;
import service.ReaderService;

import java.util.List;

public class ReaderServiceImpl implements ReaderService {
    GeneralDaoImpl generalDao = new GeneralDaoImpl();
    @Override
    public void saveReader(Reader reader) {
        generalDao.saveReader(reader);
    }

    @Override
    public List<Reader> getAllReaders() {
        return generalDao.getAllReaders();
    }

    @Override
    public Reader getReaderById(Long id) {
        return generalDao.getReaderById(id);
    }

    @Override
    public Reader updateReader(Long id, Reader reader) {
        return generalDao.updateReader(id, reader);
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {
        generalDao.assignReaderToLibrary(readerId, libraryId);
    }
}
