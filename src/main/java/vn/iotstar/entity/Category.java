package vn.iotstar.entity;

import java.io.Serializable;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "categories")
public class Category implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categoryid")
	private int id;

	@Column(name = "Categoryname", columnDefinition = "nvarchar(50) NOT NULL")
	private String name;

	@Column(name = "Images", columnDefinition = "nvarchar(500) NULL")
	private String images;

	@Column(name = "status")
	private int status;

	
 

}
