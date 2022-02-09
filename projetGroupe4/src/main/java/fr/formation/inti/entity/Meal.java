package fr.formation.inti.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="meal")
public class Meal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_meal")
	private int idMeal;
	
	private float sumCalories;
	private float sumFat;
	private float sumAcidFat;
	private float sumSugar;
	private float sumSalt;
	
	@ManyToOne
	@JoinColumn(name = "user_id_user", nullable = false)
	private User user;
	
	@ManyToMany
    @JoinTable( name = "meal_has_product", joinColumns = @JoinColumn( name = "meal_user_id_user" ), inverseJoinColumns = @JoinColumn( name = "product_bar_code" ) )
	private Set<Product> products;
	
	public Meal() {
		super();
	}
	
	public Meal(int idMeal, float sumCalories, float sumFat, float sumAcidFat, float sumSugar, float sumSalt) {
		super();
		this.idMeal = idMeal;
		this.sumCalories = sumCalories;
		this.sumFat = sumFat;
		this.sumAcidFat = sumAcidFat;
		this.sumSugar = sumSugar;
		this.sumSalt = sumSalt;
	}

	public int getIdMeal() {
		return idMeal;
	}

	public void setIdMeal(int idMeal) {
		this.idMeal = idMeal;
	}

	public float getSumCalories() {
		return sumCalories;
	}

	public void setSumCalories(float sumCalories) {
		this.sumCalories = sumCalories;
	}

	public float getSumFat() {
		return sumFat;
	}

	public void setSumFat(float sumFat) {
		this.sumFat = sumFat;
	}

	public float getSumAcidFat() {
		return sumAcidFat;
	}

	public void setSumAcidFat(float sumAcidFat) {
		this.sumAcidFat = sumAcidFat;
	}

	public float getSumSugar() {
		return sumSugar;
	}

	public void setSumSugar(float sumSugar) {
		this.sumSugar = sumSugar;
	}

	public float getSumSalt() {
		return sumSalt;
	}

	public void setSumSalt(float sumSalt) {
		this.sumSalt = sumSalt;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	

}
