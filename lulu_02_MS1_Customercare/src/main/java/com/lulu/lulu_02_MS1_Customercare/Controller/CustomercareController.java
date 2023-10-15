package com.lulu.lulu_02_MS1_Customercare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lulu.lulu_02_MS1_Customercare.Entity.Customercare;
import com.lulu.lulu_02_MS1_Customercare.Repo.CustomercareRepo;

@RestController
@RequestMapping("/ccs")
public class CustomercareController {

	// CRUD with Customer care

	@Autowired

	CustomercareRepo customercareRepository;

	@GetMapping("/getCustomercare")
	public List<Customercare> getCustomercare() {

		return customercareRepository.findAll(); // select * from <TableName>;

	}

	@PostMapping("/addCustomercare")

	public Customercare createuser(@RequestBody Customercare care) {

		return customercareRepository.save(care);

	}

	@DeleteMapping("/deleteCustomercare/{id}")

	public void deleteCustomercare(@PathVariable("id") Integer id) {

		customercareRepository.deleteById(id); // select * from <TableName>
	}

	@GetMapping("/hellocustomercare")

	public String Hello() {

		return "Communication successful between product and customer care";

	}

}
