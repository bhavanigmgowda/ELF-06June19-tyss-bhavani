package com.tyss.lms.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Book_details")
@Data
public class BookDetailsBean implements Serializable{

	@Id
	@Column(name = "isbn_no")
	private Integer ISBNNo;

	@Column(name = "book_no")
	private Integer bookNo;

	@Column(name = "book_title")
	private String bookTitle;

	@Column(name = "no_of_pages")
	private int noOfPages;


	@Column(name = "quantity")
	private int quantity;

	
	@Column(name = "author_name")
	private String authorName;

	@Column(name = "publisher_name")
	private String publisherName;

	@Column(name = "published_date")
	private Date publishedDate;

	@Column(name = "edition")
	private Integer edition;

}
