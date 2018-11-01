package com.gao.mybatis.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
//@TableName(value="tbl_employee")
public class Dept implements Serializable {
    /**
     * 
     */
	//@TableId(value="id" , type =IdType.AUTO)
    private Integer id;

    /**
     * 部门
     */
    private String deptName;

    /**
     * 是否删除
     */
    private Byte del;
    
    @TableField(exist=false)
	private Double salary ; 

    /**
     * tbl_dept
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
     * 部门
     * @return dept_name 部门
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 部门
     * @param deptName 部门
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 是否删除
     * @return del 是否删除
     */
    public Byte getDel() {
        return del;
    }

    /**
     * 是否删除
     * @param del 是否删除
     */
    public void setDel(Byte del) {
        this.del = del;
    }

	@Override
	public String toString() {
		return "Dept [id=" + id + ", deptName=" + deptName + ", del=" + del + ", salary=" + salary + ", toString()="
				+ super.toString() + "]";
	}
}