package br.com.dvp.graphql.resolver;

import java.time.LocalDate;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import br.com.dvp.graphql.model.Empregado;
import br.com.dvp.graphql.repository.EmpregadoRepository;

public class Mutation implements GraphQLMutationResolver {

   private EmpregadoRepository empregadoRepository;

   public Mutation(EmpregadoRepository empregadoRepository) {
      this.empregadoRepository = empregadoRepository;
   }

   public Empregado novoEmpregado(String nome, Integer idade) {
      Empregado empregado = new Empregado(nome, idade, LocalDate.now());
      empregadoRepository.save(empregado);
      return empregado;
   }

   public boolean deletarEmpregado(Long id) {
      empregadoRepository.deleteById(id);
      return true;
   }

}