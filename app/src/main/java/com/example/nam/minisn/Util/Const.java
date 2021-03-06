package com.example.nam.minisn.Util;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.util.Log;
import android.widget.TextView;

import com.example.nam.minisn.Activity.LoginActivity;
import com.example.nam.minisn.R;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Nam on 2/19/2017.
 */

public class Const {
    //Const string

    public static final int NUMBER_PAGE_CONVERSATION = 10;
    public static final String DISPLAY_MESSAGE_ACTION = "display_action";

    public static final String FAIL = "fail";
    public static final String GENDER = "gender";
    public static final String KEY_JSON_MESSAGE = "package";
    public static final String ID = "id";


    public static final String STATUS = "status";
    public static final String SUCCESS = "success";
    public static final String TAG = "tag_nam";

    public static final String USERNAME_SEND = "username_send";

    //Key upload
    public static final String AVATAR = "avatar";
    public static final String PACKAGE = "package";
    public static final String PASSWORD = "password";
    public static final String CODE = "code";
    public static final String CONVERSATION_ID = "conversation_id";
    public static final String DATA = "data";
    public static final String LIST_USER = "list_user";
    public static final String MESSAGE = "message";
    public static final String NAME_CONVERSATION = "name_conversation";
    public static final String DISPLAY_NAME = "displayname";
    public static final String TOKEN = "token";
    public static final String USERNAME = "username";
    public static final String EMAIL = "email";
    public static final String BIRTH_DAY = "birthday";
    public static final String ID_USERNAME = "id_username";
    public static final String USE_ID = "use_id";
    public static final String ID_FRIEND = "id_friend";
    public static final String ID_USER_FRIEND = "id_userfriend";
    public static final String ID_RECEIVE = "id_receive";
    public static final String CODE_RESPONSE = "code_response";
    public static final String USERNAME_REQUEST = "username_request";
    public static final String ID_REQUEST = "id_request";
    public static final String PAGE = "page";
    public static final String TIME_POST = "time_post";
    public static final String KEY_NEW_STATUS = "time";
    public static final String STATUS_ID = "status_id";
    public static final String TYPE_LIKE = "type_like";
    public static final String NUMBER_LIKE = "number_like";
    public static final String NUMBER_COMMENT = "number_comment";
    public static final String COMMENT = "comment";
    public static final int STA_LIKE = 1;
    public static final int STA_UNLIKE = 2;

    //URL


//    public static final String URL = "http://www.namlv-hust.96.lt/ver1/";
//    public static final String IP_LOCAL = "192.168.137.1";
//    public static final String IP_LOCAL = "192.168.1.6";
    public static final String IP_LOCAL = "192.168.43.205";
    public static final String URL = "http://"+IP_LOCAL+":1010/ver1/";
    public static final String URL_LOGIN = URL + "user/login.php";
    public static final String URL_REGISTER = URL + "user/register.php";
    public static final String URL_GET_LIST_CONVERSATION = URL + "conversation/get_list_conversation.php";
    public static final String URL_GET_LIST_FRIEND = URL + "friend/get_list_friend.php";
    public static final String URL_UPLOAD_AVATAR = URL + "user/upload_avatar.php";
    public static final String URL_DOWNLOAD_AVATAR = URL + "user/download_avatar.php";
    public static final String URL_SEND_MESSAGE = URL + "conversation/send_message.php";
    public static final String URL_GET_REQUEST_FRIEND = URL + "friend/get_request_friend.php?";
    public static final String URL_GET_SIZE_CONVERSATION = URL + "conversation/get_size_conversation.php";
    public static final String URL_ADD_NEW_CONVERSATION = URL + "conversation/add_new_conversation.php";
    public static final String URL_SEND_REQUEST_FRIENS = URL + "friend/send_request_friend.php";
    public static final String URL_SEND_RESPONSE_FRIEND = URL + "friend/send_response_request_friend.php";
    public static final String URL_DELETE_FRIEND = URL + "friend/delete_friend.php";
    public static final String URL_SEARCH_FRIEND = URL + "friend/search_friend.php/";
    public static final String URL_GET_STATUS = URL + "status/get_status.php";
    public static final String URL_GET_NEW_STATUS = URL + "status/get_new_status.php";
    public static final String URL_ADD_STATUS = URL + "status/add_status.php";
    public static final String URL_LOGOUT = URL + "user/logout.php";
    public static final String URL_LIKE_STATUS = URL + "status/like_status.php";
    public static final String URL_GET_STATUS_FRIEND = URL + "status/get_friend_status.php";
    public static final String URL_GET_NEW_STATUS_FRIEND = URL + "status/get_new_status_friend.php";
    public static final String URL_GET_COMMENT = URL + "status/get_comment.php";
    public static final String URL_ADD_COMMENT = URL + "status/add_comment.php";

