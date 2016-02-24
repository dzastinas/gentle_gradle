package org.gradle.poetry;

import java.lang.String;
import java.lang.System;
import java.util.ArrayList;
import org.apache.commons.codec.binary.Base64;

import java.util.Arrays;
import java.util.List;

public class Poetry {


    public List<String> juliusCaesar() {
        List<String> lines = new ArrayList<String>();
        lines.add("!!O, pardon me, thou bleeding piece of earth,");
        lines.add("That I am meek and gentle with these butchers!");
        lines.add("Thou art the ruins of the noblest man");
        lines.add("That ever livèd in the tide of times.");
        lines.add("Woe to the hand that shed this costly blood!");
        lines.add("  Over thy wounds now do I prophesy—");
        lines.add("Which, like dumb mouths, do ope their ruby lips");
        lines.add("To beg the voice and utterance of my tongue—");
        lines.add("A curse shall light upon the limbs of men.");
        return lines;
    }

    public void emit(List<String> lines) {
        for (String line : lines) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Poetry p = new Poetry();
        List<String> stringList = p.juliusCaesar();
        p.emit(stringList);
    }

    public static String encode (String text){
        Base64 codec = new Base64();
        byte[] base64 = codec.encode(text.getBytes());
        return Arrays.toString(base64);
    }

}