# Control Flow and Loops

## Control Flow Statements:

if statement:
- can contain one or more `else if` and/or ONE `else` statement on it to control the logic flow

```
if (true){
    do this code block
} else if (this is true) {
    do this code block instead
} else {
    do this code block if none of the other conditions were met
}
```

switch statement:
- has fallthrough logic
- can have byte, short, int, long(with its Wrapper class), enums and string for the expression
- cases MUST match the type evaluated in the expression

```
switch (expression) {
    case value1: {
        write logic here
        break; //<- the break is optional but without break any following conditions will run until the next break stmt
    }
    case value2: {
        write logic here
    }
    case value3: {
        // this will happen if case 2 is run 
        // since there is no break stmt in case 2 (fallthrough)
        write logic here
        break;
    }
    default: {
        //this case will run if none on the cases match the value of the expression
        write logic here
        break;
    }
}
```
<br><br>

## Loops
**Loops continue to run until the condition is satisfied (until it returns false)**

for loop:
- condition includes the following:
    * (starting point; condition to evaluate; change of starting point)

```
for(int i = 0; i < 5; i++) {
    //This for loop will keep performing the logic until i=5 
    //since the middle part will no longer be true (5 is not less than 5)
    write logic here
}
```

while loop:
```
while(true) {
    write logic here
}
```


do-while loop:
- the `do` portion of the `do-while loop` always runs at least once.

```
do {
    write logic here
}
while(this condition is true)
```