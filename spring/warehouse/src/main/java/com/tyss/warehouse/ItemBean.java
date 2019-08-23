package com.tyss.warehouse;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="item")
public class ItemBean {
	@Id
	@Column(name="item_id")
	private int itemID;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="description")
	private String description;
	
	@Column(name="capacity")
	private int capacity;
	
	@Column(name="cost")
	private double cost;
	
}
