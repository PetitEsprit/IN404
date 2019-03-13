javac -g src/*.java -d classes
jar -cfe Syst.jar Main -C classes .
java -jar Syst.jar