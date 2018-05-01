package boot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import boot.service.TaskService;

@RestController
public class FormController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/ello")
	public String hello(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}
	
//	@GetMapping("/all-tasks")
//	public String allTasks(){
//		return taskService.findAll().toString();
//	}
//	
//	@GetMapping("/save-task")
//	public String saveTask(@RequestParam String name, @RequestParam String desc) {
//		Task task = new Task(name, desc, new Date(),false);
//		taskService.save(task);
//		return "Task Saved!";
//	}
//	
//	@GetMapping("/delete-task")
//	public String deleteTask(@RequestParam int id) {
//		taskService.delete(id);
//		return "Task deleted!";
//	}
}
