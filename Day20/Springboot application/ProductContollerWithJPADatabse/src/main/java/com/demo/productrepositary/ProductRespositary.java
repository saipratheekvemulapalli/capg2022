package com.demo.productrepositary;

//import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pojo.Product;

public interface ProductRespositary //extends JPaRepositary<Product,Long>
{

	void save(Product prod);

}