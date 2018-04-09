/**
 * 
 */
package net.macp.shopbackend.dao;

import java.util.List;

import net.macp.shopbackend.dto.Category;

/**
 * @author shri
 *
 */
public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
}
