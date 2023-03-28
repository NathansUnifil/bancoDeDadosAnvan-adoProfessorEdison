package br.com.ExemploJDBC.controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.ExemploJDBC.model.Department;

public class CRUDDepartment<T> extends AbstractCRUD<T> {
	
	@Override
	public boolean create(T o) throws SQLException {
		// TODO Auto-generated method stub
		Department dep = (Department) o;
		String query = 
				"INSERT INTO department (dept_name, building, budget) "
				+ "VALUES (?, ?, ?)";
		PreparedStatement stmt = super.connection.prepareStatement(query);
		stmt.setString(1, dep.getNameDepartment());
		stmt.setString(2, dep.getBuildingDepartment());
		stmt.setDouble(3, dep.getBudgetDepartment());
		int rows = stmt.executeUpdate();
		if(rows > 0) {
			return true;
		}
		return false;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(T o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<T> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
