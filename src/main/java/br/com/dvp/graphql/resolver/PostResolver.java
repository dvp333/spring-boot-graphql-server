package br.com.dvp.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;

import br.com.dvp.graphql.model.Author;
import br.com.dvp.graphql.model.Post;
import br.com.dvp.graphql.repository.AuthorRepository;

public class PostResolver implements GraphQLResolver<Post> {
    
	private AuthorRepository authorRepository;
 
    public Author getAuthor(Post post) {
        return authorRepository.findById(post.getAuthorId()).get();
    }
}