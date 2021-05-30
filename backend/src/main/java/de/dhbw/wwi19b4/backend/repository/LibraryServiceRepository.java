package de.dhbw.wwi19b4.backend.repository;

import de.dhbw.wwi19b4.backend.model.LibraryService;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

// Repository-Interface für einen Library-Service
@RepositoryRestResource(collectionResourceRel = "libraryServices", path = "library-service")
public interface LibraryServiceRepository extends PagingAndSortingRepository<LibraryService, Long> {

    List<LibraryService> findByNameContains(String name);
}
