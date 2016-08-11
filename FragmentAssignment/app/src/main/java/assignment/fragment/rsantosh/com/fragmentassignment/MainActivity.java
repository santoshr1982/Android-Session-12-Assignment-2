package assignment.fragment.rsantosh.com.fragmentassignment;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import assignment.fragment.rsantosh.com.fragmentassignment.SimpleAddition;

public class MainActivity extends AppCompatActivity implements MessagePasser, View.OnClickListener {

    private EditText mEditAccept;
    private Button mSubmit;
    MessagePasser mMessagePasser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditAccept = (EditText) findViewById(R.id.accept_number);
        mSubmit = (Button) findViewById(R.id.submit);
        mSubmit.setOnClickListener(this);
    }

    @Override
    public void passNumber(String num) {

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragment, new SimpleAddition()).commit();
        SimpleAddition simpleAddition = (SimpleAddition) getFragmentManager().findFragmentById(R.id.fragment);

        simpleAddition.setNumber(num);

    }

    @Override
    public void onClick(View view) {

        String strNum = (mEditAccept.getText().toString());

        if (strNum.isEmpty()){

            Toast.makeText(getApplicationContext(),"Please enter a numeric value.",Toast.LENGTH_SHORT).show();

        }else{


            passNumber((mEditAccept.getText().toString()));

        }
    }
}
