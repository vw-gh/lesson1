package com.lesson;

import groovy.ui.SystemOutputInterceptor;

/**
 * Created by v.vinogradov on 07.04.2015.
 */
public class Field {

    public int fieldSize;

    private static final char DEFAULT_CELL_VALUE = ' ';
    private static final int DEFAULT_FIELD_SIZE = 3;

    private char[][] field;

    public Field(){
        this(5);
        System.out.println("Constructor1");
    }


    public Field(int size) {
        fieldSize = size;
        field = new char[fieldSize][fieldSize];
        System.out.println("Constructor2");
    }

//    public void setFieldSize(int newfieldSize) {
//        if (newfieldSize > 0 && newfieldSize < MAX_FIELD_SIZE) {
//           fieldSize = newfieldSize;
//        }
//    }

    public int getFieldSize() {
        return fieldSize;
    }

    public void eraseField(){
        for (int i = 0; i < fieldSize; i++) {
            eraseLine(i);
            }
        }

    public void showField(){
        System.out.println();
        for (int i = 0; i < fieldSize; i++){
            showLine(i);
            System.out.println();
        }
        System.out.println();
    }

    private void eraseLine(int lineNumber){
        for (int i = 0; i < fieldSize; i++){
            field[i][lineNumber] = DEFAULT_CELL_VALUE;
        }
    }

    private void showLine(int lineNumber){
        for (int i = 0; i < fieldSize; i++){
            showCell(i, lineNumber);
        }
    }

    public void showCell(int x, int y){
        System.out.print("[" + field[x][y] + "]");
    }
}
