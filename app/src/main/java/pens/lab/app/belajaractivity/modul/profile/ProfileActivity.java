package pens.lab.app.belajaractivity.modul.profile;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import pens.lab.app.belajaractivity.R;
import pens.lab.app.belajaractivity.base.BaseFragmentHolderActivity;


public class ProfileActivity extends BaseFragmentHolderActivity {
    ProfileFragment profileFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

       // btBack.setVisibility(View.GONE);
        //btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        //ivIcon.setVisibility(View.VISIBLE);
        //Intent intent = getIntent();

        profileFragment = new ProfileFragment();
        setCurrentFragment(profileFragment, false);
//        String email = intent.getStringExtra("email");
//        String password = intent.getStringExtra("password");
//
//        TextView emailView = findViewById(R.id.email_view);
//        TextView passwordView = findViewById(R.id.password_view);
//
//        emailView.setText(email);
//        passwordView.setText(password);
    }



}
