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
 * ProductAttributeItems generated by hbm2java
 */
@Entity
@Table(name = "product_attribute_Items", catalog = "dbtest")
public class ProductAttributeItems implements java.io.Serializable {

	private Integer id;
	private ProductAttributes productAttributes;
	private String item;
	private Date createdAt;
	private Date updatedAt;
	//private Set<OrderProducts> orderProductses = new HashSet<OrderProducts>(0);

	public ProductAttributeItems() {
	}

	public ProductAttributeItems(ProductAttributes productAttributes, String item) {
		this.productAttributes = productAttributes;
		this.item = item;
	}

	/*public ProductAttributeItems(ProductAttributes productAttributes, String item, Date createdAt, Date updatedAt,
			Set<OrderProducts> orderProductses) {
		this.productAttributes = productAttributes;
		this.item = item;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.orderProductses = orderProductses;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "attribute_id", nullable = false)
	public ProductAttributes getProductAttributes() {
		return this.productAttributes;
	}

	public void setProductAttributes(ProductAttributes productAttributes) {
		this.productAttributes = productAttributes;
	}

	@Column(name = "item", nullable = false, length = 32)
	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 19)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", length = 19)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "productAttributeItems")
	public Set<OrderProducts> getOrderProductses() {
		return this.orderProductses;
	}

	public void setOrderProductses(Set<OrderProducts> orderProductses) {
		this.orderProductses = orderProductses;
	}*/

}
