#Topic:


1. Parallel Execution
2. Reporting in Cucumber

3. Accessing different project features/step files 
4. Passing data from one project to another

5. Uploading jar to Nexus



================================================================================================================
#Parallel Execution with latest cucumber version

Steps:
1. make sure package name is set to "parallel" for feature file and step files
2. Add maven surefire plugin in pom.xml
3. mvn clean test

================================================================================================================
#Reporting:
1. Add dependency + plugin for net.masterthought
2. mvn verify



================================================================================================================
# To make project jar in .m2 repo
Step:
1. Create a test jar in target folder   |  mvn clean package    |  m2 folder will not get create on package
https://maven.apache.org/plugins/maven-jar-plugin/examples/create-test-jar.html
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-jar-plugin</artifactId>
				<version>3.2.0</version>
				<executions>
					<execution>
						<goals>
							<goal>test-jar</goal>   //it will make test jar additionally
						</goals>
					</execution>
				</executions>
			</plugin>


2. Now run mvn clean install   |  project get create inside m2 with updated jars (both main & test jar will be updated in m2)
C:\Users\Sheetal_Singh\.m2\repository\bdd\CucumberAlpha\0.0.1-SNAPSHOT

================================================================================================================


mvn clean install -Dcucumber.filter.tags="@fk"                   
mvn clean install -Dcucumber.filter.tags="@fk or @amazon"			
mvn clean install "-Dcucumber.options= --tags @fk --tags @amazon"      |  ERROR 


================================================================================================================

# To upload jar on Nexus Repo
https://www.baeldung.com/maven-deploy-nexus

1. Setup Nexus on your machine
2. Setting.xml | C:\apache-maven-3.6.1-bin\apache-maven-3.6.1\conf\setting.xml
 	<server>
      <id>nexus-snapshots</id>
      <username>admin</username>
      <password>admin123</password>
    </server>
3. POM.xml 
	<distributionManagement>
		<!--  For snapshot jar only  -->
		<snapshotRepository>
			<id>nexus-snapshots</id>
			<url>http://localhost:8081/nexus/content/repositories/snapshots</url>
		</snapshotRepository>
	</distributionManagement>

4. mvn clean deploy -Dmaven.test.skip=true 
5. Verify in Nexus | http://localhost:8081/nexus/#view-repositories;snapshots~browsestorage




