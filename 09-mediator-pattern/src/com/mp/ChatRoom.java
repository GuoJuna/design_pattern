package com.mp;

/**
 * @author GuoJun
 * @desc
 * @since 2022/5/27 18:37
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(user.getName() + ": " + message);
    }
}
