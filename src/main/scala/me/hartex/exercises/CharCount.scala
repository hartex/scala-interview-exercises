package me.hartex.exercises

/**
  * The task is to make a Map[Char, Int] from String, where Char is an unique character from that String
  * and Int indicates number of occurrences of that Char in the String
  *
  * @author hartex
  */
object CharCount {

  /**
    * Recursive solution
    **/
  def countRecursive(str: String): Map[Char, Int] = {
    def innerCollect(map: Map[Char, Int], char: List[Char]): Map[Char, Int] = {
      if (char.nonEmpty) {
        val ch = char.head.toLower
        if (map.contains(ch))
          innerCollect(map + (ch -> (map.getOrElse(ch, 0) + 1)), char.tail)
        else innerCollect(map + (ch -> 1), char.tail)
      }
      else map
    }

    innerCollect(Map(), str.toList)
  }

  /**
    * Functional style solution
    **/
  def countFunctional(str: String): Map[Char, Int] = str.groupBy(ch => ch) map { case (key, value) => (key, value.length) }
}