    public static final String KEY_SEARCH = "search";
    public static final String KEY_LAST_LOAD = "last_load";

    //Share preferen
    public static final String FCM_TOKEN = "fcm_token";
    public static final String SHARED_PREF_NAME = "Preferences";
    public static final int LOGIN = 1;
    public static final int NO_LOGIN = 2;
    public static final String IS_LOGIN = "login";

    //Code responce
    public static final int REQUEST_CODE_REGISTER = 100;
    public static final int CODE_OK = 101;
    public static final int CODE_FAIL = 102;
    public static final int CODE_ERROR = 100;
    public static final int CODE_EMAIL_EXIST = 103;
    public static final int CODE_USER_EXIST = 104;
    public static final int CODE_INVALID = 105;
    public static final int CODE_USER_NOT_EXIST = 106;

    public static final int CODE_ACCEPT = 301;
    public static final int CODE_CANCEL = 302;

    //Gender
    public static final int GENDER_UNKNOW = 300;
    public static final int GENDER_MAN = 301;
    public static final int GENDER_WOMAN = 302;

    //Message
    public static final int MESSAGE_SEND = 1;
    public static final int MESSAGE_RECEIVE = 0;

    //Type Json receive FCM
    public static final int TYPE_MESSAGE = 200;
    public static final int TYPE_REQUEST_FRIEND = 201;
    public static final int TYPE_RESPONSE_FRIEND = 202;


    public static final int ID_NOTIFICATION_MESSAGE = 1111;
    public static final int ID_NOTIFICATION_REQUEST = 1112;
    public static final int ID_NOTIFICATION_RESPONSE = 1113;

    //Database
    public static final String DB_CONVERSATION = "conversation";
    public static final String DB_DATA_CONVERSATION = "data_conversation";
    public static final String DB_FRIEND = "friend";
    public static final String DB_USERS = "users";
    public static final String DB_USERS_SAVE = "users_save";
    public static final String DB_REQUEST_FRIEND = "request_friend";
    public static final String DB_WAIT_RESPONSE = "wait_response";

    //    Key Sql
    public static final String SELECT = "select ";
    public static final String FROM = " from ";
    public static final String WHERE = " where ";
    public static final String UPDATE = "update ";
    public static final String SET = " set ";
    public static final String DELETE = "delete ";
    public static final String VALUES = " values ";
    public static final String INSERT = "insert into ";
    public static final String AND = " and ";
    public static final String ORDER_BY = " order by ";
    public static final String ASC = " asc ";
    public static final String DESC = " desc ";
    public static final String LIKE = " like ";
    public static final String LIMIT = " limit ";
//    public static final String OR = " or ";


    public static final String SAVE_COL2 = "use_username";
    public static final String SAVE_COL0 = "id";
    public static final String SAVE_COL1 = "use_id";
    public static final String SAVE_COL3 = "use_display_name";
    public static final String SAVE_COL4 = "use_gender";

//    public static final String USERS_COL0 = "use_id";
//    public static final String USERS_COL1 = "use_username";
//    public static final String USERS_COL2 = "use_displayname";
//    public static final String USERS_COL3 = "use_gender";

