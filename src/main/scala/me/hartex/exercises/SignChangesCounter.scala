package me.hartex.exercises

/**
  * The task is to iterate through List[Int] and count how many sign changers
  * (from negative number to positive and vise versa) appears in the List
  *
  * @author hartex
  */
object SignChangesCounter {

  /**
    * Recursive solution
    **/
  def countRecursive(seq: List[Int]): Int = {
    def innerCount(col: List[Int], counter: Int): Int = {
      if (col.nonEmpty) {
        if (deviance(col)) innerCount(col.tail, counter + 1)
        else innerCount(col.tail, counter)
      }
      else counter
    }

    def deviance(col: List[Int]): Boolean = {
      if (col.tail.nonEmpty) {
        val hd = col.head
        val next = col.tail.head
        (hd >= 0 && next < 0) || (hd < 0 && next >= 0)
      }
      else false
    }

    innerCount(seq, 0)
  }

  /**
    * Functional style solution
    **/
  def countFunctional(seq: List[Int]): Int = ???

}
