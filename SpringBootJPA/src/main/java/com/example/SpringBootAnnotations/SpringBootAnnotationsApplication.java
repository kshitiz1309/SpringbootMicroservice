package com.example.SpringBootAnnotations;

import com.example.SpringBootAnnotations.entity.*;
import com.example.SpringBootAnnotations.repository.CategoryRepo;
import com.example.SpringBootAnnotations.repository.CustomRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class SpringBootAnnotationsApplication implements CommandLineRunner {
private static Logger logger = LoggerFactory.getLogger(SpringBootAnnotationsApplication.class);

	@Autowired
	private CustomRepo repo;

	@Autowired
	private CategoryRepo categoryRepo;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*StudentEntity student = new StudentEntity();
		student.setName("Atul Tiwari");
		student.setAbout("I am a engineer");
		student.setId(1);

		Laptop laptop = new Laptop();
		laptop.setLaptopId(12);
		laptop.setBrand("Apple");
		laptop.setModelNumber("Macbook Pro M2");
		laptop.setStudent(student);
		student.setLaptop(laptop);

		repo.save(student);

		logger.info("student id {}",student.getId());*/

		//One to Many

		/*StudentEntity student = new StudentEntity();
		student.setName("Atul Tiwari");
		student.setAbout("I am a engineer");
		student.setId(2);

		Address address = new Address();
		address.setAddressId(15);
		address.setCity("Lucknow");
		address.setCountry("Pune");
		address.setStudent(student);

		Address address1 = new Address();
		address1.setAddressId(20);
		address1.setCity("Delhi");
		address1.setCountry("India");
		address1.setStudent(student);

		List<Address> addresses = new ArrayList<>();
		addresses.add(address);
		addresses.add(address1);

		student.getAddresses().addAll(addresses);

		repo.save(student);

		logger.info("Student created with address");*/

		//Many to Many

		/*Product product1 = new Product();
		product1.setpId("pid1");
		product1.setpName("Iphone");

		Product product2 = new Product();
		product2.setpId("pid2");
		product2.setpName("Samsung 22 Ultra");

		Product product3 = new Product();
		product3.setpId("pid3");
		product3.setpName("Samsung Tv");

		Category category1 = new Category();
		category1.setcId("cid1");
		category1.setTitle("Electronics");

		Category category2 = new Category();
		category2.setcId("cid2");
		category2.setTitle("Mobile Phones");

		List<Product> category1Products = category1.getProducts();
		category1Products.add(product1);
		category1Products.add(product2);
		category1Products.add(product3);

		List<Product> category2Products = category2.getProducts();
		category2Products.add(product1);
		category2Products.add(product2);

		categoryRepo.save(category1);
		categoryRepo.save(category2);
*/

		Category category = categoryRepo.findById("cid1").get();
		System.out.println(category.getProducts().size());

		Category category2 = categoryRepo.findById("cid2").get();
		System.out.println(category2.getProducts().size());
	}
}
