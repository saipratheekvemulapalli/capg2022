package Practice1;


import java.util.Iterator;
import java.util.List;

import ecommerce.bussinessLogic.CustomerRating;
import ecommerce.com.Rating;


public class MainRating {
	CustomerRating c= new CustomerRating();
	
//	long res=c.addRating("2", "bad");
//	System.out.println("donee..." );
	
//	Rating r=new Rating("4", "can try better");
//	c.updateRAting(r, 1);
	
//	Rating r= c.getRatingDetailsById(2);
//	System.out.println("The rating of the product id-"+r.getId()+" are  "+r.getNoofstars()+" and it is "+r.getReview());

/*	List<Rating> list=c.getRAtingofAll();
	for (Rating r : list) {
		System.out.println("The rating of the product id-"+r.getId()+" are  "+r.getNoofstars()+" and it is "+r.getReview());
		
	}
*/	
	
//	System.out.println(c.DeletebyId(6));
	
		System.out.println(c.DeleteAllratings());
	
	
	
}
}
