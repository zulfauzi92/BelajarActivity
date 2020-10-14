package pens.lab.app.belajaractivity.modul.toDoList;

/**
 * Created by fahrul on 13/03/19.
 */

public class ToDoListPresenter implements ToDoListContract.Presenter{
    private final ToDoListContract.View view;


    public ToDoListPresenter(ToDoListContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}


}
