package pens.lab.app.belajaractivity.modul.toDoList;

import pens.lab.app.belajaractivity.base.BaseFragmentHolderActivity;


public class ToDoListActivity extends BaseFragmentHolderActivity {
    ToDoListFragment toDoListFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        toDoListFragment = new ToDoListFragment();
        setCurrentFragment(toDoListFragment, false);

    }



}
