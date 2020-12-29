package com.av.api;

import java.util.List;

public class MainApp {
    public static OderClient oderClient;

    public static void main(String[] args) {
//        oderClient= AppConfig.getService(OderClient.class);
//        Oders oders = oderClient.getOder(AppConfig.API);
//        System.out.println(oders.getMessage());
//        System.out.println(oders.isSuccess());
//        System.out.println(oders.getId());
//       CheckOrderResults checkOrderResults =oderClient.checkOder(30212623, AppConfig.API);
//
//
//        System.out.println("mes1: "+checkOrderResults.getMessage());
//        System.out.println(checkOrderResults.getSuccess());
//
//        System.out.println(checkOrderResults.getMessages().get(0).getMessage());
//        System.out.println(checkOrderResults.getPhoneNumber());
        String sb= null;
        int inde = 0;
        String mes ="<#> 200739 Verification Code from KakaoTalk. [KakaoTalk] iL5y9j8vHd2\n";
        for (int i = 0; i < mes.length(); i++) {
            if (48<=mes.charAt(i)&&mes.charAt(i)<=57) {
                inde+=1;
                if(inde>=6){
                    System.out.println(inde);
                    sb = mes.substring(i - 5, i+1);
                    System.out.println(sb);
                }
            }else inde=0;

        }
    }
}
