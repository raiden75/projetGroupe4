package fr.formation.inti.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private int barCode;
	
	@ManyToMany
    @JoinTable( name = "meal_has_product", joinColumns = @JoinColumn( name = "product_bar_code" ), inverseJoinColumns = @JoinColumn( name = "meal_user_id_user" ) )
	private Set<Meal> meals;
	
	public Product() {
		super();
	}
	
	public Product(int barCode) {
		this.barCode = barCode;
		this.meals = new HashSet<Meal>();
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public Set<Meal> getMeals() {
		return meals;
	}

	public void setMeals(Set<Meal> meals) {
		this.meals = meals;
	}
	
	

}
