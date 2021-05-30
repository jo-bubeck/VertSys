package de.dhbw.wwi19b4.backend.repository;

import de.dhbw.wwi19b4.backend.model.Book;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//Repository-Interface für ein Buch
@RepositoryRestResource(collectionResourceRel = "Books", path = "book")
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {

    List<Book> findByTitleContains(String title);
}
