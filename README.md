# String Compression and Decompression System

## Overview

This project is a simple Java application that demonstrates how string compression and decompression work.

The program takes a string as input, compresses consecutive repeated characters by storing the character along with its count, and then decompresses it back to the original form.

For example:

Input:
aaabbcccc

Compressed:
a3b2c4

Decompressed:
aaabbcccc

## Features

* Compresses repeated characters in a string
* Decompresses the compressed string back to its original form
* Validates whether decompression is successful
* Easy to understand and implement

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* StringBuilder
* Scanner Class

## How It Works

1. Enter a string from the keyboard.
2. The program counts consecutive repeated characters.
3. A compressed string is generated.
4. The compressed string is decompressed.
5. The original and decompressed strings are compared for verification.

## Sample Output

Enter a string: aaabbcccc

Original String: aaabbcccc

Compressed String: a3b2c4

Decompressed String: aaabbcccc

Success

## Project Structure

Compressor.java

* compress() → Compresses the input string
* decompress() → Restores the original string
* main() → Handles user input and program execution

## Learning Outcomes

This project helped in understanding:

* Java classes and objects
* Methods and encapsulation
* String manipulation
* Loops and conditional statements
* Basic data compression concepts

## Conclusion

The project successfully demonstrates a simple string compression and decompression technique using Java. It is a beginner-friendly project that showcases the practical use of Object-Oriented Programming concepts and string processing.
