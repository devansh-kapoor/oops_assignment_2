package oops

object test {
  def main(args: Array[String]): Unit = {
    val personOne = new person("Test", 18)
    val personTwo = new person("Test", 27)
    personOne.check(personTwo)
    personTwo.check(personTwo)
  }

}
