@>nul MD ".\dist
javac -d dist src/Task2.java
java -cp dist Task2
pause
@>nul del ".\dist\*.class"
@>nul RD ".\dist