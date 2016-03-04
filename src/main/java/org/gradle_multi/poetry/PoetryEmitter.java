package org.gradle_multi.poetry;

import org.gradle_multi.codec.Codec;

import java.util.List;

public class PoetryEmitter {
    Codec codec = new Codec();

    public void emit(List<String> lines) {
        for(String line : lines) {
            System.out.println(codec.encode(line));
        }
    }

    public static void main(String[] args) {
        PoetryEmitter pe = new PoetryEmitter();
        Poetry poetry = new Poetry();
        pe.emit(poetry.juliusCaesar());
    }
}
