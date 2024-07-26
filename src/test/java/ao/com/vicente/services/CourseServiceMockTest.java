package ao.com.vicente.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("CourseServiceMockTest")
class CourseServiceMockTest {


	CourseService mockCourseService;
	CourseBusiness courseBusiness;
	List<String> filteredCourses;

	
	@BeforeEach
	void setup() {

		// Cria o objecto CouseService em forma de mock
		mockCourseService = mock(CourseService.class);
		courseBusiness = new CourseBusiness(mockCourseService);

		filteredCourses = Arrays.asList("Java Spring Vicente", "Ruby", "Rust", "C#", "Spring");
	} 
	
	/*
	@Test
	@DisplayName("It should delete a courses related to Spring")
	void deleteCoursesRelatedToSpring() {
	mockObject = mock(Object.class);
	
		when(
				mockObject.method()
			)
		.then(
			mockObject // Iniciatizer
		)
	}
*/
	
	@Test
	@DisplayName("It should get related course that contains Spring.")
	void coursesRelatedToSpring() {

		when(
				mockCourseService.retriveCourses("Vicente")
			)
		.thenReturn(filteredCourses);
		
		int result = filteredCourses.size();
		int expected = 5;
		
		assertEquals(result, expected);

		List<String> filteredCourses1 = courseBusiness.retriveCoursesRelatedToSpring("Spring");
		result = filteredCourses1.size();
		expected = 0;
		assertEquals(result, expected);
	}
	/*
	@Test
	@DisplayName("It should delete a courses related to Spring")
	void deleteCoursesRelatedToSpring() {
		when(
				mockCourseService.retriveCourses("Spring")
			)
		.thenReturn(filteredCourses);
		
		courseBusiness.deleteCoursesRelatedToSpring("Vicente");
		
		verify(mockCourseService).delete("Rust");
	}
	
	
	
	*/
	
	

}
