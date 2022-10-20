package com.biryaniwaimport java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.biryaniwala.model.biryani;
import com.biryaniwala.service.biryaniservice;

@RestController
public class biryanicontroller {
	
	@Autowired
	private biryaniservice service;
	
	
	@RequestMapping(method=RequestMethod.POST, value="/biryani")
	public String addBiryani(@RequestBody biryani b1) {
		return service.addBiryani(b1);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/biryani/addall")
	public String addAllBiryani(@RequestBody List<biryani> b1) {
		return service.addAllBiryani(b1);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/biryani")
	public List<biryani> getAllBiryani(){
		return service.getAllBiryani();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/biryani/id/{id}")
	public Optional<biryani> getBiryaniById(@PathVariable int id) {
		return service.getBiryaniById(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/biryani/type/{btype}")
	public List<biryani> getBiryaniByType(@PathVariable String btype){
		return service.getBiryaniByType(btype);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/biryani/price/{bprice}")
	public List<biryani> getBiryaniByRange(@PathVariable int bprice){
		return service.getBiryaniByRange(bprice);
	}
	
	
	

}