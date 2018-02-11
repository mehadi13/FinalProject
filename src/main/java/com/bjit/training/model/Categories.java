package com.bjit.training.model;
// Generated Feb 11, 2018 11:30:26 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Categories generated by hbm2java
 */
@Entity
@Table(name = "categories", catalog = "dbtest")
public class Categories implements java.io.Serializable {

	private Integer id;
	private Categories categories;
	private String name;
	private String image;
	private Date createdAt;
	private Date updatedAt;
	/*private Set<Categories> categorieses = new HashSet<Categories>(0);
	private Set<Products> productses = new HashSet<Products>(0);*/

	public Categories() {
	}

	public Categories(Categories categories, String name, Date createdAt, Date updatedAt) {
		this.categories = categories;
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	/*public Categories(Categories categories, String name, String image, Date createdAt, Date updatedAt,
			Set<Categories> categorieses, Set<Products> productses) {
		this.categories = categories;
		this.name = name;
		this.image = image;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.categorieses = categorieses;
		this.productses = productses;
	}*/

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id", nullable = false)
	public Categories getCategories() {
		return this.categories;
	}*/

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	@Column(name = "name", nullable = false, length = 32)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "image", length = 256)
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, length = 19)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", nullable = false, length = 19)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	public Set<Categories> getCategorieses() {
		return this.categorieses;
	}

	public void setCategorieses(Set<Categories> categorieses) {
		this.categorieses = categorieses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	public Set<Products> getProductses() {
		return this.productses;
	}

	public void setProductses(Set<Products> productses) {
		this.productses = productses;
	}*/

}
