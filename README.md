# RoomFlow - Hotel Management System

**Course:** Software Design and Architecture
**Language:** Java
**Authors:** Enes Erbap / Sude Hatkaoglu

## Overview
RoomFlow is an Object-Oriented Hotel Reservation System built to demonstrate core Design Patterns and SOLID principles. The primary goal of this project is to create a robust, maintainable, and scalable architecture rather than a simple procedural application.

## Implemented Features (Phase 1)
- **Abstraction:** Defined a core `Room` interface ensuring all room types adhere to a strict contract (must provide cost, description, ID, and status).
- **Encapsulation:** All room properties (such as UUID and RoomStatus) are strictly kept `private`. They are initialized within constructors and exposed safely through Getter methods to prevent unauthorized modifications.
- **Factory Design Pattern:** Integrated a `RoomFactory` to handle the dynamic creation of different room types (`StandardRoom`, `SuiteRoom`). This centralizes object creation and keeps the client code (`Main.java`) clean and open for extension (Open/Closed Principle).
- **Polymorphism:** The system treats all created rooms simply as `Room` objects, automatically resolving to their specific concrete implementations at runtime.

## Upcoming Features (Phase 2 & 3)
- **Decorator Pattern:** Will be implemented to dynamically add extra services (like Breakfast, Spa Access) to existing rooms, recalculating the total cost without modifying the base room classes.
- **State Pattern:** Will be used to cleanly manage the transitions between room statuses (Available, Occupied, Cleaning) and prevent invalid booking actions.

## How to Run
1. Compile the Java files located in the `src` directory.
2. Run the `Main.java` class to see a simulation of the Room Factory generating rooms and printing their details to the console.
