package org.gradle.poetry;

import java.lang.Object;
import java.lang.String;
import java.lang.System;
import java.util.ArrayList;

public class Poetry {


    public List<String> juliusCaesar() {
        List<String> lines = new ArrayList<>();
        lines.add("0, pardom me, thou");
        lines.add("That i am meek and gentle");
    }

    public  void emit(List<String> lines){
        for (String line : lines) {
            System.console().printf(line)
        }
    }

    public static void main(String[] args) {
        Poetry p = new Poetry();
        List<String> stringList = p.juliusCaesar();
        p.emit(stringList);
    }

}