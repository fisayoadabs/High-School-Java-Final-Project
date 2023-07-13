# Clues Game

This is a simple text-based game called "Clues Game" implemented in Java. The game involves guessing and accusing avatars based on clues provided.

## Game Rules

- The game starts with a brief introduction to the story and mission.
- The player is presented with a list of avatars, elements, and kingdoms.
- A random guilty avatar, element, and kingdom are selected.
- The player can move between rooms using secret passages.
- The player can guess the guilty avatar, element, and kingdom in the current room.
- Clues are provided based on the correctness of the guess.
- The player can accuse the guilty avatar, element, and kingdom to win the game.
- The game ends with a win or lose message based on the accusation.

## How to Play

To play the game, follow these steps:

1. Compile the Java file: `javac CluesGame.java`
2. Run the compiled file: `java CluesGame`
3. Follow the on-screen instructions and make choices using the provided options.
4. Make guesses based on the provided clues.
5. Accuse the guilty avatar, element, and kingdom when ready.
6. Receive a win or lose message based on the accusation.

## Implementation Details

The game is implemented using Java and consists of several methods:

- `display()`: Displays the start menu and controls the game flow.
- `Guilty()`: Generates random guilty avatar, element, and kingdom.
- `position()`: Determines the player's position, allows movement, and guessing.
- `guess()`: Takes player's guesses and compares them with the guilty aspects.
- `accuse()`: Takes player's accusation and compares it with the guilty aspects.
- `guesscompare()`: Compares the player's guesses with the guilty aspects and provides clues.
- `accusecompare()`: Compares the player's accusation with the guilty aspects and determines the game outcome.

## Feedback

This is a basic implementation of the Clues Game and can be further expanded and improved based on specific requirements and game design.

There are no error checks meaning if the wrong value was inputted then the whole game crashes rather than looping through the question.

Enjoy playing the Clues Game!

## Author 

-Oluwafisayo Adabs
