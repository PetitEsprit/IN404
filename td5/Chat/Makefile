all: jar run

class:
	javac in404/exo61/serveur/Serveur.java in404/exo61/client/Client.java
	
jar: class
	jar cf Chat.jar in404/exo61/serveur/Serveur.class in404/exo61/client/Client.class

test: Test.java
	javac -cp Chat.jar Test.java

run: test
	java -cp Chat.jar:. Test
	