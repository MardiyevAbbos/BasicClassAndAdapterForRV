package com.example.basicclassandadapterforrv.activity;

import androidx.appcompat.app.AppCompatActivity;

import com.example.basicclassandadapterforrv.R;
import com.example.basicclassandadapterforrv.model.Member;
import com.example.basicclassandadapterforrv.network.BaseServer;

import java.util.ArrayList;

public class BaseActivity extends AppCompatActivity implements BaseServer {

    protected ArrayList<Member> prepareMemberMainList() {
        ArrayList<Member> members = new ArrayList<>();
        for (int i = 1; i < 31; i++) {
            members.add(new Member(i + ") Michael", i + ") Jackson", R.drawable.michael));
        }
        return members;
    }


    protected ArrayList<Member> prepareMemberDetailsList() {
        ArrayList<Member> members = new ArrayList<>();
        for (int i = 1; i < 31; i++) {
            members.add(new Member(i + ") Michael", i + ") Jackson", R.drawable.michael1));
        }
        return members;
    }


    protected String getServer() {
        if (IS_TESTER) {
            return SERVER_DEVELOPMENT;
        } else {
            return SERVER_DEPLOYMENT;
        }
    }


    protected static boolean isEmpty(final String s) {
        // Null-safe, short-circuit evaluation.
        return s == null || s.trim().isEmpty();
    }


}
