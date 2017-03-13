import com.typesafe.sbt.SbtStartScript
 
name := "assignment3"
 
version := "0.0.1"
 
organization := "FJI"
 
scalaVersion := "2.12.1"
 
libraryDependencies ++= Seq(
"com.typesafe" % "scalalogging-log4j_2.10" % "1.0.1",
"org.apache.logging.log4j" % "log4j-core" % "2.0-beta3",
"junit" % "junit" % "4.10" % "test",
"com.novocode" % "junit-interface" % "0.8" % "test->default"
)
 
seq(SbtStartScript.startScriptForClassesSettings: _*)
 
SbtStartScript.stage in Compile := Unit
 
scalacOptions ++= Seq("-deprecation")