package kodlamaioKurs.dataAccess;

import kodlamaioKurs.entities.Instructor;

public interface InstructorDao {

	void add(Instructor instructor);

	void update(Instructor instructor);

	void delete(String id);

	Instructor getByName(String name);

}