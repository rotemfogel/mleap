package com.truecar.mleap.feature

/**
  * Created by hollinwilkins on 3/30/16.
  */
case class ReverseStringIndexerModel(strings: Seq[String]) {
  val indexToString: Map[Int, String] = strings.zipWithIndex.map(v => (v._2, v._1)).toMap

  def apply(index: Int): String = indexToString(index)
}