package de.dhbw.wwi19b4.backend.repository;

import de.dhbw.wwi19b4.backend.model.Author;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "Authors", path = "author")
public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {

    List<Author> findByNameContains(String name);
}
