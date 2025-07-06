package com.xworkz.polymorphism.vscode;

public class VscodeRunner {
    public static void main(String[] args) {
        System.out.println("--- Vscode ---");
        Vscode base = new Vscode();
        base.start();
        base.configure();
        base.execute();
        base.stop();

        System.out.println("\n--- Vscode as EditorTheme ---");
        Vscode base1 = new EditorTheme();
        base1.start();
        base1.configure();
        base1.execute();
        base1.stop();

        System.out.println("\n--- EditorTheme ---");
        EditorTheme child = new EditorTheme();
        child.start();
        child.configure();
        child.execute();
        child.stop();
    }
}
