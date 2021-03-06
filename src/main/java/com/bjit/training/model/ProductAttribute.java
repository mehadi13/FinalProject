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
 * ProductAttributes generated by hbm2java
 */
@Entity
@Table(name = "product_attributes", catalog = "dbtest")
public class ProductAttribute implements java.io.Serializable {

	private Integer id;
	private Product products;
	private String attributeType;
	private Date createdAt;
	private Date updatedAt;
	private Set<ProductAttributeItem> productAttributeItemses = new HashSet<ProductAttributeItem>(0);

	public ProductAttribute() {
	}

	public ProductAttribute(Product products, String attributeType, Date createdAt, Date updatedAt) {
		this.products = products;
		this.attributeType = attributeType;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public ProductAttribute(Product products, String attributeType, Date createdAt, Date updatedAt,
			Set<ProductAttributeItem> productAttributeItemses) {
		this.products = products;
		this.attributeType = attributeType;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.productAttributeItemses = productAttributeItemses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false)
	public Product getProducts() {
		return this.products;
	}

	public void setProducts(Product products) {
		this.products = products;
	}

	@Column(name = "attribute_type", nullable = false, length = 16)
	public String getAttributeType() {
		return this.attributeType;
	}

	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productAttributes")
	public Set<ProductAttributeItem> getProductAttributeItemses() {
		return this.productAttributeItemses;
	}

	public void setProductAttributeItemses(Set<ProductAttributeItem> productAttributeItemses) {
		this.productAttributeItemses = productAttributeItemses;
	}

}
