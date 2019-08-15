package br.com.dvp.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import br.com.dvp.graphql.model.Post;
import br.com.dvp.graphql.repository.PostRepository;

public class Mutation implements GraphQLMutationResolver {
	
	@Autowired
    private PostRepository postRepository;
 
    public Post writePost(Post post) {
        return postRepository.save(post);
    }
}