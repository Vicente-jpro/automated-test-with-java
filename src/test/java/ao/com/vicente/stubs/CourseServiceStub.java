package ao.com.vicente.stubs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ao.com.vicente.services.CourseService;

//Usado para inicializar os o
public class CourseServiceStub implements CourseService{

	@Override
	public List<String> retriveCourses(String student) {
	 	List<String> lista = Arrays.asList("Java Spring Vicente", "Ruby", "Rust", "C#", "Spring");
	 	List<String> listElementos = new ArrayList<>();
	 	
	 	for(String str: lista) {
	 		if(str.contains(student)) 
	 			listElementos.add(str);
	 	}
	 	
	 	return listElementos; 
	 	
	}

	
}
