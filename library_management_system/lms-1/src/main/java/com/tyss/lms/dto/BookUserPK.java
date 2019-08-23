package com.tyss.lms.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Embeddable
@Data
public class BookUserPK implements Serializable {
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id")
	
	private String educationType;
	
}
