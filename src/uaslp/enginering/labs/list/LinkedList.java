package uaslp.enginering.labs.list;


import uaslp.enginering.labs.model.Student;

public class LinkedList {

    //Atributos
    private Node front;
    private Node tail;

    public enum InsertPosition {
        BEFORE,
        AFTER
    }


    //Métodos
    public void add(Student student) {

    }

    public void delete(Student student) {

    }

    public void delete(int index) {

    }

    public Iterator getIterator() {
        return null;
    }

    public int size() {
        return 0;
    }

    public Student getAt(int index) {
        return null;
    }

    public void insert(Student reference, Student newStudent, InsertPosition insertPosition) {

    }


    //Inner class
    public static class Iterator {

        public boolean hasNext() {
            return false;
        }

        public Student next() {
            return null;
        }
    }
}
