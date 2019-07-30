package br.com.dvp.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dvp.graphql.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
