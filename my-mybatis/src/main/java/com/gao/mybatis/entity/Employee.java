package com.gao.mybatis.entity;

import java.io.Serializable;

import com.gao.mybatis.enums.Sex;

public class Employee implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String lastName;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private Sex gender;

    @Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", email=" + email + ", gender=" + gender + ", age="
				+ age + ", deptId=" + deptId + ", toString()=" + super.toString() + "]";
	}

	/**
     * 
     */
    private Integer age;

    /**
     * 部门id
     */
    private Integer deptId;

    /**
     * tbl_employee
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return last_name 
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * 
     * @return email 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 
     * @return 
     * @return gender 
     */
    public  Sex getGender() {
        return gender;
    }

    /**
     * 
     * @param gender 
     */
    public void setGender(Sex gender) {
        this.gender = gender == null ? null : gender;
    }

    /**
     * 
     * @return age 
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 
     * @param age 
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 部门id
     * @return dept_id 部门id
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 部门id
     * @param deptId 部门id
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}