package br.com.dvp.graphql.resolver;

import java.util.List;

import org.springframework.data.domain.PageRequest;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.com.dvp.graphql.model.User;
import br.com.dvp.graphql.repository.UserRepository;

public class UsuarioQueryResolver implements GraphQLQueryResolver {
    
	private UserRepository userRepository;
    
    public List<User> getRecentPosts(int count, int offset) {
        return userRepository.findAll(PageRequest.of(offset, count)).getContent();
    }
}