package in.vivek.bookshoppingservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.vivek.bookshoppingservice.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel = "bookCategories", path = "category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
