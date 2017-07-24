package io.javabrains;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeeder implements CommandLineRunner{
	private ArticleRepository articleRepository;
	
	public DbSeeder(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}
	
	@Override
	public void run(String... strings) throws Exception{
		Article fth = new Article(
				"Article Ex", 
				"Arttt", 
				"Arts", 
				"ARRRt");
//		this.articleRepository.deleteAll();
		
		List<Article> articles = Arrays.asList(fth);
		this.articleRepository.save(articles);
	}
	
	
}
