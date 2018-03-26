name := "play-java-ebean-example"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.11"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

libraryDependencies ++= Seq(
  jdbc,
  "com.typesafe.play" %% "anorm" % "2.5.1"
)

libraryDependencies += "com.adrianhurt" %% "play-bootstrap" % "1.0-P25-B3"

libraryDependencies += "com.aspose" % "aspose-cells" % "18.2"


// https://mvnrepository.com/artifact/com.ebay/xcelite
libraryDependencies += "com.ebay" % "xcelite" % "1.0.4"



libraryDependencies ++= Seq(
  "org.postgresql" % "postgresql" % "9.4.1208.jre7",
  cache,
  javaWs
)

libraryDependencies += "org.webjars" % "bootstrap" % "3.2.0"



// https://mvnrepository.com/artifact/org.assertj/assertj-core
//libraryDependencies += "org.assertj" % "assertj-core" % "3.9.1" % Test


libraryDependencies += "com.monitorjbl" % "xlsx-streamer" % "1.2.1"

resolvers += "AsposeJavaAPI" at "http://maven.aspose.com/repository/simple/ext-release-local/"


