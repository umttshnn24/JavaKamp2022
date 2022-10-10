package kodlamaioKurs.bussiness;

import kodlamaioKurs.core.logging.Logger;
import kodlamaioKurs.dataAccess.InstructorDao;
import kodlamaioKurs.entities.Instructor;

public class InstructorManager extends Instructor {

	private InstructorDao _instructorDao;
	private Logger[] _loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this._instructorDao = instructorDao;
		this._loggers = loggers;
	}

	public void add(Instructor instructor) throws Exception {
		this._instructorDao.add(instructor);

		for (Logger logger : _loggers) {
			logger.log(instructor.getFirstName() + " " + instructor.getLastName());
		}
	}

	public void update(Instructor instructor) {
		this._instructorDao.update(instructor);
	}

	public void delete(String id) {
		this._instructorDao.delete(id);
	}

}