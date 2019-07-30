package br.com.dvp.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import br.com.dvp.graphql.model.User;
import br.com.dvp.graphql.repository.UserRepository;

public class UserMutationResolver implements GraphQLMutationResolver {
    
	private UserRepository userRepository;
 
    public User writeUser(String login, String name) {
        return userRepository.save(new User(login, name));
    }
}