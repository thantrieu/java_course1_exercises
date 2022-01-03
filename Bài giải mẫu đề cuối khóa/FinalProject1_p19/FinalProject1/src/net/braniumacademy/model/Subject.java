package net.braniumacademy.model;

import java.io.Serializable;

/**
 *
 * @author braniumacademy <braniumacademy.net>
 */
public class Subject implements Serializable {

    private int id;
    private static int sId = 100000;
    private String name;
    private String kind;
    private int numOfLesson;

    public Subject() {
        id = sId++;
    }

    public Subject(int id) {
        this.id = id;
    }

    public Subject(String name, String kind, int numOfLesson) {
        this();
        this.name = name;
        this.kind = kind;
        this.numOfLesson = numOfLesson;
    }

    public Subject(int id, String name, String kind, int numOfLesson) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.numOfLesson = numOfLesson;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getsId() {
        return sId;
    }

    public static void setsId(int sId) {
        Subject.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getNumOfLesson() {
        return numOfLesson;
    }

    public void setNumOfLesson(int numOfLesson) {
        this.numOfLesson = numOfLesson;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Subject other = (Subject) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Subject{" + "id=" + id + ", name=" + name
                + ", kind=" + kind + ", numOfLesson=" + numOfLesson + '}';
    }
}
