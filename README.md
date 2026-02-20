# CSIS2430 - Project 1

## Description
This program demonstrates operations on:

1. Ordinary sets using Boolean arrays  
2. Multisets (bags) using integer count arrays  

The program computes and displays:

### Ordinary Set Operations
- Union (A ∪ B)
- Intersection (A ∩ B)
- Difference (A − B)
- Complement (NOT A)
- Symmetric Difference (A ⊕ B)

### Multiset Operations
- Union (max counts)
- Intersection (min counts)
- Difference (subtract counts, floor at 0)
- Sum (add counts)

---

## How to Run

Compile:
javac src/Main.java

Run:
java -cp src Main

---

## Expected Behavior

When executed, the program prints:

- Clearly labeled sections for Part 1 (Ordinary Sets) and Part 2 (Multisets)
- Bit-string representations for ordinary sets
- Human-readable element listings
- Count arrays for multisets
- Labeled results for each required operation

Exact output values depend on the sample data defined inside `Main.java`.

---

## Repository Structure

/src  
  Main.java → Implementation  

/docs  
  proj_1_plan.md  
  proj_1_scope.md  
  proj_1_pseudocode.md  
  test-results.md (verification evidence)
