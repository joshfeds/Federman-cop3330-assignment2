package ex30.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Federman
 *
 */
public class Base30 {
    public int doMath(int num1, int num2){
        return num1 * num2;
    }
    public void printMath(Base30 program){
        int [][] answer = new int[13][13];
        for(int i = 1; i < 13; i++){
            for(int j = 1; j < 13; j++){
                answer[i][j] = program.doMath(i, j);
                System.out.printf("%3d ", answer[i][j]);
            }
            System.out.printf("\n");
        }
    }
    public static void main(String [] args){
        Base30 program = new Base30();
        program.printMath(program);
    }
}
