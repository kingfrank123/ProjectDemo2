package tests

import org.scalatest.FunSuite
import scalafx.animation.AnimationTimer
import scalafx.application
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.paint._
import scalafx.scene.shape.Circle
import scalafx.scene.input._
import scalafx.Includes._
import scalafx.scene.text._


class testCricleColor extends FunSuite{
  test("test if circle is not yellow "){
    val me = Circle(1000, 500, 20)

    me.fill = Color.Yellow

    val test = Circle(1000,500,20)

    test.fill = Color.Aqua

    assert(me != test)
  }

}
