package it.develhope.Spring.Repositories2.repositories;

import it.develhope.Spring.Repositories2.entities.ProgrammingLanguage;
import jdk.jfr.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController(path = "repo-prog-languages",collectionResourceDescription @Description("Repository interface of ProgrammingLanguage entity"))
public interface ProgrammingLanguageRepository extends JpaRepository <ProgrammingLanguage, Long> {
}
