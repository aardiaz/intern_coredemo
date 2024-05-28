package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServiceImpl implements ProductService {
	
	static List<Product>  plist = new ArrayList<>();

	@Override
	public void addProduct(Product p) {
		
		//plist.add(p);
		//System.out.println("----added success ----- size = "+plist.size());
		
		 try {
			 
			//Class.forName("");
			//Connection con = 
			 
			String sql = "insert into product(name,company,price)values('"+p.getName()+"','"+p.getPrice()+"','"+p.getCompany()+"') ";  
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProduct(int index) {
		
		plist.remove(index);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return plist;
	}

	
}
