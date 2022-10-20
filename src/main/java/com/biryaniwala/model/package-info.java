package com.biryaniwala.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class biryani {
    
	@Id
	private int biryaniId;
	private String biryaniType;
	private String biryaniName;
	private int biryaniPrice;
	private String biryaniDesc;
}