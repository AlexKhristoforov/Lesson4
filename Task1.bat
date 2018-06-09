@>nul MD ".\dist
javac -d dist src/Task1.java
java -cp dist Task1
pause
@>nul del ".\dist\*.class"
@>nul RD ".\dist