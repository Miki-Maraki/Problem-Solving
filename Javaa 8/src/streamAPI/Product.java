package streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public String getName() {  
        return name;  
    } 
 public int getId() {  
        return id;  
    }   
    public float getPrice() {  
        return price;  
    }  

	public String toString() {
		return "[Id = " + id + " , name = " + name + " , Price = " + price + "]";
	}

	public static void main(String[] args) {
		List<Product> prLt = new ArrayList<Product>(); // type Product
		// Adding Products
		prLt.add(new Product(3, "Lenevo Laptop", 28000f));
		prLt.add(new Product(1, "HP Laptop", 25000f));
		prLt.add(new Product(4, "Sony Laptop", 28000f));
		prLt.add(new Product(5, "Apple Laptop", 90000f));
		prLt.add(new Product(2, "Dell Laptop", 30000f));
		prLt.add(new Product(6, "Sony Laptop", 45000f));

		System.out.println("Sorting on the basis of name...");

		// implementing lambda expression
		Collections.sort(prLt, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
		for (Product p : prLt) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
		// Filtering Collection without using Stream
		List<Float> productPriceList = new ArrayList<Float>(); // type Float
		for (Product prdct : prLt) { // use enhance for loop
			// System.out.println("List of the product " + prdct); // print all of product by filtering data of list
			if (prdct.price < 30000) {
				productPriceList.add(prdct.price); // adding price to a productPriceList
			}
		}
		System.out.println("Product price < 30000 : " + productPriceList); // displaying data

		// using lambda to filter data and iterate through collection 
        Stream<Product> filtered_data = prLt.stream().filter(p -> p.price > 30000);                  // ... option 1
        filtered_data.forEach(product -> System.out.println(product.name+": "+product.price)); 
       
		// Filtering Collection by using Stream
		List<Float> productPriceList2 = prLt.stream().filter(p -> p.price > 30000)// filtering data  // ... option 2
				.map(p -> p.price) .collect(Collectors.toList()); // collecting as list
		System.out.println("products that have price > 30000 : " + productPriceList2);

		// Filtering and Iterating Collection data
		prLt.stream().filter(p->p.price == 30000).forEach(p-> System.out.println("Name of the product is : " + p.name));
		prLt.stream() .filter(n-> n.id == 5) .forEach(n -> System.out.println("Name of product is : " + n.name));

		// stream: using reduce() Method in Collection
		Float totalPrice = prLt.stream().map(product -> product.price).reduce(0.0f, (sum, price) -> sum + price); 
		System.out.println("Total price is " + totalPrice); // accumulating  price
		
		// More precise code
		Float totPric = prLt.stream().map(pr -> pr.price).reduce(0.0f, Float::sum); // by referring method of Float class																													
		System.out.println("Total price is " + totPric);
		
		// Using Collectors's method to sum the prices.
		double totalPrice3 = prLt.stream().collect(Collectors.summingDouble(product -> product.price));
		System.out.println("Total price is " + totalPrice3);

		// Stream: Find Max and Min Product Price
		// max() method to get max Product price
		Product productA = prLt.stream().max((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
		System.out.println("Max price : " + productA.price);

		// min() method to get min Product price
		Product productB = prLt.stream().min((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
		System.out.println("Min price : " + productB.price);

		// Stream: count() Method in Collection
		// count number of products based on the filter
		long countPrice = prLt.stream().filter(product -> product.price < 30000).count();
		System.out.println("count price < 30000: " + countPrice);

		// Stream : Convert List into Set ... Converting product List into Set
		Set<Float> proPric1 = prLt.stream().filter(p -> p.price < 30000) // filter product on the base of price
				.map(p -> p.price).collect(Collectors.toSet()); // collect it as Set(remove duplicate elements)																		
		System.out.println("price < 30000 without repeat" + proPric1);

		// Stream : Convert List into Map ... Converting Product List into a Map
		Map<Integer, String> proMap = prLt.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println("product id and name : " + proMap);

		// Method Reference in stream
		List<Float> productPriceList3 = prLt.stream().filter(p -> p.price > 30000) // filtering data
				.map(Product::getPrice) // fetching price by referring getPrice method
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList3);

		// Stream filter()
		prLt.stream().filter(p -> p.price > 30000) // filtering price     // option 1
				.map(pm -> pm.price) // fetching price
				.forEach(System.out::println); // iterating price by method reference

		List<Float> pricesList = prLt.stream().filter(p -> p.price > 30000) // filtering price    // option 2
				.map(pm -> pm.price) .collect(Collectors.toList());
		System.out.println(pricesList);
	}

}
