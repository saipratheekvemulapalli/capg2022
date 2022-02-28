package Practice1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 
import ecommerce.com.Product;

public class Service {
	private static SessionFactory sessionFactory = null;
	Transaction ts = null;
	Long productid = null;
	Session session1 = null;

	public Long addproduct(String laptopname, String size, String color, String model, String weight) {
		// intilize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();

		// begin transcation
		ts = session.beginTransaction();
		Product product = new Product(laptopname, size, color, model, weight);
		productid = (Long) session.save(product);
		// this save() will form "insert into table " query
		// automaticall in db"
		ts.commit();
		return productid;
	}

	public Product getProductDetailsById(long id) {

		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		ts = session.beginTransaction();

		Query query = session.createQuery("From Product");
		Product newprod = (Product) session.get(Product.class, id);

		newprod.getLaptopname();
		newprod.getSize();
		newprod.getColor();
		newprod.getModel();
		newprod.getWeight();
		return newprod;

	}
	
	public List<Product> getListOfAllProductdetails() {
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		ts = session.beginTransaction();

		Query query = session.createQuery("FROM Product");
		
		List<Product> productlist = query.list();
		
		return productlist;	 
	}

	public Product updateEmployeById(Product prod, long id) {
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		ts = session.beginTransaction();

		Product product = (Product) session.get(Product.class, id);

		product.setLaptopname(prod.getLaptopname()); // values are coming from client that isMainClas
		product.setColor(prod.getColor());
		product.setWeight(prod.getWeight());
		product.setModel(prod.getModel());
		product.setSize(prod.getSize());
		session.update(product);
		ts.commit();
		return product;
	}

	public Product findbyId(long prodid) {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session1 = sessionFactory.openSession();
		ts = session1.beginTransaction();

		Product findid = (Product) session1.load(Product.class, prodid);

		return findid;
	}
	

	public void deleteProductdetailsById(long id) {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session1 = sessionFactory.openSession();
		ts = session1.beginTransaction();

		Product dltprod = findbyId(id);
		session1.delete(dltprod);
		ts.commit();
	}

	public String deleteAllProductDetails() {

		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		ts = session.beginTransaction();
		
		String stringQuery = "DELETE FROM Product";
		Query query = session.createQuery(stringQuery);
		Integer res=query.executeUpdate();
		ts.commit();
		if (res > 0) 
		{
			return "Sucessfully deleted all records";
		} 
		else 
		{
			return "No record found";
		}		
	}
}
