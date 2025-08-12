package in.sp.pizzamannia.controller;

	

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.*;

import in.sp.pizzamannia.model.Pizza;
import in.sp.pizzamannia.service.PizzaService;



	@Controller
	public class PizzaController {
	
	    private final PizzaService service;
	    public PizzaController(PizzaService service) { this.service = service; }

	    @GetMapping("/")
	    public String orderForm(Model model) {
	        model.addAttribute("pizza", new Pizza());
	        return "order";
	    }

	    @PostMapping("/save")
	    public String saveOrder(@ModelAttribute Pizza pizza) {
	        service.save(pizza);
	        return "redirect:/list";
	    }

	    @GetMapping("/list")
	    public String listOrders(Model model) {
	        model.addAttribute("orders", service.listAll());
	        return "list";
	    }
	}


