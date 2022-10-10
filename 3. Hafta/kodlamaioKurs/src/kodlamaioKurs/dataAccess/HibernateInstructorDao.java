package kodlamaioKurs.dataAccess;

import java.time.LocalDate;
import java.util.ArrayList;

import kodlamaioKurs.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	ArrayList<Instructor> instructors = new ArrayList<Instructor>();

	public HibernateInstructorDao() {
		instructors.add(new Instructor("260c0ed2-c7fd-4cb6-8b12-51a2c5372d44", "Engin", "Demiroğ",
				"https://www.filepicker.io/api/file/GsqiGFGCRmuBuel0qqF3",
				"Yazılım geliştirmeye lisede 'yazılım' bölümünde okurken başladım.", LocalDate.now(), false));

	}

	@Override
	public void add(Instructor instructor) {
		instructors.add(instructor);
		System.out.println("Eğitmen: " + instructor.getFirstName() + " " + instructor.getLastName()
				+ " sisteme eklendi.(Hibernate)");

	}

	@Override
	public void update(Instructor instructor) {
		System.out.println(
				"Eğitmen: " + instructor.getFirstName() + " " + instructor.getLastName() + " güncellendi.(Hibernate)");

	}

	@Override
	public void delete(String id) {
		System.out.println("Eğitmen sistemden kaldırıldı.(Hibernate)");

	}

	@Override
	public Instructor getByName(String name) {
		return null;
	}

}
