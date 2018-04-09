package net.macp.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.macp.shopbackend.dao.CategoryDAO;
import net.macp.shopbackend.dto.Category;

@Controller
public class PageController {
	
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	
	@RequestMapping(value= {"/","/index","/home"})
	public ModelAndView index()
	{
		ModelAndView mv= new ModelAndView("page");
		
		mv.addObject("title","Home");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickHome",true);
		return mv;
	}

	@RequestMapping(value= {"/about"})
	public ModelAndView about()
	{
		ModelAndView mv= new ModelAndView("page");
		
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	@RequestMapping(value= {"/product"})
	public ModelAndView product()
	{
		ModelAndView mv= new ModelAndView("page");
		
		mv.addObject("title","Product");
		mv.addObject("userClickProduct",true);
		return mv;
	}
	
	@RequestMapping(value= {"/contact"})
	public ModelAndView contact()
	{
		ModelAndView mv= new ModelAndView("page");
		
		mv.addObject("title","Contact");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	@RequestMapping(value= "/show/all/products")
	public ModelAndView showAllProducts()
	{
		ModelAndView mv= new ModelAndView("page");
		
		mv.addObject("title","All Products");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickAllProducts",true);
		return mv;
	}
	
	@RequestMapping(value= "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id")int id)
	{
		ModelAndView mv= new ModelAndView("page");
		
		//categoryDAO to fetch single category
		Category category=null;
		
		category = categoryDAO.get(id);
		
		//
		mv.addObject("title",category.getName());
		
		//passing list of categories
		mv.addObject("categories", categoryDAO.list());
		
		//passing single category object
		mv.addObject("category", category);
		mv.addObject("userClickCategoryProducts",true);
		return mv;
	}
	
	
	
}
