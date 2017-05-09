package me.hartex.exercises

import org.scalatest.FlatSpec

/**
  * @author hartex
  */
class CharCountSpec extends FlatSpec {

  lazy val tesPhrase = "hello scala world"
  lazy val testMap =
    Map('e' -> 1, 's' -> 1, 'a' -> 2, ' ' -> 2, 'l' -> 4, 'c' -> 1, 'h' -> 1, 'r' -> 1, 'w' -> 1, 'o' -> 2, 'd' -> 1)

  "countRecursive result on testPhrase" should "be equal to testMap" in {
    assert(CharCount.countRecursive(tesPhrase) == testMap)
  }

  "countFunctional result on testPhrase" should "be equal to testMap" in {
    assert(CharCount.countFunctional(tesPhrase) == testMap)
  }

  "countRecursive and countFunctional results on testPhrase" should "be equal" in {
    assert(CharCount.countRecursive(tesPhrase) == CharCount.countFunctional(tesPhrase))
  }
}
