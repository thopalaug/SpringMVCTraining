package org.example.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TodoData {

    // -- Fields --
    private static int idValue = 1;

    private final List<TodoItem> items = new ArrayList<>();

    // -- Constructors --
    public TodoData() {

        // Test data, to have some data to play with
        addItems(new TodoItem("first", "first details", LocalDate.now()));
        addItems(new TodoItem("second", "second details", LocalDate.now()));
        addItems(new TodoItem("third", "third details", LocalDate.now()));
        addItems(new TodoItem("fourth", "fourth details", LocalDate.now()));

    }

    // -- Public Methods --
    public List<TodoItem> getItems(){
        return Collections.unmodifiableList(items);
    }

    public void addItems(@NonNull TodoItem item){
        item.setId(idValue);
        items.add(item);
        idValue++;
    }

    public void removeItem(int id){
        ListIterator<TodoItem> itemListIterator = items.listIterator();

        while(itemListIterator.hasNext()){
            TodoItem item = itemListIterator.next();

            if(item.getId() == id){
                itemListIterator.remove();
                break;
            }
        }
    }

    public TodoItem getItem(int id){
        for(TodoItem item : items){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }

    public void updateItem(@NonNull TodoItem itemToUpdate){
        ListIterator<TodoItem> itemListIterator = items.listIterator();

        while(itemListIterator.hasNext()){
            TodoItem item = itemListIterator.next();

            if(item.equals(itemToUpdate)){
                itemListIterator.set(itemToUpdate);
                break;
            }
        }
    }

}
