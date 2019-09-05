package br.com.dvp.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.dvp.graphql.resolver.Mutation;
import br.com.dvp.graphql.resolver.Query;

@SpringBootApplication
public class GraphQLApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQLApplication.class, args);
	}
	
	@Bean
	public Query query() {
		return new Query();
	}

	@Bean
	public Mutation mutation() {
		return new Mutation();
	}

}
