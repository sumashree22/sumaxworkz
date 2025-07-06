package com.xworkz.polymorphism.vscode;

public class EditorTheme extends Vscode {
    @Override
    public void start() {
        System.out.println("EditorTheme: Custom start");
    }

    @Override
    public void configure() {
        System.out.println("EditorTheme: Custom configuration");
    }

    @Override
    public void execute() {
        System.out.println("EditorTheme: Custom execution");
    }

    @Override
    public void stop() {
        System.out.println("EditorTheme: Custom stop");
    }
}
