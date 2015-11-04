package edu.umkc.cs5573.cyborgp2p;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import edu.umkc.cs5573.isa.UserInfo;

public class MyInfoActivity extends AppCompatActivity {
    EditText editSso;
    EditText editType;
    EditText editName;
    EditText editOrganization;
    EditText editEmail;
    EditText editPhoneNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_info);
        editSso = (EditText)findViewById(R.id.editSso);
        editType = (EditText)findViewById(R.id.editType);
        editName = (EditText)findViewById(R.id.editName);
        editOrganization = (EditText)findViewById(R.id.editOrganization);
        editEmail = (EditText)findViewById(R.id.editEmail);
        editPhoneNumber = (EditText)findViewById(R.id.editPhoneNumber);
    }

    public void onSetMyInfoClicked(View view){
        String sso;
        int type;
        String name;
        String organization;
        String email;
        String phoneNumber;
        MyPreference.setMyInfo(this, sso, type, name, organization, email, phoneNumber);
    }

    public void onCancelClicked(View view){
        finish();
    }

    public int getType(String type){
        if("Student".equals(type)){
            return UserInfo.TYPE_STUDENT;
        }else if("Employee".equals(type)){
            return UserInfo.TYPE_EMPLOYEE;
        }else{
            return UserInfo.TYPE_EMPLOYEE;
        }
    }
}
