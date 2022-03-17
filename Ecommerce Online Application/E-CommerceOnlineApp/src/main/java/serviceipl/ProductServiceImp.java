package serviceipl;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pojo.Product;
import productrepository.ProductRepositary;
import service.ProductService;

@Component
public class ProductServiceImp implements ProductService {
	
	@Autowired
	ProductRepositary prodRepos;

	@Override
	public Product addProductDetails(Product product) {
		
		return prodRepos.save(product);


	}

	@Override
	public List<Product> getListOfProducts() {
		List<Product> prodList = prodRepos.findAll();

		return prodList;
	}

	@Override
	public Product updateProductDetailsBtyId(Product prod, Long id) {
		
		
		 prod.setId(id);
         prod.getName();
         prod.getColor();
         prod.getSpecification();
         prod.getOs();
		
         
		Product p =prodRepos.save(prod);

		return p;
	}
	
	@Override   
	public Optional<Product> getDetailsById(Long id) {

		Optional<Product> prodigy = prodRepos.findById(id);
		return prodigy;
	}

	@Override
	public void  deleteProductById(Long id) {
		
		prodRepos.deleteById(id);
		
	}
    @Override
	public List<Product> getListOfProductsByDate(String date) {
		List<Product> prodList = prodRepos.findByDate(date);
		return prodList;
	}

	@Override
	public List<Product> getListOfProductsByName(String name) {
		List<Product> prodList = prodRepos.findByName(name);
		return prodList;
	}

	

}
