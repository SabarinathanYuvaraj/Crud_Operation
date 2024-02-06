package com.jsp.assignment.cartrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.assignment.entity.ShoppingCart;

public interface CartRepo extends JpaRepository<ShoppingCart, Integer>{
	
}
