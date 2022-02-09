package fr.formation.inti.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private int userId;
	private String email;
	private String password;
	private int score;
	private boolean doSport;
	private boolean male;
	private boolean menuSimplifié;
	
	@OneToMany(mappedBy = "idMeal", targetEntity = Meal.class)
	private Set<Meal> meals = new HashSet<Meal>();
	
	public User() {
		super();
	}
	
	public User(int userId, String email, String password, boolean doSport, boolean male, boolean menuSimplifié) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.doSport = doSport;
		this.male = male;
		this.menuSimplifié = menuSimplifié;
		this.score = 0;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isDoSport() {
		return doSport;
	}

	public void setDoSport(boolean doSport) {
		this.doSport = doSport;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public boolean isMenuSimplifié() {
		return menuSimplifié;
	}

	public void setMenuSimplifié(boolean menuSimplifié) {
		this.menuSimplifié = menuSimplifié;
	}

	public Set<Meal> getMeals() {
		return meals;
	}

	public void setMeals(Set<Meal> meals) {
		this.meals = meals;
	}
	
	

}
