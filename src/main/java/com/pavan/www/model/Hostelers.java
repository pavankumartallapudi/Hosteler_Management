package com.pavan.www.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hostelers {
	
	@Column
	private String name;
	@Column
	private String fathersName;
	@Column
	private String dob;
	@Column
	private String doj;
	@Column
	private int room_No;
	@Id
	private String mobileNumber;
	@Column
	private int sharing;
	@Column
	private String address;
	@Column
	private String fatherMobileNumber;
	@Column
	private String qualification;
	
	
}
