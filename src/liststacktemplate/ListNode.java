/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liststacktemplate;

/**
 *
 * @author Paul
 */
public class ListNode<T> {

    /**
     * Create a new ListNode given a value.
     *
     * @param v
     */
    ListNode(T v, MyList ownedby, int index, ListNode previous) {
setValue(v);
setOwnedBy(ownedby);
setIndex(index);
if(previous!=null){
previous.setPointer(this);
}
    }

    private int index;
    private ListNode pointer;
    private T value;
    private MyList ownedBy;

    /**
     * return the value being held by this Node.
     *
     * @return
     */
    public T getValue() {
        return this.value;
    }
    public void setValue(T v){
    this.value=v;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ListNode getPointer() {
        return pointer;
    }

    public void setPointer(ListNode pointer) {
        this.pointer = pointer;
    }

    public MyList getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(MyList ownedBy) {
        this.ownedBy = ownedBy;
    }
}
