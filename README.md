# WIX1002 – Viva 1: Flow Control

Java solutions for **Viva 1 (Flow Control)**, Semester 1 2026/27, WIX1002 Fundamentals of Programming, Universiti Malaya.

## Team

| Name | Matric No. | Question(s) |
|------|------------|-------------|
| _Your Name_ | _Matric No._ | Q1 |
| _Member 2_ | _Matric No._ | Q2 |
| _Member 3_ | _Matric No._ | Q3 |
| _Member 4_ | _Matric No._ | Q4 |
| _Member 5_ | _Matric No._ | Q5, Q6 |

> Edit the table above with your real group members and who wrote which question.

## Questions

| # | Title | Task | File |
|---|-------|------|------|
| 1 | ISBN Number | Check whether the ISBN check digit (weighted sum of 9 digits, mod 11, `X` if remainder is 10) is correct. Print `Right`, or the corrected ISBN. | `Q1.java` |
| 2 | Number Reversal | Reverse the digits of an integer N (−10⁹ ≤ N ≤ 10⁹), with no leading zeros and sign kept. | `Q2.java` |
| 3 | Speaking Rudely | Given string S and target length L, find the minimum number of operations (append *x* copies of a character that appears *x* times) to reach length ≥ L. | `Q3.java` |
| 4 | All Substrings | Print every substring of s with its 1-based start/end index, in lexicographic order. | `Q4.java` |
| 5 | Mobile Phone Keypad | Count the minimum key presses to type a sentence on a classic phone keypad. | `Q5.java` |
| 6 | Decompression Password | Decompress nested `[DX]` patterns (D = repeat count 1–99, up to 10 levels). | `Q6.java` |

## Sample Input / Output

**Q1 – ISBN Number**
```
Input:  0-670-82162-4        Output: Right
Input:  0-670-82162-0        Output: 0-670-82162-4
```

**Q2 – Number Reversal**
```
Input: 123     Output: 321
Input: -380    Output: -83
```

**Q3 – Speaking Rudely**
```
Input:  nzhtl1477
        15
Output: 2
```

**Q4 – All Substrings**
```
Input:  luogu
Output: g 4 4
        gu 4 5
        l 1 1
        ...
        uogu 2 5
```

**Q5 – Mobile Phone Keypad**
```
Input:  i have a dream
Output: 23
```

**Q6 – Decompression Password**
```
Input:  AC[3FUN]
Output: ACFUNFUNFUN
```

## How to Run

Requires JDK 8 or later.

```bash
javac Q1.java
java Q1
```

Replace `Q1` with the question you want to run. Each program reads from standard input.

## Repository Structure

```
VIVA 1/
├── Q1.java
├── Q2.java
├── Q3.java
├── Q4.java
├── Q5.java
├── Q6.java
└── README.md
```

## Notes

- Group assignment follows the project group.
- Every member must be able to explain and edit any question during the viva.
