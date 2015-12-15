name := "pircbot"
version := "1.5.0"
organization := "org.jibble"

crossPaths := false // no Scala suffix for published jar-s

javacOptions in (Compile, compile) ++= Seq("-source", "1.2", "-target", "1.2")
