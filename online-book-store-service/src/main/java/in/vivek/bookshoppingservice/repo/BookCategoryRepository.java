package in.vivek.bookshoppingservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import in.vivek.bookshoppingservice.entity.BookCategory;



@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "bookCategories", path = "category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
