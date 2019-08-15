package br.com.dvp.graphql.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.com.dvp.graphql.model.Post;
import br.com.dvp.graphql.repository.PostRepository;

public class Query implements GraphQLQueryResolver {
    
	@Autowired
	private PostRepository postRepository;
    
    public List<Post> getRecentPosts(int count, int offset) {
        return postRepository.findAll(PageRequest.of(offset, count)).getContent();
    }
}