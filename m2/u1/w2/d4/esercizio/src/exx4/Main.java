package exx4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {

		/////////// PRODOTTI///////////

		List<Product> products = new ArrayList<>();

		Product p1 = new Product(2349, "trenino", 199.90, "baby");
		Product p2 = new Product(2543, "il miglio verde", 218.60, "book");
		Product p3 = new Product(2959, "culla", 12.30, "baby");
		Product p4 = new Product(534, "il decamerone", 100.90, "book");
		Product p5 = new Product(5434, "latte in polvere", 10.90, "baby");
		Product p6 = new Product(124, "dune", 110.90, "book");
		Product p7 = new Product(5321, "il codice da vinci", 10.90, "book");
		Product p8 = new Product(53544, "giardinaggio for dumbs", 10.90, "book");
		Product p9 = new Product(9534, "pallone da calcio", 410.90, "boys");
		Product p10 = new Product(666, "divina commedia", 110.90, "book");
		Product p11 = new Product(66, "pallina baseball", 42.90, "boys");
		Product p12 = new Product(6666, "fasciatoio", 100.90, "baby");
		Product p13 = new Product(777, "i promessi sposi, prima edizione", 500, "book");
		Product p14 = new Product(77, "siddhartha", 210.90, "book");
		Product p15 = new Product(9777, "jersey firmata Antetokounmpo", 600.90, "boys");
		Product p21 = new Product(9747, "orologio Ben Ten", 30.90, "boys");
		Product p22 = new Product(9787, "figurine panini x10", 10.00, "boys");

		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		products.add(p8);
		products.add(p9);
		products.add(p10);
		products.add(p15);
		products.add(p14);
		products.add(p13);
		products.add(p12);
		products.add(p11);
		products.add(p21);
		products.add(p22);
		List<Product> productsA = new ArrayList<>();

		Product p16 = new Product(4, "maglietta", 10.90, "baby");
		Product p17 = new Product(134, "scarpette calcio", 11.20, "boys");
		Product p18 = new Product(34, "felpa", 16.90, "baby");
		Product p19 = new Product(5134, "calzettoni", 11, "boys");
		Product p20 = new Product(1134, "ciuccio", 310.90, "baby");

		productsA.add(p20);
		productsA.add(p19);
		productsA.add(p18);
		productsA.add(p17);
		productsA.add(p16);
		

		/////////////////// CUSTOMER/////////////

		ArrayList<Customer> customers = new ArrayList<>();

		Customer c1 = new Customer(3421, "gino", 1);
		Customer c2 = new Customer(34231, "peppe", 2);
		Customer c3 = new Customer(3541, "ciro", 2);
		Customer c4 = new Customer(98721, "gennaro", 2);
		Customer c5 = new Customer(398421, "carmine", 2);
		Customer c6 = new Customer(121, "ciccio", 2);
		Customer c7 = new Customer(321, "tony", 2);
		Customer c8 = new Customer(31, "fabiuccio", 2);
		Customer c9 = new Customer(01, "paoletto", 2);
		Customer c10 = new Customer(69, "lollo", 2);

		customers.add(c10);
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		customers.add(c5);
		customers.add(c6);
		customers.add(c7);
		customers.add(c8);
		customers.add(c9);

		//////////////////// ORDINI//////////////

		// altra istanza order con altri prodotti
		Order ordine = new Order(1, "delivered", LocalDate.of(2021, 2, 1), LocalDate.of(2021, 4, 4), productsA, c6);

		

		ArrayList<Order> orders = new ArrayList<>();

		Order o1 = new Order(1234, "delivered", LocalDate.of(2021, 2, 1), LocalDate.of(2021, 5, 1), productsA, c6);
		Order o2 = new Order(34, "pending", LocalDate.of(2021, 2, 20), LocalDate.of(2021, 2, 28), products, c7);
		Order o3 = new Order(13234, "waiting", LocalDate.of(2021, 2, 1), LocalDate.of(2021, 2, 4), productsA, c5);
		Order o4 = new Order(034, "delivered", LocalDate.of(2021, 3, 1), LocalDate.of(2021, 4, 4), products, c4);
		Order o5 = new Order(1874, "waiting", LocalDate.of(2021, 2, 19), LocalDate.of(2021, 3, 9), productsA, c8);
		Order o6 = new Order(11, "pending", LocalDate.of(2021, 2, 1), LocalDate.of(2021, 4, 4), products, c3);
		Order o7 = new Order(176534, "pending", LocalDate.of(2021, 2, 5), LocalDate.of(2021, 2, 20), productsA, c2);
		Order o8 = new Order(123234, "waiting", LocalDate.of(2021, 2, 15), LocalDate.of(2021, 3, 7), productsA, c1);
		Order o9 = new Order(10934, "delivered", LocalDate.of(2021, 2, 1), LocalDate.of(2021, 4, 4), products, c9);

		orders.add(o9);
		orders.add(o8);
		orders.add(o7);
		orders.add(o6);
		orders.add(o5);
		orders.add(o4);
		orders.add(o3);
		orders.add(o2);
		orders.add(o1);

		////////////// STREAMS////////////////////

		/// esercizio 1

		List<Product> productStream = products.stream().filter(p -> p.getCategory().equals("book"))
				.filter(p -> p.getPrice() > 100).collect(Collectors.toList());

		System.out.println("--------prodotti categoria book e prezzo maggiore di 100--------");
		productStream.forEach(p -> System.out.println(p + " -> "+p.getPrice()));

		// esercizio 2

		List<Product> filteredProducts = ordine.getProduct().stream().filter(p -> p.getCategory().equals("baby"))
				.collect(Collectors.toList());

		System.out.println("--------ordini di prodotti con categoria baby--------");
		filteredProducts.forEach(p -> System.out.println(p));

		// esercizio 3
		List<Product> productStreamBoys = products.stream().filter(p -> p.getCategory().equals("boys"))
				.collect(Collectors.toList());

		System.out.println("--------prodotti categoria boy--------");
		productStreamBoys.forEach(p -> System.out.println("Il prodotto categoria boys -> " + p.getName()
				+ ", ha un prezzo scontato del 10% a €" + p.getPrice() * 0.9));

		// esercizio 4

		List<Order> orderedProducts =  orders.stream()
				.filter(p -> p.getCustomer().getTier() == 2)
				.filter(p -> p.getOrderDate().isAfter(LocalDate.of(2021, 1, 31)))
				.filter(p -> p.getOrderDate().isBefore(LocalDate.of(2021, 4, 2)))
				.collect(Collectors.toList());
		
		System.out.println("--------prodotti ordinati da clienti tier 2 tra 1 feb e 1 apr--------");
		orderedProducts.forEach(p -> System.out.println("Ordine del " + p.getOrderDate()
				+ ", da " + p.getCustomer()));
		

	}

}
