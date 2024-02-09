package com.task.bean;

public class EmployeeBean {

		private int empid;
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public String getEmpaddress() {
			return empaddress;
		}
		public void setEmpaddress(String empaddress) {
			this.empaddress = empaddress;
		}
		private String empname;
		private String empaddress;
		public EmployeeBean() {
			super();
			// TODO Auto-generated constructor stub
		}
		public EmployeeBean(int empid, String empname, String empaddress) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.empaddress = empaddress;
		}
		@Override
		public String toString() {
			return "EmployeeBean [empid=" + empid + ", empname=" + empname + ", empaddress=" + empaddress + "]";
		}
		

	}

