@main def runStudentExample(): Unit = {
  case class Student(name: String, age: Int, grade: Double)

  val students: Array[Student] = Array(
    Student("Andrej", 20, 9.5),
    Student("Marija", 22, 8.3),
    Student("Mile", 19, 7.2)
  )

  //val sortedStudents = students.sortBy(_.grade)
  val sortedStudents = students.sortBy(+_.grade)
  println("Students sorted by grade:")
  sortedStudents.foreach(student => println(s"${student.name}: ${student.grade}"))

  val topStudent = students.maxBy(_.grade)
  println(s"Top Student: ${topStudent.name} with grade ${topStudent.grade}")
}