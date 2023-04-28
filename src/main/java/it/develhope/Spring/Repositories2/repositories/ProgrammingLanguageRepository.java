package it.develhope.Spring.Repositories2.repositories;

import it.develhope.Spring.Repositories2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Repository interface for ProgrammingLanguage Entity"))
public interface ProgrammingLanguageRepository extends JpaRepository <ProgrammingLanguage, Long> {
}
