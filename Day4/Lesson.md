# Static Keyword, Variable Scopes and Arrays

## Static Keyword
- is a non-access modifier
- can be used on a blocks, variables, and methods
- makes that member belong to the class rather than an instance of a class (object)
- You do NOT need to instantiate the class (make an object) before you can use its static member

<br><br>

## Variable Scopes
Class Scope:
- can be seen anywhere in the class (including method/block scope)

Method Scope:
- can be seenanywhere in the method it's defined in (including any block scope within that method)

Block Scope:
- can be seen only in the block it is defined in

```
public class Scopes{
    String classScope = "This can be used anywhere in the class";

    public void methodScope(){
        String methodScope = "This can only be used in method and block scope";

        if(true){
            String blockScope = "This can only be used within this block";
        } //end of if-statement (block scope ends here)

    }//end of methodScope() method (method scope ends here)

}//end of Scopes class (class scope ends here)
```

## Arrays
- store elements of the SAME type
- fixed size
- have a length property
- ways to create:
    * int[] array1 = new int[3]; <- this array can hold 3 elements that we haven't defined yet
    * int[] array2 = new int[]{1,2,3,4};