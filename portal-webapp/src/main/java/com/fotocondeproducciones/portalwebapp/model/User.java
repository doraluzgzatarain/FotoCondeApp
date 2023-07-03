package com.fotocondeproducciones.portalwebapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="USER" , schema="FOTOCONDEDB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@Column(name = "CONTRACT_NO", unique = true, nullable = false)
	private String contractNo;
	
	@Column(name = "STUDENT_NAME", nullable = false)
	private String studentName;
	
	@Column(name = "SCHOOL_GROUP", nullable = false)
	private String schoolGroup;
	
	@Column(name = "SCHOOL_NAME", nullable = false)
	private String schoolName;
	
	@Column(name = "GENERATION", nullable = false)
	private String generation;
	
	@Column(name = "SHIRT_SIZE")
	private String shirtSize;
	
	@Column(name = "TOGA_SIZE")
	private String togaSize;
	
	@Column(name = "RING_SIZE")
	private String ringSize;
	
	@Column(name = "CELLPHONE", nullable = false)
	private String cellPhone;
	
	@Column(name = "HOME_PHONE")
	private String homePhone;
	
	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	@Column(name = "ADDRESS", nullable = false)
	private String address;
	
	@Column(name = "TUTOR", nullable = false)
	private String tutor;
	
	@Column(name = "KIT_TYPE", nullable = false)
	private String kitType;
	
	@Column(name = "PASSWORD", nullable = false)
	private String password;

	
} //class Usuario
