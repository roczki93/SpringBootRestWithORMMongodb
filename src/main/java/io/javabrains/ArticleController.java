package io.javabrains;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;

@RestController
@RequestMapping("/api/v1/article")
public class ArticleController {
	private ArticleRepository articleRepository;

	public ArticleController(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}
	
	@GetMapping
	public Page<Article> getTen(){
		Page<Article> articles = this.articleRepository.findAll(new PageRequest(0, 10));
		
		return articles;
	}
	@GetMapping("/all")
	public List<Article> getAll(){
		List<Article> articles = this.articleRepository.findAll();
		
		return articles;
	}
	@PostMapping
	public void insert(@RequestBody Article article) {
		this.articleRepository.insert(article);
	}
	
	
	@PutMapping
	public void update(@RequestBody Article article) {
		this.articleRepository.save(article);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		this.articleRepository.delete(id);
	}
	@GetMapping("/{id}")
	public Article getById(@PathVariable("id") String id)
	{
		Article article = this.articleRepository.findOne(id);
		return article;
	}
}
