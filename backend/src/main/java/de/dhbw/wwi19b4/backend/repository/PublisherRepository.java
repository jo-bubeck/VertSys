package de.dhbw.wwi19b4.backend.repository;

import de.dhbw.wwi19b4.backend.model.Publisher;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "Publishers", path = "publisher")
public interface PublisherRepository extends PagingAndSortingRepository<Publisher, Long> {

    List<Publisher> findByNameContains(String name);
}
