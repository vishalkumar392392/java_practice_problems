package com.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainMethod {

	public static void main(String[] args) {

		Customer customer1 = new Customer();

		customer1.setAmount(new Amount(123,""));
		customer1.setEmail("vema@gmail.com");
		customer1.setName("vema");

		Customer customer2 = new Customer();

		customer2.setAmount(new Amount(124,""));
		customer2.setEmail("vishal@gmail.com");
		customer2.setName("vishal");

		List<Customer> list = new ArrayList<Customer>();
		list.add(customer1);
		list.add(customer2);
		List<Customer> list2 = new ArrayList<Customer>();

		System.out.println(list.stream().filter(c -> c.getAmount().getId() > 120).collect(Collectors.toList()));

		System.out.println(Optional
				.ofNullable(list.stream().filter(c -> c.getAmount().getId() > 120).collect(Collectors.toList())));

		System.out.println(Optional.ofNullable(list)
				.map(c -> c.stream().filter(g -> Optional.ofNullable(g.getAmount()).isPresent())
						.filter(g -> Optional.ofNullable(g.getAmount().getId()).isPresent())
						.filter(g -> g.getAmount().getId() > 120).collect(Collectors.toList())));

		System.out.println(
				Optional.ofNullable(list).map(c -> c.stream().map(Customer::getAmount).map(Amount::getId).findAny()));

		System.out.println(
				list2.stream().map(Customer::getAmount).map(Amount::getId).findAny());

		
		System.out.println(
				Optional.ofNullable(list2).map(c -> c.stream().map(Customer::getAmount).map(Amount::getId).findAny()));
		
		System.out.println("///////////////////////");
		
		Customer cus = new Customer();
		cus.setAmount(new Amount());
		cus.setEmail("vishal@gmail.com");
		cus.setName("vishal");
		
		
		if(Objects.nonNull(Optional.ofNullable(cus.getAmount()).orElse(null)) &&
				Objects.nonNull(Optional.ofNullable(cus.getAmount().getInWords()).orElse(null))) {
			System.out.println(cus.getAmount().getInWords());
		}
		
		System.out.println(
				Optional.ofNullable(cus)
				                        .map(i->i.getAmount())
				                        .map(i->i.getInWords())
				                        .orElse(null)
				);
		


	}

}
