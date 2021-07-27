package com.LinkedList;

public class LinkNode {
    Node list, current;

    LinkNode()
    {
        this.list = null;
    }

    public void prepend(String data){
        Node temp = new Node(data);
        temp.next = this.list;
        this.list = temp;
    }

    public void append(String data){
        Node temp = new Node(data);

        if(this.list==null)
        {
            this.list = temp;
            this.current = list;
        }else
        {
            Node back = this.current;
            this.current.next = temp;
            this.current = temp;
        }
    }

    public String toString(){
        String result = "";
        Node current = list;

        while(current != null){
            result += current.data + "\n";
            current = current.next;
        }
        return result;
    }

}
