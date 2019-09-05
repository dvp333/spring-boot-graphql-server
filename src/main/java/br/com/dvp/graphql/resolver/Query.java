package br.com.dvp.graphql.resolver;

import java.util.Arrays;
import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.com.dvp.graphql.model.Empregado;

public class Query implements GraphQLQueryResolver {

    List<Empregado> empregados = Arrays.asList(new Empregado());
 
    public List<Empregado> obterEmpregados() {
       return empregados;
    }
 
    public long contarEmpregados() {
       return empregados.size();
    }
 
    public Empregado obterEmpregadoPorId(Long id) {
       return empregados.stream().filter(e -> e.getId() == id).findFirst().get();
    }
 
 }