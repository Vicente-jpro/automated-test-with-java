package ao.com.vicente.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ao.com.vicente.stubs.CourseServiceStub;

@DisplayName("CourseServiceTest")
class CourseBusinessTest {

	
	@BeforeAll
	static void setup() {

	} 
	
	@Test
	@DisplayName("It should get related course that contains Spring.")
	void coursesRelatedToSpring() {


		CourseServiceStub courseService = new CourseServiceStub();
		CourseBusiness courseBusiness = new CourseBusiness(courseService);
		
		List<String> filteredCourses = courseBusiness.retriveCoursesRelatedToSpring("Vicente");
		int result = filteredCourses.size();
		int expected = 1;
		
		assertEquals(result, expected);

		List<String> filteredCourses1 = courseBusiness.retriveCoursesRelatedToSpring("Spring");
		result = filteredCourses1.size();
		expected = 2;
		assertEquals(result, expected);
	}

}
