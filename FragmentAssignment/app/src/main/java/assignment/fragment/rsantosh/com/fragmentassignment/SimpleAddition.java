package assignment.fragment.rsantosh.com.fragmentassignment;


import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import assignment.fragment.rsantosh.com.fragmentassignment.MessagePasser;
import assignment.fragment.rsantosh.com.fragmentassignment.R;

public class SimpleAddition extends Fragment {

    private EditText mDisplayText;
    MessagePasser mMessagePasser;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_simple_addition,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mDisplayText = (EditText) getActivity().findViewById(R.id.display_number);

    }

    public void setNumber(String number) {

            DisplayNum(number);

    }

    private void DisplayNum(String number) {

        mDisplayText.setText(number);

    }
}
