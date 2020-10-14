package pens.lab.app.belajaractivity.modul.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import pens.lab.app.belajaractivity.R;
import pens.lab.app.belajaractivity.base.BaseFragment;
import pens.lab.app.belajaractivity.modul.login.LoginActivity;
import pens.lab.app.belajaractivity.modul.login.LoginContract;
import pens.lab.app.belajaractivity.modul.login.LoginPresenter;
import pens.lab.app.belajaractivity.modul.toDoList.ToDoListActivity;


/**
 * Created by fahrul on 13/03/19.
 */

public class ProfileFragment extends BaseFragment<ProfileActivity, ProfileContract.Presenter> implements ProfileContract.View {

    public ProfileFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_profile, container, false);
        mPresenter = new ProfilePresenter(this);
        mPresenter.start();

        Intent intent = getActivity().getIntent();
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");

        TextView emailView = fragmentView.findViewById(R.id.email_view);
        TextView passwordView = fragmentView.findViewById(R.id.password_view);
        Button toDoListBtn = fragmentView.findViewById(R.id.btn_todolist);
        toDoListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBtnToDoListClick();
            }
        });

        emailView.setText("Email saya : " + email);
        passwordView.setText("Password saya : " + password);

        return fragmentView;
    }

    public void setBtnToDoListClick(){
        mPresenter.showToDoList();
    }

    @Override
    public void setPresenter(ProfileContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void redirectToDoList() {
        Intent intent = new Intent(activity, ToDoListActivity.class);
        startActivity(intent);
    }
}
