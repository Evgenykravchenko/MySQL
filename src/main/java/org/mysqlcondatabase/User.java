package org.mysqlcondatabase;

public class User {

    private int id;
    private String group;

    public User() {
    }

    public User (int id, String group) {
        this.id = id;
        this.group = group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(id: " + id
                + ", group: " + group
                + ")";
    }
}