    public static final String FRIENDS_COL0 = "id";
    public static final String FRIENDS_COL1 = "fri_id";
    public static final String FRIENDS_COL2 = "fri_username";
    public static final String FRIENDS_COL3 = "fri_display";
    public static final String FRIENDS_COL4 = "use_id";
    public static final String FRIENDS_COL5 = "fri_gender";
    public static final String FRIENDS_COL6 = "id_conversation";
    public static final String FRIENDS_COL7 = "choose";

    public static final String DATA_CONVERSATION_COL0 = "id";
    public static final String DATA_CONVERSATION_COL1 = "id_conversation";
    public static final String DATA_CONVERSATION_COL2 = "id_send";
    public static final String DATA_CONVERSATION_COL3 = "message";
    public static final String DATA_CONVERSATION_COL4 = "time";
    public static final String DATA_CONVERSATION_COL5 = "use_id";

    public static final String CONVERSATION_COL0 = "id";
    public static final String CONVERSATION_COL1 = "name_conversation";
    public static final String CONVERSATION_COL2 = "id_conversation";
    public static final String CONVERSATION_COL3 = "last_message";
    public static final String CONVERSATION_COL4 = "time_last_message";
    public static final String CONVERSATION_COL5 = "use_id";
    public static final String CONVERSATION_COL6 = "is_new_message";
    public static final String CONVERSATION_COL7 = "size";
    public static final String CONVERSATION_COL8 = "choose";
    public static final String CONVERSATION_COL9 = "active";

    public static final String REQUEST_FRIEND_COL0 = "id";
    public static final String REQUEST_FRIEND_COL1 = "id_request";
    public static final String REQUEST_FRIEND_COL2 = "username_request";
    public static final String REQUEST_FRIEND_COL3 = "use_id";

    public static final String RESPONSE_COL0 = "id";
    public static final String RESPONSE_COL1 = "use_id";
    public static final String RESPONSE_COL2 = "id_request";
    public static final String RESPONSE_COL3 = "name_friend";


    public static final int TYPE_NEW_MESSAGE = 1;
    public static final int TYPE_DONT_NEW_MESSAGE = 0;

    public static final int TYPE_DONT_ACTIVE = 0;
    public static final int TYPE_ACTIVE = 1;


    public static final int CONVERSATION_TYPE_SINGLE = 0;
    public static final int CONVERSATION_TYPE_GROUP = 1;
    public static final int TYPE_CHOOSE = 1;
    public static final int TYPE_NO_CHOOSE = 0;


    public static final int TAB_CONVERSATION = 0;
    public static final int TAB_FRIENDS = 1;
    public static final int TAB_STATUS = 2;
    public static final int TAB_PERSONAL = 3;
    public static final int TAB_SIZE = 4;

    //method
    public static final void log(String message) {
        Log.d(Const.TAG, message);
    }

    //    public String getTimeNow(long time) {
////        String pattern = "yyyy/MM/dd, HH:mm:ss";
////        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
////        return dateFormat.format(new Date());
//        String result = new String();
//        long nowTime = System.currentTimeMillis();
//        if(nowTime - time < 60){
//            result = getRes
//        }
//
//        return result;
//    }
    public static String getStringTime(Context context, long time) {
//        String result = new String();
        long nowTime = System.currentTimeMillis() / 1000;
        long temp = nowTime - time;
        if (temp < 60)
            return context.getResources().getString(R.string.now_time);
        else if (temp >= 60 && temp < 60 * 60)
            return String.valueOf(temp / 60) + " " + context.getResources().getString(R.string.time2);
        else if (temp >= 60 * 60 && temp < 60 * 60 * 24)
            return String.valueOf(temp / (60 * 60)) + " " + context.getResources().getString(R.string.time3);
        else if (temp >= 60 * 60 * 24 && temp < 60 * 60 * 24 * 7)
            return String.valueOf(temp / (60 * 60 * 24)) + " " + context.getResources().getString(R.string.time4);
        else {
            String pattern = "dd/MM/yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
            return dateFormat.format(new Date(time * 1000));
        }

    }

}
