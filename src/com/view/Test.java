package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class Test {
	
	public static void main(String[] args) {
		
		add();
		getAll();
		delete();
		//get all product after deleted
		getAll();
	}
	
	//add
	static void add() {
		
		ProductService  service = new ProductServiceImpl();
		char flag =  'y';
	   Scanner  sc = new Scanner(System.in);
	   
		do {
			Product  pd = new Product();
			
			System.out.println("Enter id ");
			pd.setId(sc.nextInt());
			
			System.out.println("Enter Name ");
			pd.setName(sc.next());
			
			pd.setPrice(80000);
			pd.setCompany("Samsung");
			
			service.addProduct(pd);
			
			System.out.println("do you want to add more[y/n]");
			flag = sc.next().charAt(0);
			
		}while(flag == 'y');
	}
	
	//get all
	static void getAll() {
		
		ProductService  service = new ProductServiceImpl();
		List<Product> plist = service.getAllProducts();
		System.out.println(plist);
	}
	
	//delete
	static void  delete() {
		ProductService  service = new ProductServiceImpl();
		service.deleteProduct(0);
	}

}
