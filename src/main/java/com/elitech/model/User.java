package com.elitech.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(nullable = false,length = 70)
private String nom_complet;
@Min(value = 18)
private int age;
@Column(nullable = false)
private String adresse;
@Column(nullable = false,unique = true)
private String telephone;
@Column(nullable = false,unique = true)
private String email;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom_complet() {
	return nom_complet;
}
public void setNom_complet(String nom_complet) {
	this.nom_complet = nom_complet;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String nom_complet, int age, String adresse, String telephone, String email) {
	super();
	this.id = id;
	this.nom_complet = nom_complet;
	this.age = age;
	this.adresse = adresse;
	this.telephone = telephone;
	this.email = email;
}

}
