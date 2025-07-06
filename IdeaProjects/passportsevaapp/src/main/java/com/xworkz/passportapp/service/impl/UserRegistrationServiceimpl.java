package com.xworkz.passportapp.service.impl;

import com.xworkz.passportapp.dto.UserRegistrationDto;
import com.xworkz.passportapp.repo.UserRegistrationRepository;
import com.xworkz.passportapp.repo.impl.UserRigistrationRepositoryImpl;
import com.xworkz.passportapp.service.UserRegistrationService;

public class UserRegistrationServiceimpl implements UserRegistrationService {
    UserRegistrationRepository userRegistrationRepository;
    public UserRegistrationServiceimpl(){
           userRegistrationRepository=new UserRigistrationRepositoryImpl();
    }
    public boolean validateUser(UserRegistrationDto dto){


        boolean isUserValid=false;
        boolean isRegisterAt=false;
        boolean isPassportOffice=false;
        boolean isGivenName=false;
        boolean isSurName=false;
        boolean isDob=false;
        boolean isEmail=false;
        boolean isSameEmail=false;
        boolean isLoginId=false;
        boolean isPassword=false;
        boolean isConfirmPassword=false;
        boolean isHintQuetion=false;
        boolean isHintAnswer=false;


        if(!dto.getRegisterAt().isEmpty()&&dto.getRegisterAt()!=null)
            isRegisterAt=true;

        System.out.println(isRegisterAt);
        if(dto.getPassportOffice()!=null && !dto.getPassportOffice().isEmpty())
            isPassportOffice=true;

        System.out.println(isPassportOffice);
         if(dto.getGivenName()!=null&&!dto.getGivenName().isEmpty())
            isGivenName=true;
        System.out.println();

        if(dto.getSurName()!=null&&!dto.getSurName().isEmpty())
            isSurName=true;

        if(dto.getDob()!=null&&!dto.getDob().isEmpty())
            isDob=true;

        if(dto.getEmail()!=null&&!dto.getEmail().isEmpty())
            isEmail=true;

         if(dto.getSameEmail()!=null&&!dto.getSameEmail().isEmpty())
            isSameEmail=true;

        if(dto.getLoginId()!=null && !dto.getLoginId().isEmpty())
            isLoginId=true;

         if(dto.getPassword()!=null&&!dto.getPassword().isEmpty())
            isPassword=true;

         if(dto.getConfirmPassword()!=null&&!dto.getConfirmPassword().isEmpty())
            isConfirmPassword=true;

         if(dto.getHintQuestion()!=null && !dto.getHintQuestion().isEmpty())
            isHintQuetion=true;

        if(dto.getHintAnswer()!=null&&!dto.getHintAnswer().isEmpty())
            isHintAnswer=true;

         if(isRegisterAt && isPassportOffice&&isGivenName&&isSurName&&isDob&&isEmail&&isSameEmail&& isLoginId&&isPassword&&isConfirmPassword&&isHintQuetion&&isHintAnswer) {
             System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhh");
             isUserValid = userRegistrationRepository.saveUser(dto);
         }



        return isUserValid;



    }
}
