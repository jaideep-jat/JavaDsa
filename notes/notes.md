#Methods
- their is no call by refference in java their is call by value we dont have pointers in java we do not get address or anything in java.

# scoping
-from where we can access our variable  
1. function scope - if we write any variable in function we can only access that in that function not in another function.
2. values which ar̥e initilize in blocks, will be remain in the block
3. already initialized outiside the outside the block but in the same method , hence you can not initilize again but you can chnage the valye 
    {
        int a= 23;
        int b = 44;
        {
            int a = 44; // still we can not initilize a here becouse it is in differnt block but in same method
            a = 44; //reasinging the orignal ref variabe to some other value.
            sout(a); // here it will print the 44 at a.
        } 
        sout(a); // here it will show the value is 23 not 44 because it is out of that block.
    }

 # two rules of scoping
   1. we can write any ref variable in funtion we can only access that in that function.
   2. Block scope - and if the write funtion into method their we can only reasing the value not change the ref variable.
     * this two rules will be apples same for string ass well.
   3. loop scope - 

anythimh which is initilized outside the block can be used inside the box but anything which is initialize
 iside the box can not be used outside.

 # Shadowing 
 Shadowing occurs when a local variable (or method/field) has the same name as a variable in an outer scope, like a 

 