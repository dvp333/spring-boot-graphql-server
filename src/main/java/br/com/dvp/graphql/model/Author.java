package br.com.dvp.graphql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	
	@Column
	private String thumbnail;
	
	
	
}
