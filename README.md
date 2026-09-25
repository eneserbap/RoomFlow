<div align="center">
  <h1>🏨 RoomFlow</h1>
  <p><b>Advanced Object-Oriented Hotel Management System</b></p>
  <p><i>Software Design and Architecture - Term Project</i></p>
</div>

---

## 👥 Project Team
* **Authors:** Enes Erbap / Sude Hatkaoglu
* **Language:** Java 17+
* **Core Focus:** Design Patterns, SOLID Principles, and Clean Architecture

---

## 🎯 Overview
RoomFlow is not just a standard procedural application; it is a meticulously crafted Object-Oriented Hotel Reservation System. The primary objective is to demonstrate how industry-standard **Design Patterns** can solve common software architecture problems such as class explosion, rigid pricing, and unsafe state transitions.

---

## 🗺️ Development Roadmap (Phases)

We are developing this project iteratively using Version Control (Git). The project is divided into **4 core phases**:

### ✅ Phase 1: Core Foundation & Factory Pattern (Completed)
The backbone of the system. We established the fundamental rules and object creation mechanisms.
* **Abstraction:** Created the `Room` interface to enforce a strict contract (`getCost`, `getDescription`, `getId`, `getStatus`).
* **Encapsulation:** Secured all room properties (`UUID`, `RoomStatus`) as `private` fields, accessible only via Getter methods.
* **Factory Pattern:** Implemented a centralized `RoomFactory` to dynamically instantiate `StandardRoom` and `SuiteRoom` objects. This prevents hard-coding and keeps the system open for extension.
* **Polymorphism:** The `Main` client treats all objects simply as `Room`, allowing dynamic method resolution at runtime.

### 🚧 Phase 2: Dynamic Add-ons (Decorator Pattern)
How do we add services like *Open Buffet Breakfast* or *Spa Access* to a room without creating classes like `SuiteRoomWithBreakfastAndSpa`?
* **Goal:** Implement the **Decorator Pattern**.
* **Outcome:** Services will act as wrappers around base rooms, dynamically recalculating the total cost and description at runtime without altering the core room classes.

### 📅 Phase 3: Status Management (State Pattern)
How do we prevent double-booking safely?
* **Goal:** Implement the **State Pattern** to replace basic enum checks.
* **Outcome:** Rooms will transition between concrete state objects (`AvailableState`, `OccupiedState`, `CleaningState`). The system will automatically block invalid operations (e.g., trying to book a room that is already `OccupiedState`).

### 📅 Phase 4: Final Assembly & System Testing
* Tying all patterns together in a robust `Main` simulation.
* Comprehensive testing of edge cases.
* Final code clean-up and documentation review.

---

## 🚀 How to Run
Currently, Phase 1 is active. To test the core Factory Pattern:
1. Compile the Java files located in the `src` directory.
2. Run the `Main.java` class.
3. Observe the console output demonstrating dynamic room generation and error handling.
