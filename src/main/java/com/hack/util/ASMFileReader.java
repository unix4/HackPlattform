package com.hack.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ASMFileReader {

    private final static String ASM_FILE_EXTENSION = ".asm";

    public List<String> readFile(final String hackFile) throws IOException {
        final List<String> instructions = new ArrayList<>();
        if(hackFile.endsWith(ASM_FILE_EXTENSION)) {
            return instructions;
        }
        throw new IOException(String.format("File extension %s is only supported", ASM_FILE_EXTENSION));
    }
}
