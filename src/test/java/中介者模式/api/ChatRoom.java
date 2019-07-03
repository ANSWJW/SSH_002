package 中介者模式.api;

import 中介者模式.User;

import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user , String message){
        System.out.println(new Date().toString() +" [ "+user.getName()+" ] : "+message);
    }

}
