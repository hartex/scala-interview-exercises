package me.hartex.exercises

import org.scalatest.FlatSpec

/**
  * @author hartex
  */
class SignCounterSpec extends FlatSpec {

  lazy val testList = List(1, -2, -3, 4, 0, -5, 6, -7, 1, 0, 2, 4, -1, 5, -7)

  "countRecursive result on testList" should "be equal 9" in {
    assert(SignChangesCounter.countRecursive(testList) == 9)
  }

  "countFunctional result on testList" should "be equal 9" in {
    assert(SignChangesCounter.countFunctional(testList) == 9)
  }

}
