# Hotel Reservation System

## Overview
This project implements a simplified Hotel Reservation System based on
UML structural and behavioral models. The system follows object-oriented
design principles and demonstrates reservation, check-in, and check-out
workflows.

## Design Reference
- Structural Design Model (Figure 18)
- Room State Chart (Figure 19)

## Key Features
- Room state management (FREE → RESERVED → OCCUPIED)
- Reservation creation and cancellation
- Guest check-in and check-out
- Input validation via domain exceptions

## Testing
JUnit 5 was used to verify system correctness:
- Normal reservation flows
- Boundary conditions
- Invalid state transitions

All tests pass successfully (Green Bar).

## Execution
The `Main` class demonstrates a complete use case:
1. Room reservation
2. Guest check-in
3. Guest check-out
4. State transitions logged at runtime
