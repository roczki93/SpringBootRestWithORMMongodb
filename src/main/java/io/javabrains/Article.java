package io.javabrains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

///api/v1/article
//var ArticleSchema = new Schema({
//	  content: {
//	    type: String
//	  },  
//	  coment: {
//	    type: String
//	  },
//	  short: {
//	    type: String
//	  },
//	  title: {
//	    type: String
//	  }
//	});
@Document(collection = "Articles")
public class Article {
	@Id
	private String id;
	private String content;
	private String coment;
	private String sshort;
	private String title;
	
	
	public Article() {}
	public Article(String content, String coment, String sshort, String title) {
		this.content = content;
		this.coment = coment;
		this.sshort = sshort;
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}

//	public void setContent(String content) {
//		this.content = content;
//	}

	public String getComent() {
		return coment;
	}

//	public void setComent(String coment) {
//		this.coment = coment;
//	}

	public String getSshort() {
		return sshort;
	}

//	public void setSshort(String sshort) {
//		this.sshort = sshort;
//	}

	public String getTitle() {
		return title;
	}

//	public void setTitle(String title) {
//		this.title = title;
//	}
	public String getId() {
		return id;
	}

//	public void setId(String id) {
//		this.id = id;
//	}
}
