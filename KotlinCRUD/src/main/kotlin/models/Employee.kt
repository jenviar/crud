package models

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "usersnew", schema = "public")
class Employee (val name: String = "",
                @Id
                val email: String =  "",
                val age: Int = 0)
