package boot.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import boot.dao.TaskRepo;
import boot.model.Task;

@Service
@Transactional
public class TaskService {
	
	private final TaskRepo taskRepo;

	public TaskService(TaskRepo taskRepo) {
		this.taskRepo = taskRepo;
	}
	
	public List<Task> findAll(){
		List<Task> tasks = new ArrayList<>();
		for(Task task: taskRepo.findAll()){
			tasks.add(task);
		}
		return tasks;
	}
	
	public void save(Task task) {
		taskRepo.save(task);
	}
	
	public void delete(int id) {
		taskRepo.delete(id);
	}
	
	public Task findTask(int id) {
		return taskRepo.findOne(id);
	}
}
