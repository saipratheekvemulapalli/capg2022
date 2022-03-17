package serviceipl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pojo.Rating;
import productrepository.RatingRepositary;
import service.RatingService;

@Component
public class RatingServiceImp implements RatingService {
	
	
	@Autowired
	RatingRepositary rateRepos;

	@Override
	public Rating addRatingDetails(Rating rate) {
		
		return rateRepos.save(rate);
	}

}


