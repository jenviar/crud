package controllers
import models.Employee
import repository.EmployeeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class EmployeeController {
    @Autowired
    lateinit var employeeRepository: EmployeeRepository


    @GetMapping("list")
    fun list(): List <Employee> {
        return employeeRepository.findAll().toList();
        }

    @PostMapping("post")
    fun save(@RequestBody employee: Employee): Employee {
        return employeeRepository.save(employee);
    }

    @PutMapping("{id}")
    fun alter (@PathVariable id: Long, @RequestBody employee: Employee) {
        if(employeeRepository.existsById(id)) {
            employeeRepository.save(employee);
        }
    }
}
