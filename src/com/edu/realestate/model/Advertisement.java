package com.edu.realestate.model;
import java.time.LocalDate;
import java.util.List;

public class Advertisement {
	private int id; 
	private String title;
	private AdStatus status;
	private TransactionType transactionType;
	private LocalDate releaseDate;
	private String description; 
	private String adNumber;
	private String refusedComment;
	private Advertiser advertiser;
	private RealEstate realEstate;
	
	private List<Picture> pictures ;
	
	public Advertisement() {
		super();
	}
	

	public Advertisement(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public AdStatus getStatus() {
		return status;
	}

	public void setStatus(AdStatus status) {
		this.status = status;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAdNumber() {
		return adNumber;
	}

	public void setAdNumber(String adNumber) {
		this.adNumber = adNumber;
	}

	public String getRefusedComment() {
		return refusedComment;
	}

	public void setRefusedComment(String refusedComment) {
		this.refusedComment = refusedComment;
	}

	public Advertiser getAdvertiser() {
		return advertiser;
	}

	public void setAdvertiser(Advertiser advertiser) {
		this.advertiser = advertiser;
	}

	public RealEstate getRealEstate() {
		return realEstate;
	}

	public void setRealEstate(RealEstate realEstate) {
		this.realEstate = realEstate;
	}

	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}


	@Override
	public String toString() {
		return "Advertisement [id=" + id + ", title=" + title + ", status=" + status + ", transactionType="
				+ transactionType + ", releaseDate=" + releaseDate + ", description=" + description + ", adNumber="
				+ adNumber + ", refusedComment=" + refusedComment + ", advertiser=" + advertiser + ", realEstate="
				+ realEstate + ", pictures=" + pictures + "]";
	}


	

	
	

}


