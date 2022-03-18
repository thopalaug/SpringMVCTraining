package org.example.controller;

import org.example.model.TodoData;
import org.example.model.TodoItem;
import org.example.service.TodoItemService;
import org.example.util.AttributeNames;
import org.example.util.Mappings;
import org.example.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoItemController {

    //-- Fields --
    private final TodoItemService todoItemService;

    // -- Constructor --
    @Autowired
    public TodoItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    // -- Model Attributes --
    @ModelAttribute
    public TodoData todoData(){
        return todoItemService.getData();
    }

    // -- Handler Methods --
    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }

    // Bruker ikke en egen view fordi den redirecter tilbake til items.
    @PostMapping(Mappings.ADD_ITEM)
    public String processItem(@ModelAttribute(AttributeNames.TODO_ITEM) TodoItem todoItem){
        return "redirect:/" + Mappings.ITEMS;
    }

}
