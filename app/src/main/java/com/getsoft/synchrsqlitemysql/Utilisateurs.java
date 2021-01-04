package com.getsoft.synchrsqlitemysql;

public class Utilisateurs {

    // Declaration des objets
    private String Name;
    private int Sync_status;

    // Constructeur avec paramettres
    public Utilisateurs(String Name, int Sync_status) {
        this.setName(Name);
        this.setSync_status(Sync_status);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSync_status() {
        return Sync_status;
    }

    public void setSync_status(int sync_status) {
        Sync_status = sync_status;
    }
}
