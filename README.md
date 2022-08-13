# DemonClan

## OOP with JAVA practise project

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

This project is one of the most beautiful ways to understand Interfaces in Java. When it comes to attack and take damage, these are the actions we can both apply to player and demon classes, so I added a IAttack Interface to collect all the classes under one type. 
