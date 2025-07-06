package com.xworkz.toString.Artist;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Artist {
    private String name;
    private int age;
    private String style;
    private int yearsActive;
    private String[] notableWorks;
    private String country;

    @Override
    public String toString() {
        return "Artist Details:\n" +
                "Name = " + this.name + "\n" +
                "Age = " + this.age + "\n" +
                "Art Style = " + this.style + "\n" +
                "Years Active = " + this.yearsActive + "\n" +
                "Notable Works = " + String.join(", ", this.notableWorks) + "\n" +
                "Country = " + this.country;
    }
}

