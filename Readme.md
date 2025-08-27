### Assignment - 1

Name: Priyanshu Pandey

Roll Number: 112201020

### Problem Statement
Demonstrate polymorphism using Base animal type with specialized sounds per animal implementation.

### Package: animals
All the available animal types

### Unit Tests: 
Separate tests for each functionality of the animals

### Example Use Case

The project demonstrate polymorphism using a `Base animal type` with characterized sounds for each animal implementation. A use Case : "Zoo Show" where various animals are introduced, to demonstrate the use-case of the animal package.

#### Architecture
The project follows a simple, hierarchical architecture:
*   **`org.zoo_show` package:** Contains the main `ZooShow` class, which orchestrates the demonstration.
*   **`org.zoo_show.animals` package:** Contains the `Animal` abstract base class, the `AnimalType` enum, and concrete animal implementations (e.g., `Cat`, `Dog`, `Lion`, `Cow`, `Chimpanzee`).

The `animals` package focuses on animal sounds, depicting separation of concerns.

#### Design
The design effectively utilizes object-oriented principles, particularly polymorphism and inheritance:
*   **`Animal` Abstract Class:** Serves as the base type, defining common behaviors (`getName()`, `getType()`, `makeSound()`) that all animals should possess. `getName()` and `getType()` are abstract, forcing concrete animal classes to implement them.
*   **`AnimalType` Enum:** To categorize animals.
*   **Concrete Animal Classes:** Each animal (e.g., `Cat`, `Dog`) extends the `Animal` abstract class and provides its specific implementation for `getName()`, `getType()`, and `makeSound()`.
*   **Polymorphism in `ZooShow`:** The `ZooShow` class iterates through `Animal` array, calling `getName()`, `getType()`, and `makeSound()` on each `Animal` reference, and the correct overridden method for that specific animal type is invoked at runtime.
