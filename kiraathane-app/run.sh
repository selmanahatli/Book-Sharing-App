export JAVA_HOME=/opt/java/jdk1.8.0/
mvn package exec:java  -Dexec.mainClass="App" -DskipTests
