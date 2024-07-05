package com.example.BPS;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor  
@AllArgsConstructor 
@Entity
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Getter @Setter
	private Long id;
	
	@Getter @Setter
	private String Customername;
	@Getter @Setter
	private String status;
	
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    @Getter @Setter
	private List<Item> items;

	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}
}
