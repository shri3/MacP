/**
 * 
 */
package net.macp.shopbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.macp.shopbackend.dao.CategoryDAO;
import net.macp.shopbackend.dto.Category;

/**
 * @author shri
 *
 */
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.macp.shopbackend.dao.CategoryDAO#list()
	 */

	private static List<Category> categories = new ArrayList<>();
	
	static{
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("this is sony television");
		//category.setImageURL(cat01.png);

		categories.add(category);

		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("this is sony Mobile");
		//category.setImageURL(cat02.png);

		categories.add(category);

		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("this is sony viao Laptop");
		//category.setImageURL(cat03.png);

		categories.add(category);

	}

	@Override
	public List<Category> list() {

		return categories;

	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		
		for(Category category : categories) {
			if(category.getId() == id) return category;
		}
		
		return null;
	}

}
