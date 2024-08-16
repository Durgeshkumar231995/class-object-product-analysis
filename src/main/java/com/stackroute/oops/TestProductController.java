package com.stackroute.oops;

import java.util.Scanner;

public class TestProductController {

	ProductService productService = null;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ProductService productService = new ProductService();

		System.out.println("Enter Product Code");
		String productNameByCode = productService.findProductNameByCode(s.nextInt());
		System.out.println("productNameByCode  " + productNameByCode);

		System.out.println("******************");

		System.out.println("Enter Product Category");
		Product MaxPriceProductInCategory = productService.findMaxPriceProductInCategory(s.next());
		System.out.println("MaxPriceProductInCategory  " + MaxPriceProductInCategory);

		System.out.println("******************");

		System.out.println("Enter Product Category");
		Product[] productsByCategory = productService.getProductsByCategory(s.next());
		if (productsByCategory.length > 0) {

			for (Product product : productsByCategory) {
				System.out.println("Products As Per Category  " + product);
			}
		} else {
			System.out.println("No products found.");
		}
	}

}
