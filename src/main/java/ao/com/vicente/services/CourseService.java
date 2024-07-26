package ao.com.vicente.services;

import java.util.List;

public interface CourseService {
	List<String> retriveCourses(String student);
	List<String> doSomething(String student);
	void delete(String course);
}
