package ao.com.vicente.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// SUT - System (method) Under Test
public class CourseBusiness {

	private CourseService courseService;
	
	public CourseBusiness(CourseService courseService){
		this.courseService = courseService;
	}
	
    public List<String> retriveCoursesRelatedToSpring(String student) {
    
        List<String> allCourses = courseService.retriveCourses(student);
       
        return allCourses;
    }

    
}
