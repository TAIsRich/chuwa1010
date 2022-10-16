// Overriding:
class shapes{
    //
    public int area(){
        System.out.println("find area");
    }
    public int area(int a, int b){
        System.out.println("rectangular area: " + a + "*" +b);
    }

}

// Overriding:

class animal{
    public void sound(){
        System.out.println("animal is making a sound");
    }
}

class cat extends animal{
    @Override
    public void sound() {
        System.out.println("meow meow");
    }
}

class dog extends animal{
    @Overide
    public void sound(){
        System.out.println("woof woof");
    }
}