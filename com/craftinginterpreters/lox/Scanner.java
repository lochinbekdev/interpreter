package com.craftinginterpreters.lox;

import java.util.ArrayList;
import java.util.List;

public class Scanner {
    private final String source;
    private final List<Token> tokens = new ArrayList<>();

    public Scanner(String source) {
        this.source = source;
    }

    public List<Token> scanTokens() {
        // Hozircha faqat 1 ta test token qaytaramiz
        tokens.add(new Token(TokenType.EOF, "", null, 1));
        return tokens;
    }

}
