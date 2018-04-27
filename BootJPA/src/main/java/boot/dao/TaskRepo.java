package boot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import boot.model.Task;


public interface TaskRepo extends CrudRepository<Task, Integer>{
	
}
