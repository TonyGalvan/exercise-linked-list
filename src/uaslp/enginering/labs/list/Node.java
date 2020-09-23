package uaslp.enginering.labs.list;

import uaslp.enginering.labs.model.Student;

public class Node {
    //Atributos
    private Student student;
    private Node previous;
    private Node next;

    //Métodos
    public void setStudent(Student student){
        this.student=student;
    }

    public Student getStudent() {
        return null;
    }

    public void setPrevious(Node previous){
        this.previous=previous;
    }

    public Node getPrevious(){
        return null;
    }

    public void setNext(Node next){
        this.next=next;
    }

    public Node getNext(){
        return null;
    }

}
