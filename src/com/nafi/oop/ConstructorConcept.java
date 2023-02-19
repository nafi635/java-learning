package com.nafi.oop;

public class ConstructorConcept {
    private int input;
    private int output;

    public ConstructorConcept(int input, int output) {
        setInput(input);
        setOutput(output);
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }
}
