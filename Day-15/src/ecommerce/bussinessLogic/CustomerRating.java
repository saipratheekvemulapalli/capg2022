package Practice1;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import ecommerce.com.Rating;

public class CustomerRating {

	private static SessionFactory sessionFactory=null;	
	Long prodid = null;
	Transaction ts=null;
	Session session1=null;
	
	public long addRating (String noofstars, String review) {
		// intilize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		
		ts= session.beginTransaction();
		Rating rate = new Rating (noofstars, review);
		prodid = (Long) session.save(rate);
		ts.commit();
		return prodid;		
	}
	
	public Rating getRatingDetailsById(long id) {
		Session session =null;
		sessionFactory= new Configuration().configure().buildSessionFactory();
		session= sessionFactory.openSession();
		
		ts= session.beginTransaction();
		
		Query query = session.createQuery("From Rating");
		Rating rate= session.get(Rating.class, id);
		
		rate.getNoofstars();
		rate.getReview();	
		rate.getId(); 
		return rate;	
	}
	public List<Rating> getRAtingofAll(){
		Session session =null;
		sessionFactory=new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		
		ts = session.beginTransaction();	
		Query query = session.createQuery("From Rating");
		
		List<Rating> ratlist = query.list();
		return ratlist;
	}
	public Rating updateRAting(Rating rate, long id) {
		Session session =null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		
		ts= session.beginTransaction();
		
		Rating re = (Rating)session.get(Rating.class, id);
		
		re.setNoofstars(rate.getNoofstars());
		re.setReview(rate.getReview());
		session.update(re);
		ts.commit();
		return re;	
	}
	public Rating findbyId(long id) {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session1 = sessionFactory.openSession();
		
		ts= session1.beginTransaction();
		
		Rating findid= session1.load(Rating.class, id);
		return findid;		
	}
	public String DeletebyId(long id) {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session1 = sessionFactory.openSession();
		ts = session1.beginTransaction();
		
		Rating rate= findbyId(id);
		try {
			session1.delete(rate);
		} catch (org.hibernate.ObjectNotFoundException e) {
			// TODO Auto-generated catch block
			return "not found the product with id-"+id;
		}
		ts.commit();
		return "deleted the rating of product with id-"+id;	
	}
	public String DeleteAllratings() {
		Session session= null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		
		ts= session.beginTransaction();
		 
		String stringQuery="DELETE FROM Rating";
		Query query = session.createQuery(stringQuery);
		int res=query.executeUpdate();
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
