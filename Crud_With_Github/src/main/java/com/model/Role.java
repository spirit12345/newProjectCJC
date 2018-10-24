package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
@Id
private int roleid;
private String role;
public int getRoleid() {
	return roleid;
}
public void setRoleid(int roleid) {
	this.roleid = roleid;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

}
