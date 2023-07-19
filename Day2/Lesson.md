# Primitives, Operators and String Basics

## Primitive Data Types In Java

boolean:
- Contains true/false values
- boolean check = true;

char:
- contains a single character
- char a = 'a';

byte:
- 8 bits of memory
- ranges from -128 to 127
- no decimals
- byte b = 12;

short:
- 16 bits of memory
- no decimals
- short s = 1263;

int:
- 32 bits of memory
- no decimals
- int i = 32;

float:
- 32 bits of memory
- float f = 32.6f;

double:
- 64 bits of memory
- double d = 16524.63;

long:
- 64 bits
- long l = 162.765L;

<br><br>

## Basic Java Operators;

Operators in java do have an order of precedence (kind of like PEMDAS/GEMS in math)

    - Increment/Decrement Operators:
        * ++i or i++
        * --i or i--
    - Arithmetic Operator
        * Multiplication (i * j)/Division (i / j)
        * Addition (i + j)/Subtraction (i - j)
        * Modulous: returns the remainder (i % 2)
    - Logical Operators:
        * AND (condition1 & Condition2) (condition1 && condition2)
        * OR (condition1 | condition2) (condition1 || condition2)
<br><br>

## Strings

**Strings are NOT a primitive data type!!! They are objects!!!**

Characteristics of Strings:
- immutable (cannot be changed) due to the fact that they are backed by (created from) arrays
- stored in the string pool
- have access to String class methods
- 2 ways to create:
    * String way1 = "This is one way to create a String";
    * String way2 = new String("This way ensures that a new String is created rather than a reference");
