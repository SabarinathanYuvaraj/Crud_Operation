package com.jsp.assignment.cartservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.assignment.cartrepo.CartRepo;
import com.jsp.assignment.entity.ShoppingCart;

@Service
public class CartSerice 
{
	@Autowired
	private CartRepo cr;
	
	@Autowired
	private ShoppingCart cart;
	
	public ShoppingCart insertData(String cartItems, int cartBill) 
	{
		cart.setCartId(0);
		cart.setCartItems(cartItems);
		cart.setTotalBill(cartBill);
		return cr.save(cart);
		
		
	}

	public ShoppingCart updateData(int id, String cartItems, int cartBill) {
		cart.setCartItems(cartItems);
		cart.setTotalBill(cartBill);
		cart.setCartId(id);
		return cr.save(cart);
		
	}

	public List<ShoppingCart>  delete(int id) {
		cr.deleteById(id);
		return getAll();
		
	}

	public List<ShoppingCart> getAll() {
		List<ShoppingCart> findAll = cr.findAll();
		return findAll;
	}

}
