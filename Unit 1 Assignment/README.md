Here’s exactly how it works in VS Code:

1. What to name the Java file
Your file name must match the public class name.

Your code has:
public class QuizGame

So you must save it as:
👉 QuizGame.java

If you name it anything else, it will not run.


2. How to run it in VS Code console
Step 1: Make sure Java is installed

Open terminal and type:
java -version
javac -version

If both show versions, you’re good.

Step 2: Compile the program
Go to the folder where your file is saved, then run:
javac QuizGame.java

This creates a file called:
QuizGame.class


Step 3: Run the program
Now run:
java QuizGame

That will start your quiz in the terminal.