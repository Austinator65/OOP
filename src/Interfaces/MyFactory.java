package Interfaces;

class MyFactory {
    public static MyInterface createInstance() {
        return new MyClass();
    }
}
