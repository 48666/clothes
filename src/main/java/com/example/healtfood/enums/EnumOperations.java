package com.example.healtfood.enums;

import com.example.healtfood.entity.User;

public class EnumOperations {
    private User user;
    private int count;

    public EnumOperations(User user, int count) {
        this.user = user;
        this.count = count;
    }
    public void setUserStatus(){
        if(count>-1){
            if(count==0){
                user.setUserType(UserType.NORMAL);
            }else if(count>0 && count<2){
                user.setUserType(UserType.SILVER);
            }else if(count>2 && count<3){
                user.setUserType(UserType.GOLD);
            }else {
                user.setUserType(UserType.PREMIUM);
            }
        }
    }
}
