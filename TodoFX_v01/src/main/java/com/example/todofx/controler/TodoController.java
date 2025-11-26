package com.example.todofx.controler;

import com.example.todofx.dao.TodoDAO;
import com.example.todofx.dao.TodoDummyDAO;
import com.example.todofx.model.State;
import com.example.todofx.model.Todo;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class TodoController {


    TodoDAO dao = new TodoDummyDAO();
    //------------SAVE------------
    @FXML
    private TextField taskField;

    @FXML
    private DatePicker deadlineField;

    //-------------TableView-------------

    @FXML
    private TableView<Todo> tableView;



    @FXML
    private TableColumn<Todo, LocalDate> deadlineCol;

    @FXML
    private TableColumn<Todo, State> stateCol;

    @FXML
    private TableColumn<Todo, String> taskCol;




    @FXML
    void onSave(ActionEvent event) {

    }

    @FXML
    void initialize(){
        System.out.println("init Controller");
        //tableView.getItems().add(new Todo(1,"einkazufen",LocalDate.now(),State.OPEN));
        taskCol.setCellValueFactory(new PropertyValueFactory<>("task"));
        deadlineCol.setCellValueFactory(new PropertyValueFactory<>("deadline"));
        stateCol.setCellValueFactory(new PropertyValueFactory<>("state"));

        tableView.getItems().setAll(dao.findAll());
    }

}
