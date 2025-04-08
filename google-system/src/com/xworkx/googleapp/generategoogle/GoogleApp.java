package com.xworkx.googleapp.generategoogle;

import com.xworkx.googleapp.googledto.GoogleDto;

public class GoogleApp {
    GoogleDto dto;
    public void UserRegisterd(GoogleDto googleDto){

        boolean isValid=validateUser(googleDto);
        boolean isvalid=false;
        if(isValid){
            isvalid=true;
            dto=googleDto;
        }
        else{
            System.out.println("registration fails");
        }





    }
    public boolean validateUser(GoogleDto googleDto){
        boolean isvalid=false;
        boolean isUserNamevalid=false;
        boolean isPhoneNumbervalid=false;
        boolean isAdressValid=false;
        boolean isPasswardValid=false;
        boolean isconfirmPasswordvalid=false;
        if(googleDto.getUserName()!=null&&!googleDto.getUserName().isEmpty())
            isUserNamevalid=true;
        else
            System.out.println("invalid user name.please try again later");
        if(googleDto.getPhoneNumber()!=null&&!googleDto.getPhoneNumber().isEmpty())
            isPhoneNumbervalid=true;
        else
            System.out.println("invalid phone number please try again later");
        if(googleDto.getAddress()!=null&&!googleDto.getAddress().isEmpty())
            isAdressValid=true;
        else
            System.out.println("invalid adress please enter valid value");
        if(googleDto.getPassword()!=null&&!googleDto.getPassword().isEmpty())
            isPasswardValid=true;
        else
            System.out.println("invalid password");
        if(googleDto.getPassword().equals(googleDto.getConfirmPassword()))
            isconfirmPasswordvalid=true;
        else
            System.out.println("current password is not matching with previous one");
        if(isUserNamevalid&&isPhoneNumbervalid&&isAdressValid&&isPasswardValid&&isconfirmPasswordvalid)
            isvalid=true;

return isvalid;
    }
    public  void fetcDetails(){
        System.out.println("User name is :"+dto.getUserName());
        System.out.println("User phone number is :"+dto.getPhoneNumber());
        System.out.println("user address is :"+dto.getAddress());
        System.out.println("user password is:"+dto.getPassword());

    }
}