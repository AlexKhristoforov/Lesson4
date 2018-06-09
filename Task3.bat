@>nul MD ".\dist
javac -d dist src/*.java
java -cp dist Main
pause
@>nul del ".\dist\*.class"
@>nul RD ".\dist