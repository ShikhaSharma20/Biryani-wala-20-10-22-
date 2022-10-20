import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.biryaniwala.model.biryani;
import com.biryaniwala.repository.biryanirepository;

@Service
public class biryaniservice {
	
	@Autowired
	private biryanirepository biryanirepo;
	
	
	public String addBiryani(biryani b1) {
		biryanirepo.save(b1);
		return "Biryani added successfully";
		
	}
	

	public String addAllBiryani(List<biryani> blist) {
		biryanirepo.saveAll(blist);
		return "All biryanis added successfully";
	}
	
	
	public List<biryani> getAllBiryani(){
		List<biryani> allbiryani=new ArrayList<>();		
		biryanirepo.findAll().forEach(allbiryani::add);
		return allbiryani;
		
	}
	
	public Optional<biryani> getBiryaniById(int id) {
		return biryanirepo.findById(id);
	}
	
	public List<biryani> getBiryaniByType(String btype){
		return biryanirepo.findByBiryaniType(btype);
		
	}
	
	public List<biryani> getBiryaniByRange(int bprice){
		return biryanirepo.findByBiryaniPrice(bprice);
	}
	
	
	
	
	
	

}p