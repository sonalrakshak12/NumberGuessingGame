
# 🎯 Number Guessing Game in Java

A simple and interactive **Number Guessing Game** developed using Java. The computer randomly selects a number, and the player has to guess it within a limited number of attempts.

## 🚀 Features

* 🎲 Generates a random number automatically
* 🎮 Three difficulty levels:

  * Easy – Number between 1–50
  * Medium – Number between 1–100
  * Hard – Number between 1–200
* ❤️ Limited attempts based on difficulty
* 🔥 Hints such as **Too High** and **Too Low**
* ⭐ Score system
* 🏆 Displays the final score
* 😢 Shows the correct number when the player loses
* 🖥️ Simple console-based interface

## 🛠️ Technologies Used

* **Java**
* `Scanner` for user input
* `Random` for generating random numbers
* `if-else` statements for decision making
* `for` loop for controlling attempts

## ▶️ How to Run

1. Make sure Java is installed on your computer.
2. Clone or download this repository.
3. Open the project in any Java IDE such as IntelliJ IDEA, Eclipse, or VS Code.
4. Compile the program:

```bash
javac GuessingGame.java
```

5. Run the program:

```bash
java GuessingGame
```

## 🎮 How to Play

1. Select a difficulty level.
2. The computer generates a random number.
3. Enter your guess.
4. The game gives you a hint:

   * **Too high!** → Your guess is greater than the number.
   * **Too low!** → Your guess is smaller than the number.
   * **Correct!** → You guessed the number.
5. Try to guess the number before your attempts run out.

## 📌 Example

```text
===== NUMBER GUESSING GAME =====
1. Easy
2. Medium
3. Hard

Choose difficulty: 2

I have selected a number between 1 and 100
You have 7 attempts.

Attempt 1: Enter your guess: 50
Too low!

Attempt 2: Enter your guess: 75
Too high!

Attempt 3: Enter your guess: 63
🎉 CORRECT! You won!
Your score: 50
```

## 📚 Learning Concepts

This project is useful for beginners learning:

* Variables and data types
* User input
* `if-else` conditions
* `for` loops
* Random number generation
* Boolean variables
* Basic game logic

## 👨‍💻 Author

Sonal Rakshak

---

⭐ If you found this project useful, consider giving the repository a star!
