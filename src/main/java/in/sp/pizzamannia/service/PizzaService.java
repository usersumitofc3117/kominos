package in.sp.pizzamannia.service;


import org.springframework.stereotype.Service;

import in.sp.pizzamannia.model.Pizza;
import in.sp.pizzamannia.repository.PizzaRepository;

import java.util.List;

@Service
public class PizzaService {
    private final PizzaRepository repo;
    public PizzaService(PizzaRepository repo) { this.repo = repo; }

    public List<Pizza> listAll() { return repo.findAll(); }
    public void save(Pizza pizza) { repo.save(pizza); }
}


