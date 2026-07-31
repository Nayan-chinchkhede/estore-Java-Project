package com.Bean;

import java.io.Serializable;

public class AdminBean implements  Serializable{
	
	private String aUname,apword,afname,alname,addr,amid,aphno;

	public String getaUname() {
		return aUname;
	}

	public void setaUname(String aUname) {
		this.aUname = aUname;
	}

	public String getApword() {
		return apword;
	}

	public void setApword(String apword) {
		this.apword = apword;
	}

	public String getAfname() {
		return afname;
	}

	public void setAfname(String afname) {
		this.afname = afname;
	}

	public String getAlname() {
		return alname;
	}

	public void setAlname(String alname) {
		this.alname = alname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAmid() {
		return amid;
	}

	public void setAmid(String amid) {
		this.amid = amid;
	}

	public String getAphno() {
		return aphno;
	}

	public void setAphno(String aphno) {
		this.aphno = aphno;
	}
	
}
