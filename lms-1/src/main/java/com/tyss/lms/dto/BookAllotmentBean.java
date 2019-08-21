package com.tyss.lms.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="book_allotment_bean")
@Data
public class BookAllotmentBean implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookallId;
	@ManyToOne
	@JoinColumn(name = "isbn_no")
	private BookDetailsBean ISBNNo;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserRegisterBean userId;
	
	@Column(name="issue_date")
	private Date issueDate;
	
	@Column(name="last_date")
	private Date lastDate;
}
