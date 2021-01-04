package com.getsoft.synchrsqlitemysql;

public class DbContract {

    // Declaration des objets
    public static final int SYNC_STATUS_OK = 0;
    public static final int SYNC_STATUS_FAILED = 1;
    //public static final String SERVER_URL = "http://192.168.43.167:8080/DemoSynchron/Utilisateur";
    public static final String SERVER_URL = "http://192.168.1.104/synDemo/synchron.php";
    public static final String UI_UPDATE_BROADCAST = "com.getsoft.synchrsqlitemysql.uiupdatebroadcast";

    public static final String DATABASE_NAME = "db_synchron";
    public static final String TABLE_NAME = "t_users";
    public static final String NAME = "name";
    public static final String SYNC_STATUS = "syncstatus";

}
