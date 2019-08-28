package com.edu.realestate.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "advertisement_id")
public class Picture {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Lob
	private byte[] content;
	
	private Integer codage;

	public Picture() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public Integer getCodage() {
		return codage;
	}

	public void setCodage(Integer codage) {
		this.codage = codage;
	}

	@Override
	public String toString() {
		return "Picture [id=" + id + ", content=" + Arrays.toString(content) + ", codage=" + codage + "]";
	}
	
	
	

}
