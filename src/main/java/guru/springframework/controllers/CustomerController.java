package guru.springframework.controllers;

import guru.springframework.domain.Customer;
import guru.springframework.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

	private CustomerService customerService;

	@Autowired
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping("/customers")
	public String listConsumers(Model model) {

		model.addAttribute("customers", customerService.listAllCustomers());

		return "customers";
	}

	@GetMapping("/customer/{id}")
	public String getCustomer(@PathVariable Integer id, Model model) {

		model.addAttribute("customer", customerService.getCustomerById(id));

		return "customer";
	}

	@GetMapping("customer/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		model.addAttribute("customer", customerService.getCustomerById(id));
		return "customerform";
	}

	@GetMapping("/customer/new")
	public String newCustomer(Model model) {
		model.addAttribute("customer", new Customer());
		return "pcustomerform";
	}

	@PostMapping(value = "/customer")
	public String saveOrUpdateCustomer(Customer customer) {
		Customer savedCustomer = customerService.saveOrUpdateCustomer(customer);
		return "redirect:/customer/" + savedCustomer.getId();
	}

	@GetMapping("/customer/delete/{id}")
	public String delete(@PathVariable Integer id) {
		customerService.deleteCustomer(id);

		return "redirect:/customers";
	}
}
