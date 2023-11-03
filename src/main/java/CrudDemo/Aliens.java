package CrudDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alienTable")
public class Aliens {
	@Id
	private int aid;
	private String alienname;
	private String color;
	
	public Aliens(){
		
	}
	public Aliens(int aid, String alienname, String color, String plante) {
		super();
		this.aid = aid;
		this.alienname = alienname;
		this.color = color;
		this.plante = plante;
	}
	private String plante;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAlienname() {
		return alienname;
	}
	public void setAlienname(String alienname) {
		this.alienname = alienname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPlante() {
		return plante;
	}
	public void setPlante(String plante) {
		this.plante = plante;
	}
	@Override
	public String toString() {
		return "Aliens [aid=" + aid + ", alienname=" + alienname + ", color=" + color + ", plante=" + plante + "]";
	}
}
