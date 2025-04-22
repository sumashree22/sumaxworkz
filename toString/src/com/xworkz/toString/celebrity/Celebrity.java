package com.xworkz.toString.celebrity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Celebrity {
    private String name;
    private int age;
    private String profession;
    private int awardsWon;
    private boolean isActive;
    private String nationality;
    private double netWorth;

    // Display method
    @Override
    public String toString(){
        return "Celebrity: \nName="+ this.name+""+ "\nAge="+ this.age+""+"\nprofession="+this.profession+""+"\nAwards Won="+this.awardsWon+""+"\nIs Active="+this.isActive+""+"\nNationality="+this.nationality+""+"\nNet Worth="+this.netWorth+"";
    }
}
