# banking-system-java

A Java-based banking system demonstrating object-oriented design, entity relationships, and collection-based data management.

## Overview

This project models a simple banking domain where a bank manages multiple branches, branches manage customers, and customers maintain transaction histories.

The implementation focuses on clean object-oriented structure and separation of responsibilities between domain entities.

## Core Functionality

- Create and manage bank branches
- Register customers with initial transactions
- Add transactions to existing customers
- Retrieve and display customer information
- Manage relationships between domain objects

## Design Concepts Applied

- Object-Oriented Programming principles
- Encapsulation through private fields and controlled access
- Separation of responsibilities between classes
- Object composition and entity relationships
- Collection management using Java ArrayList
- Wrapper classes and autoboxing (`double` → `Double`)
- Helper methods for internal object lookup

## Domain Model

### Bank
Responsible for managing branches and coordinating banking operations.

### Branch
Maintains customer records and handles customer-level operations.

### Customer
Stores customer details and manages transaction history.

## Technical Stack

- Java
- Java Collections Framework
- IntelliJ IDEA
- Git / GitHub

## Learning Goals

This project was created to practice designing maintainable Java applications, working with object relationships, and applying fundamental software engineering principles.
