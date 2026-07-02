maven home path
/usr/share/maven

JDK-21 path
/usr/lib/jvm/java-21-openjdk-21.0.11.0.10-2.el9_7.x86_64

  969  java -version
  970  mvn -version

  sudo update-alternatives --config java
  sudo update-alternatives --config javac

  971  export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-21.0.11.0.10-2.el9_7.x86_64
  972  export PATH=$JAVA_HOME/bin:$PATH
  989  mvn clean package 
  990  java -jar target/jenkins-cicd-demo-1.0.0.jar 

#change port no.
  ~/jenkins-cicd-demo/src/main/resources/application.properties