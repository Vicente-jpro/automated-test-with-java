package ao.com.vicente.services;

import java.util.List;
import java.util.stream.Collectors;

// SUT - System (method) Under Test
public class CourseBusiness {

	private CourseService courseService;
	
	public CourseBusiness(CourseService courseService){
		this.courseService = courseService;
	}
	
    public List<String> retriveCoursesRelatedToSpring(String student) {
    
        List<String> allCourses = courseService.retriveCourses(student);
       
        return allCourses.stream()
        				 .filter( ele -> ele.contains(student))
        				 .collect(Collectors.toList());
    }

    
}
