package br.com.dvp.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dvp.graphql.model.Empregado;

@Repository
public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {

}