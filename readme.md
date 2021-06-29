[UPD 29/06/21]

prerequisite : having OpenLiberty (full GA) installed in C:\workingarea\unzip\openliberty-21.0.0.6 folder. Else adapt the installDirectory clause of liberty-maven-plugin of fake-project\fake-ear\pom.xml file (L.63)

- install fake framework :

          cd fake-framework-superpom
		  mvn install
		  
- compile fake project :

          cd fake-project
		  mvn install
		  
Expected result :
in fake-project\fake-ear\target an ear having module with classifiers


please note that classifier is set in fake-framework-superpom : pom.xml