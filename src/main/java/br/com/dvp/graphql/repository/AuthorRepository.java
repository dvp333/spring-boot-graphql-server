package br.com.dvp.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dvp.graphql.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
