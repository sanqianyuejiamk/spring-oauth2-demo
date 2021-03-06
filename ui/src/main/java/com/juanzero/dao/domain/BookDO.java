package com.juanzero.dao.domain;

import java.util.Date;

public class BookDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.price
     *
     * @mbg.generated
     */
    private Integer price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.TENANT_ID
     *
     * @mbg.generated
     */
    private String tenantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.id
     *
     * @return the value of book.id
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.id
     *
     * @param id the value for book.id
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.name
     *
     * @return the value of book.name
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.name
     *
     * @param name the value for book.name
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.price
     *
     * @return the value of book.price
     * @mbg.generated
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.price
     *
     * @param price the value for book.price
     * @mbg.generated
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.TENANT_ID
     *
     * @return the value of book.TENANT_ID
     * @mbg.generated
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.TENANT_ID
     *
     * @param tenantId the value for book.TENANT_ID
     * @mbg.generated
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.created_at
     *
     * @return the value of book.created_at
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.created_at
     *
     * @param createdAt the value for book.created_at
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}