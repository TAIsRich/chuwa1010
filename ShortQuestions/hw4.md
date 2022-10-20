### 1
Generic is when we do not know what type variable would be used, we use generic to show it.
a generic parameter declaration means this class/function can accept any type of variable.
### 5
Runtime Exception is uncheck exception which means those exceptions can not be found during compile time.
e.g IndexOutOfBoundException, NullPointerException
### 6
```aidl
String str=null;
if(str.equals("xxx"){
        ....
}
```
In this case, JVM would through NullPointerException
### 7
Optional class is java 8 new feature, mainly use to check whether an object is null to avoid NullPointerException
### 8
the interface only have one abstract function, the implement class only have to override this one function for sanity check
### 9
lambda is the implementation of the abstract method to replace anonymous class
### 10
Method Reference is a way to call a class/instance's function, it is simplified way to use lambda expression
### 11
1. default and static method in interface
2. lambda expression
3. functional interface
4. optional class
5. method reference
6. stream api
### 12
yes, if a variable' value never changed at memory, then the lambda can use this variable;
which means final variable, never changed non-final variable and object variables can be used by lambda
