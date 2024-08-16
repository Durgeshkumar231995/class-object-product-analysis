package com.stackroute.oops;

import java.util.ArrayList;
import java.util.List;

/*
    Class for Analyzing the products present in ProductRepository
 */
public class ProductService {
	
	//ProductRepository productRepository=new ProductRepository();

    /*
        Returns the name of the product given the productCode
     */
	public String findProductNameByCode(int productCode) {
		if (productCode <= 0) {
			return "Please enter correct productCode";
		}
		Product[] products = ProductRepository.getProducts();

		String ProductName = null;
		for (int i = 0; i < products.length; i++) {
			if (products[i].getProductCode() == productCode)
				return ProductName = products[i].getName();

		}
		return ProductName;
	}

    /*
        Returns the Product with maximum price in a given category
     */
    public Product findMaxPriceProductInCategory(String category) {
    	if (category==null || category.isEmpty() || category.isBlank()) {
			return null;
		}
		Product[] products = ProductRepository.getProducts();
		Product maxPriceProduct=null;
		double maxPrice = Double.NEGATIVE_INFINITY;

        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                if (product.getPrice() > maxPrice) {
                    maxPrice = product.getPrice();
                    maxPriceProduct = product;
                }
            }
        }
		
        return maxPriceProduct;
    }

    /*
        Returns a array of products for a given category
     */
    public Product[] getProductsByCategory(String category) {
    	
    	if (category==null || category.isEmpty() || category.isBlank()) {
			return null;
		}
    	
    	if (category.equals("unknown")) {
			return null;
		}
    	
    	 
		Product[] products = ProductRepository.getProducts();
		
	
		List<Product> p = new ArrayList<>();
		for (Product product : products) {
            if (product.getCategory()!=null && product.getCategory().equalsIgnoreCase(category)) {
                p.add(product);
            }
        }

        return p.toArray(new Product[0]);
    }
}
