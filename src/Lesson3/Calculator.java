package Lesson3;

public interface Calculator {
    void calculate(int a, int b);

    default int calc(int a, int b){
        return (a+b);
    }
}
