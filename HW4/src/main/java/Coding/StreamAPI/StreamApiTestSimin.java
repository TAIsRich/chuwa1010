package space.gavinklfong.demo.streamapi;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import space.gavinklfong.demo.streamapi.models.Customer;
import space.gavinklfong.demo.streamapi.models.Order;
import space.gavinklfong.demo.streamapi.models.Product;
import space.gavinklfong.demo.streamapi.repos.CustomerRepo;
import space.gavinklfong.demo.streamapi.repos.OrderRepo;
import space.gavinklfong.demo.streamapi.repos.ProductRepo;

import java.time.LocalDate;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Slf4j
@DataJpaTest
public class StreamApiTestSimin {

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private OrderRepo orderRepo;

	@Autowired
	private ProductRepo productRepo;

	@Test
	@DisplayName("Obtain a list of product with category = \"Books\" and price > 100")
	public void exercise1() {
		List<Product> result = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.filter(p -> p.getPrice() > 100)
				.collect(Collectors.toList());

		result.forEach(p -> log.info(p.toString()));

	}

	@Test
	@DisplayName("Obtain a list of product with category = \"Books\" and price > 100 (using Predicate chaining for filter)")
	public void exercise1a() {


	}

	@Test
	@DisplayName("Obtain a list of product with category = \"Books\" and price > 100 (using BiPredicate for filter)")
	public void exercise1b() {

	}

	@Test
	@DisplayName("Obtain a list of order with product category = \"Baby\"")
	public void exercise2() {
		List<Order> result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getProducts().stream()
						.anyMatch(
								p -> p.getCategory().equalsIgnoreCase("Baby")
						)).collect(Collectors.toList());

		result.forEach(o -> log.info(o.toString()));

	}

	@Test
	@DisplayName("Obtain a list of product with category = “Toys” and then apply 10% discount\"")
	public void exercise3() {
		List<Product> result = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
				.map(p -> p.withPrice(p.getPrice() * 0.9))
				.collect(Collectors.toList());

		result.forEach(p -> log.info(p.toString()));

	}

	@Test
	@DisplayName("Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021")
	public void exercise4() {
		List<Product> result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getCustomer().getTier() == 2)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
				.flatMap(o -> o.getProducts().stream())
				.distinct()
				.collect(Collectors.toList());

		result.forEach(o -> log.info(o.toString()));

	}

	@Test
	@DisplayName("Get the 3 cheapest products of \"Books\" category")
	public void exercise5() {
		Optional<Product> result = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Book"))
				.min(Comparator.comparing(Product::getPrice));

		log.info(result.get().toString());


	}

	@Test
	@DisplayName("Get the 3 most recent placed order")
	public void exercise6() {

	}

	@Test
	@DisplayName("Get a list of products which was ordered on 15-Mar-2021")
	public void exercise7() {

	}

	@Test
	@DisplayName("Calculate the total lump of all orders placed in Feb 2021")
	public void exercise8() {

	}

	@Test
	@DisplayName("Calculate the total lump of all orders placed in Feb 2021 (using reduce with BiFunction)")
	public void exercise8a() {

	}

	@Test
	@DisplayName("Calculate the average price of all orders placed on 15-Mar-2021")
	public void exercise9() {

	}

	@Test
	@DisplayName("Obtain statistics summary of all products belong to \"Books\" category")
	public void exercise10() {

	}

	@Test
	@DisplayName("Obtain a mapping of order id and the order's product count")
	public void exercise11() {

	}

	@Test
	@DisplayName("Obtain a data map of customer and list of orders")
	public void exercise12() {

	}

	@Test
	@DisplayName("Obtain a data map of customer_id and list of order_id(s)")
	public void exercise12a() {

	}

	@Test
	@DisplayName("Obtain a data map with order and its total price")
	public void exercise13() {

	}

	@Test
	@DisplayName("Obtain a data map with order and its total price (using reduce)")
	public void exercise13a() {

	}

	@Test
	@DisplayName("Obtain a data map of product name by category")
	public void exercise14() {

	}

	@Test
	@DisplayName("Get the most expensive product per category")
	void exercise15() {


	}
	
	@Test
	@DisplayName("Get the most expensive product (by name) per category")
	void exercise15a() {


	}

}
