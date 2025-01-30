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
