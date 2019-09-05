package br.com.dvp.graphql.resolver;

import java.util.Arrays;
import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.com.dvp.graphql.model.Empregado;
import br.com.dvp.graphql.repository.EmpregadoRepository;

public class Query implements GraphQLQueryResolver {

   private EmpregadoRepository empregadoRepository;

   public Query(EmpregadoRepository empregadoRepository) {
      this.empregadoRepository = empregadoRepository;
   }

   public List<Empregado> obterEmpregados() {
      return empregadoRepository.findAll();
   }

   public long contarEmpregados() {
      return empregadoRepository.count();
   }

   public Empregado obterEmpregadoPorId(Long id) {
      return empregadoRepository.findById(id).orElseThrow(null);
   }

 }