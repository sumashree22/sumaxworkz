package com.xworkz.inheritance.repository;

public class GitHubrepoRunner {
    public static void main(String[] args) {

        CodeRepository parent = new CodeRepository();
        parent.methodOne();
        parent.methodTwo();
        parent.methodThree();
        parent.methodFour();
        parent.methodFive();

        CodeRepository parentRef = new GitHubrepo();
        parentRef.methodOne();
        parentRef.methodTwo();
        parentRef.methodThree();
        parentRef.methodFour();
        parentRef.methodFive();

        GitHubrepo child = new GitHubrepo();
        child.methodOne();
        child.methodTwo();
        child.childMethodOne();
        child.childMethodTwo();
        child.childMethodThree();
    }
}
