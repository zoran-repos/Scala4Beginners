@main def runSentenceGenerator(): Unit = {
  val nouns = List("cat", "dog", "bird")
  val verbs = List("jumps", "runs", "flies")
  val adjectives = List("quick", "lazy", "happy")


  def generateSentence(adjective: String, noun: String, verb: String): String =
  s"The $adjective $noun $verb"

//  val sentences = for {
//    adj <- adjectives
//    noun <- nouns
//    verb <- verbs
//  } yield generateSentence(adj, noun, verb)
//    println("Generated sentences:")
//    sentences.foreach(println)

  val sentences = adjectives.flatMap(adj => nouns.flatMap(noun => verbs.map(verb => s"The $adj $noun $verb")))
  println("Generated sentences:")
  sentences.foreach(println)

  val filteredSentences = sentences.filter(_.contains("lazy"))
  println("Sentences containing 'lazy':")
  filteredSentences.foreach(println)
}