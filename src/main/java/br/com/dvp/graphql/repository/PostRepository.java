package br.com.dvp.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dvp.graphql.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
