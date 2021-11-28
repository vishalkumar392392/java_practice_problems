package com.optional;


public class Customer {

		private String name ;
		private String email;
		private Amount amount;
		public Customer(String name, String email, Amount amount) {
			this.name = name;
			this.email = email;
			this.amount = amount;
		}
		@Override
		public String toString() {
			return "customer [name=" + name + ", email=" + email + ", amount=" + amount + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Amount getAmount() {
			return amount;
		}
		public void setAmount(Amount amount) {
			this.amount = amount;
		}
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
	}

