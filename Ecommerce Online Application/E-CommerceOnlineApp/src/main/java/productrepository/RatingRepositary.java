package productrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import pojo.Rating;



public interface RatingRepositary extends JpaRepository<Rating,Long> {

}
