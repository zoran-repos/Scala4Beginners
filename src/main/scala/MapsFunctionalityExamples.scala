@main def runExample(): Unit =

  val employees = Map(
    "Alice" -> 50000.0,
    "Bob" -> 55000.0,
    "Charlie" -> 60000.0,
    "David" -> 45000.0,
    "Eve" -> 75000.0
  )

  val updatedEmployees = employees + ("Frank" -> 50000.0)
  val increasedSalaries = updatedEmployees.map((name, salary) => name -> (salary * 1.1))
  val removedEmployee = increasedSalaries - "Charlie"
  val highEarners = removedEmployee.filter((_, salary) => salary > 60000)
  val topEarner = removedEmployee.maxBy(_._2)
  val lowestEarner = removedEmployee.minBy(_._2)
  val salaryGroups = removedEmployee.groupBy((_, salary) => if salary >= 60000 then "High" else "Low")
  val hasSpecificSalary = removedEmployee.exists((_, salary) => salary == 55000)
  val allNames = removedEmployee.keys
  val allSalaries = removedEmployee.values
  val asList = removedEmployee.toList
  val bonuses = Map("Alice" -> 5000.0, "Bob" -> 4000.0)
 // val totalCompensation = removedEmployee ++ bonuses.map((name, bonus) => name -> (removedEmployee.getOrElse(name, 0.0) + bonus))

  val bonusCompensation = bonuses.map { case (name, bonus) =>
    val salary = removedEmployee.getOrElse(name, 0.0)
    val total = salary + bonus
    name -> total
  }

  val totalCompensation = removedEmployee ++ bonusCompensation


  println(s"Updated employees: ${updatedEmployees.map((name, salary) => f"$name -> $salary%.3f")}")
  println(s"Increased salaries: ${increasedSalaries.map((name, salary) => f"$name -> $salary%.3f")}")
  println(s"After removal: ${removedEmployee.map((name, salary) => f"$name -> $salary%.3f")}")
  println(s"High earners: ${highEarners.map((name, salary) => f"$name -> $salary%.3f")}")
  println(f"Top earner: ${topEarner._1} -> ${topEarner._2}%.3f")
  println(f"Lowest earner: ${lowestEarner._1} -> ${lowestEarner._2}%.3f")
  println(s"Salary groups: ${salaryGroups.map((group, list) => f"$group -> ${list.map((name, salary) => f"$name -> $salary%.3f")}")}")
  println(s"Has specific salary 55000: $hasSpecificSalary")
  println(s"All names: ${allNames.mkString(", ")}")
  println(s"All salaries: ${allSalaries.map(salary => f"$salary%.3f").mkString(", ")}")
  println(s"As list: ${asList.map((name, salary) => f"$name -> $salary%.3f")}")
  println(s"Total compensation: ${totalCompensation.map((name, salary) => f"$name -> $salary%.3f")}")
