package com.jsp.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.assignment.cartservice.CartSerice;
import com.jsp.assignment.entity.ShoppingCart;

@RestController
public class CartController 
{
	@Autowired
	private CartSerice cartSerice;
	
	@PostMapping("/insertdata")
	public ShoppingCart insert(@RequestParam String cartItems,@RequestParam int cartBill)
	{
		return cartSerice.insertData(cartItems,cartBill);
	}
	@PostMapping("/updatetdata")
	public ShoppingCart update(@RequestParam int id,@RequestParam String cartItems,@RequestParam int cartBill)
	{
		return cartSerice.updateData(id,cartItems,cartBill);
	}
	@GetMapping("/delete")
	public List<ShoppingCart> delete(@RequestParam int id)
	{
		 return cartSerice.delete(id);
	}
	@GetMapping("/getAll")
	public List<ShoppingCart> all()
	{
		 return cartSerice.getAll();
	}
	

}
