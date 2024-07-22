package ao.com.vicente.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// SUT - System (method) Under Test
public class CourseService {

    public List<String> retriveCoursesRelatedToSpring(String student) {
        
        List<String> filteredCourses = new ArrayList<String>();
        List<String> allCourses = getAllService();
        
        for (String course : allCourses) {
            if (course.contains("Spring")) {
                filteredCourses.add(course);
            }
        }
        
        return filteredCourses;
    }
    
    public List<String> getAllService(){
    	return Arrays.asList("Java", "Ruby", "Rust", "C#", "Spring");
    }
}
