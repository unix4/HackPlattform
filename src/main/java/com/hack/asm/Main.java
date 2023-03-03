package com.hack.asm;

import com.hack.util.ASMFileReader;

public class Main {
    public static void main(String[] args) throws Exception{
        ASMFileReader fileReader = new ASMFileReader();
        fileReader.readFile("myfile.asm");

    }
}