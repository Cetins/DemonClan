# DemonClan

## OOP with JAVA - practice project

This is an educational project and not promising anything, so you can't actually fight with demons here :)

In this project there are packages for

* Players
* Demons
* Rooms
* Quests
* Helpers
* Interfaces

There are three main player class, they have subclasses.

* Fighter (Knight, Dwarf, Barbarian)
* Speller (Warlock, Wizard)
* Healer (Cleric)

In the project I've collected all common properties among players under Player abstract class. Different player classes have different attack objects so I added them under these classes (Fighter, Speller etc.). Then I created sub-classes and add more special attack methods in there.

## Interfaces

This project is one of the most beautiful ways to understand Interfaces in Java. When it comes to attack and take damage, these are the actions we can both apply to player and demon classes, so I added a IAttack Interface to collect all the classes under one type. Interfaces are collecting different classes under one type so you can apply the same function to all of them and at the same time you can write million different ways how this function would work for different classes. For example in this project Knight class can wear an armor which decrease the damage it takes. IDamaga interface has a `takeDamage()` method for all characters but just for Knight objects this functions checks whether object has an armor, then calculates the damage depending on the condition. 

## Helpers

I've collected `ENUM`s in here to easy access because the bigger projects gets the more complicated it becomes to find a simple file. So better to have multiple different packages to collect different items. On a second thought I should have name this package as Enums.

## Running main

`Runner` file is located in the main package `DemonClan`. If you run it you may see the result of the quest on the console. I'm using free version of  IntelliJ so it runs through IDE with a right click. Because this game is not actually running but simulating a game, the mechanics are a bit different. There isn't any fighting algorithm unfortunately, it only calculates the damage on the player objects. It loops through all the rooms in the quest, collects items such as herbs for hp, coins for xp then if it's a `demonRoom` it equally splits the damage capacity of demon among players. If player dies prints the name and condolonces on the console. At the end of the quest of there is any alive player quest completes successfully, if all players die quests fails. We assume demon dies, bit of a imagination please I've started Java 2 weeks ago.

## Permits

Feel free to fork or copy, manipulate anything you want, it's a good begginner project to work on.

### Good luck with your demons :)
