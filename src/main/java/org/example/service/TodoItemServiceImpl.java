package org.example.service;

import lombok.Getter;
import org.example.model.TodoData;
import org.example.model.TodoItem;
import org.springframework.stereotype.Service;

@Service
public class TodoItemServiceImpl implements TodoItemService {

    @Getter
    private final TodoData data = new TodoData();

    @Override
    public void addItem(TodoItem todoItem) {
        data.addItems(todoItem);
    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(TodoItem todoitem) {
        data.updateItem(todoitem);
    }
}
