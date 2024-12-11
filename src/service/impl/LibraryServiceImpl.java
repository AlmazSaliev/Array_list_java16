package service.impl;

import dao.impl.GeneralDaoImpl;
import models.Library;
import service.LibraryService;

import java.util.List;

public class LibraryServiceImpl implements LibraryService {
    GeneralDaoImpl generalDao = new GeneralDaoImpl();
    @Override
    public List<Library> saveLibrary(List<Library> libraries) {
        return generalDao.saveLibrary(libraries);
    }

    @Override
    public List<Library> getAllLibraries() {
        return generalDao.getAllLibraries();
    }

    @Override
    public Library getLibraryById(Long id) {
        return generalDao.getLibraryById(id);
    }

    @Override
    public Library updateLibrary(Long id, Library library) {
        return generalDao.updateLibrary(id, library);
    }

    @Override
    public String deleteLibrary(Long id) {
        return generalDao.deleteLibrary(id);
    }
}
