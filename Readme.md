# Advanced Object Oriented Programming Questions

## 1. Parking Lot System - 26 jan, 2025
### Problem Statement:
Design a parking lot system that supports different vehicle types and manages parking spots.

### Approach:
- Use `Vehicle` class for different vehicle types.
- Use `ParkingSpot` class to manage parking.
- Allow checking availability and assigning spots.

### Solution Explanation:
- Each `ParkingSpot` holds a `VehicleType`.
- If a vehicle matches the spot type and is available, it is parked.

---

## 2. ATM System - 27 jan, 2025
### Problem Statement:
Create an ATM system that allows deposits, withdrawals, and balance checks.

### Approach:
- Use `Account` class to handle balances.
- Use `ATM` class to interact with an account.

### Solution Explanation:
- The `withdraw` method checks if enough balance is available.
- The `deposit` method increases the balance.

---

## 3. Library Management System - 28 jan, 2025
### Problem Statement:
Design a system to manage books, borrowing, and returning.

### Approach:
- `Book` class with `borrow` and `returnBook` methods.
- Maintain a boolean flag for availability.

### Solution Explanation:
- Books can be borrowed only if available.
- When returned, they become available again.

---

## 4. Ticket Booking System - 29 jan, 2025
### Problem Statement:
Develop a system to book and manage tickets.

### Approach:
- `Ticket` class with `book` method.
- Keep track of whether a ticket is booked.

### Solution Explanation:
- Users can book a ticket if it is not already booked.
- Booking status is updated accordingly.

---

## 5. Online Shopping Cart System - 30 jan, 2025
### Problem Statement:
Create a shopping cart that allows adding items and calculating total price.

### Approach:
- `Item` class to store product details.
- `Cart` class to add items and compute total.

### Solution Explanation:
- Items are stored in a list.
- `getTotal` method sums up item prices.

---

## 6. Social Media Follow System - 31 jan, 2025
### Problem Statement:
Design a system where users can follow each other and see follower count.

### Approach:
- `User` class with `follow` method.
- Maintain a `Set<User>` for followers.

### Solution Explanation:
- A user can follow another by adding to their follower list.
- The follower count is tracked dynamically.

---

## 7. File Storage System - 01 feb, 2025
### Problem Statement:
Design a system for organizing files and folders.

### Approach:
- `File` class for storing file details.
- `Folder` class to contain multiple files.

### Solution Explanation:
- `Folder` holds a list of `File` objects.
- Files can be added dynamically to a folder.

---

## 8. Chess Game - 02 feb, 2025
### Problem Statement:
Create a basic chess game structure with different piece movements.

### Approach:
- Use an abstract `Piece` class.
- Create concrete classes like `King`, `Queen` with unique movement logic.

### Solution Explanation:
- Each piece implements its own `isValidMove` method.
- The King can move one step in any direction.

---

## 9. Elevator System - 03 feb, 2025
### Problem Statement:
Build a system to simulate an elevator moving between floors.

### Approach:
- `Elevator` class with `goToFloor` method.
- Keep track of the current floor.

### Solution Explanation:
- The elevator moves to the requested floor and updates its position.

---

## 10. Messaging System
### Problem Statement:
Develop a simple messaging system where users can send messages to each other.

### Approach:
- `Message` class with sender, receiver, and content fields.
- `showMessage` method to display messages.

### Solution Explanation:
- Messages are created with sender and receiver details.
- They can be displayed when needed.

---