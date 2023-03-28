package br.com.ExemploJDBC.controller;

import java.sql.SQLException;

import br.com.ExemploJDBC.model.Department;

public class Teste {

	public static void main(String[] args) {
		
		AbstractCRUD<Department> crud;
		// ...
		crud = new CRUDDepartment<Department>();
		try {
			System.out.println(crud.open());
			
			Department d = new Department();
			d.setNameDepartment("DPT. Comp");
			d.setBuildingDepartment("Campus Sede");
			d.setBudgetDepartment(18000.0);
			
			boolean res = crud.create(d);
			if(res) {
				System.out.println("Departamento criado com sucesso");
			} else {
				System.out.println("Erro");
			}
			
			System.out.println(crud.close());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
