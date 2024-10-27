sealed trait FileSystemEntry:
  def name: String
  def size: Int

case class File(name: String, size: Int) extends FileSystemEntry

case class Directory(name: String, entries: List[FileSystemEntry]) extends FileSystemEntry:
  def size: Int = entries.map(_.size).sum

def printFileSystem(entry: FileSystemEntry, indent: String = ""): Unit = entry match
  case File(name, size) =>
    println(s"${indent}File: $name, Size: $size KB")
  case Directory(name, entries) =>
    println(s"${indent}Directory: $name, Size: ${entry.size} KB")
    entries.foreach(printFileSystem(_, indent + "  "))

@main def runFileSystemExample(): Unit =
  val myDocuments = Directory("MyDocuments", List(
    File("resume.pdf", 120),
    Directory("Photos", List(
      File("vacation.jpg", 200),
      File("birthday.jpg", 150)
    )),
    File("notes.txt", 10)
  ))
  printFileSystem(myDocuments)
