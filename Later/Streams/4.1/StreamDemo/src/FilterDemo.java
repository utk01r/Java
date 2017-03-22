import java.util.ArrayList;
import java.util.List;

/**
 * Filtering Collection without using Stream:
 * 
 * In this example, We are filtering data without using
 * stream. This approach we are used before the stream package was
 * released.
 *
 */

public class FilterDemo
{
	public static void main(String[] args)
	{
		List<Product> productList = new ArrayList<Product>();

		// Adding Products
		productList.add(new Product(1, "Sony mobile", 25000));
		productList.add(new Product(2, "Lenovo mobile", 15000));
		productList.add(new Product(3, "Nokia mobile", 10000));
		productList.add(new Product(4, "Samsung mobile", 40000));

		List<Product> filteredProductPriceList = new ArrayList<Product>();

		for (Product product : productList)
		{

			/*
			 * Filter the product, whose price is less than 30000 and
			 * add the product in filteredProductPriceList.
			 * 
			 */
			if (product.getPrice() < 30000)
			{
				// Adding product
				filteredProductPriceList.add(product);
			}
		}
		System.out.println(filteredProductPriceList);
	}

}