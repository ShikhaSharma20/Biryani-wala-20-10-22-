package com.biryaniwala.repository;import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.biryaniwala.model.biryani;

@Repository
public interface biryanirepository extends JpaRepository<biryani,Integer> {

	List<biryani> findByBiryaniType(String btype);

	@Query(value="select * from biryani where biryani_price< ?1", nativeQuery=true)
	List<biryani> findByBiryaniPrice(int bprice);
	
}