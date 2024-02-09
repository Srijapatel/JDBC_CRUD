package com.task.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.util.DBUtil;

public class EmployeeDaoImpl implements IEmployeeDao{
	public static PreparedStatement pst=null;
	public static Connection connection=null;
	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {		
		int empId=bean.getEmpid();
		String empName=bean.getEmpname();
		String empAddress=bean.getEmpaddress();
		 Connection connection=DBUtil.getDBConnection();
		 pst=connection.prepareStatement("insert into emp values(?,?,?)");
		 pst.setInt(1, empId);
		 pst.setString(2, empName);
		 pst.setString(3, empAddress);
		  pst.executeUpdate();
		  System.out.println("insert one record successfully");
		  }
	@Override
	public void updateEmployee(EmployeeBean bean) throws SQLException, ClassNotFoundException {
		int empId=bean.getEmpid();
		String empName=bean.getEmpname();
		String empAddress=bean.getEmpaddress();
		 Connection connection=DBUtil.getDBConnection();
		 pst=connection.prepareStatement("UPDATE emp SET empName = ?, empAddress = ? WHERE empId = ?");
		 pst.setString(1, empName);
		 pst.setString(2, empAddress);
		 pst.setInt(3, empId);
		  pst.executeUpdate();
		  System.out.println("updated one record successfully");	
	} 
	
	
	@Override
	public void selectEmployee(EmployeeBean bean) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
			int empId=bean.getEmpid();
			String empName=bean.getEmpname();
			String empAddress=bean.getEmpaddress();
			connection=DBUtil.getDBConnection();
			pst=connection.prepareStatement("SELECT * FROM emp WHERE empId =? AND empName = ? AND empAddress = ?");
			 pst.setInt(1, empId);
			pst.setString(2, empName);
		    pst.setString(3, empAddress);
		    pst.execute();
		    System.out.println("selected one record sucessfully");
		}
	@Override
	public void deleteEmployee(EmployeeBean bean) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		int empId=bean.getEmpid();
		String empName=bean.getEmpname();
		String empAddress=bean.getEmpaddress();
		connection=DBUtil.getDBConnection();
		pst=connection.prepareStatement("DELETE FROM emp WHERE empId =? AND empName = ? AND empAddress = ?");
		 pst.setInt(1, empId);
		pst.setString(2, empName);
	    pst.setString(3, empAddress);
	    pst.execute();
	    System.out.println("deleted one record sucessfully");
	}
}
	

	

