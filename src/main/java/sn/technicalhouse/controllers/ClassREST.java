package sn.technicalhouse.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;



import sn.technicalhouse.repositories.ClassRepository;

public class ClassREST <T,className>{
@Autowired
	private ClassRepository myClassRepository;

//ClassREST clientREST = new ClassREST<Client,"popo">
	
@GetMapping("all-")	
	public List<Class<?>> getAllObjectsClass(){
		return myClassRepository.findAll();
	}
	
@GetMapping("add-")	
	public void addClass(@RequestBody Class<T> myClass) {
		myClassRepository.save(myClass);
   }

	//@SuppressWarnings("unchecked")
	/*public T getObjectById(@PathVariable(value="id") Integer id) {
		//T object = (T) myClassRepository.findById(id);
		return object;
	}*/
	
	
}