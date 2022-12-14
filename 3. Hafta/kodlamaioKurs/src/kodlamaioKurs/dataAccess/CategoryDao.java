package kodlamaioKurs.dataAccess;

import kodlamaioKurs.entities.Category;

public interface CategoryDao {

	void add(Category category);

	void update(Category category);

	void delete(String id);

	Category getByName(String name);

}
