package com.example.android.firebaseauthsample;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class BaseActivity extends AppCompatActivity {



    //TODO create firebaseAuth object
    FirebaseAuth mAuth;
    ProgressDialog progressDialogd ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Firebase Auth instance
         */
        mAuth = FirebaseAuth.getInstance();


        /**
         * Progress dialog
         */
        progressDialogd = new ProgressDialog(this);


    }

    public  void showProgressDialog(String message){
        progressDialogd.setMessage(message);
        progressDialogd.setCancelable(false);
        progressDialogd.show();

    }

    public void hideProgresDialog(){
        progressDialogd.hide();
    }

    public  FirebaseAuth getFirebaseAuth(){
        return  mAuth;
    }


}
