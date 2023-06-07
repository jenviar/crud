package repository

import org.springframework.data.repository.CrudRepository
import models.Employee

interface EmployeeRepository : CrudRepository<Employee, Long>
