package com.chuwa.pattern.builder.demo2;

public class Phone {

    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;

    //private constructor
    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainBoard = builder.mainBoard;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                '}';
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainBoard;

        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder screen(String screen){
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory){
            this.memory = memory;
            return this;
        }

        public Builder mainBoard(String mainBoard){
            this.mainBoard = mainBoard;
            return this;
        }

        // create a Phone Object by Innerclass method build(), since Phone has private constructor
        // so the good thing about this Innerclass is that it can access outerclass private method
        public Phone build() {
            return new Phone(this);
        }

    }
}
