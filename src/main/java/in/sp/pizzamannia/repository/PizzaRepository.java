package in.sp.pizzamannia.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.pizzamannia.model.Pizza;

	


	public interface PizzaRepository extends JpaRepository<Pizza, Long> {
	}


