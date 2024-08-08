package com.example.demo.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name="users")
public class Users {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
    int User_Id;
	@Column
    String username;
	@Column
    String password;
	@Column
    String firstName;
	@Column
    String LastName;
	@Column
    String mobile;
	@Column
    String email;
	@Column
    String gender;
	@Column
    int r_id;
	@Column
    String status;
	
	 @JsonIgnoreProperties("users")
	    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
	    Set<Product> products;
	
}