@main def complexTupleExample(): Unit =

  val complexData = (
    "Project X",
    2023,
    500000.75,
    List("Alice", "Bob", "Charlie"),
    Map("Alice" -> "Manager", "Bob" -> "Engineer", "Charlie" -> "Designer"),
    Set("Design", "Development", "Testing"),
    Some("In Progress")
  )

//  val someText: Option[String] = Some("Hello, ScaleFocus")
//  val noText: Option[String] = None


  val (projectName: String,
      year: Int,
      budget: Double,
      teamMembers: List[String],
      roles: Map[String, String],
      phases: Set[String],
      status: Option[String]) = complexData


  val updatedBudget = budget + 20000
  val teamSize = teamMembers.size
  val teamRoles = roles.values.toSet
  val extendedPhases = phases + "Deployment"
  val projectStatus = status.getOrElse("No status available")
  val newTeamMember = teamMembers :+ "David"
  val updatedRoles = roles.updated("David", "Intern")
  val isDesignPhaseIncluded = phases.contains("Design")
  val budgetFormatted = f"$$${budget}%.2f"
  val yearAndStatus = (year, projectStatus)

  println(s"Updated Budget: $updatedBudget")
  println(s"Team Size: $teamSize")
  println(s"Team Roles: ${teamRoles.mkString(", ")}")
  println(s"Extended Phases: ${extendedPhases.mkString(", ")}")
  println(s"Project Status: $projectStatus")
  println(s"New Team Member Added: ${newTeamMember.mkString(", ")}")
  println(s"Updated Roles: ${updatedRoles.map((name, role) => s"$name -> $role").mkString(", ")}")
  println(s"Is Design Phase Included: $isDesignPhaseIncluded")
  println(s"Formatted Budget: $budgetFormatted")
  println(s"Year and Status: $yearAndStatus")
