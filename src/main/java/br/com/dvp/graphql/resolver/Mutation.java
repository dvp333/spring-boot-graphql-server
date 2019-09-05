package br.com.dvp.graphql.resolver;

import java.time.LocalDate;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import br.com.dvp.graphql.model.Empregado;

public class Mutation implements GraphQLMutationResolver {

   public Empregado novoEmpregado(String nome, Integer idade) {
      return new Empregado(1L, "Diego", 34, LocalDate.now());
   }

   public boolean deletarEmpregado(Long id) {
      return true;
   }

}