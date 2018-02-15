package com.example.elsa.snowmore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private EditText mValueField;
    private Button mAddButton;
    private Firebase mRootRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create a database table for users
        mRootRef = new Firebase("https://tutorial-e51c5.firebaseio.com/Users");
        mValueField = (EditText) findViewById(R.id.editText);
        mAddButton = (Button) findViewById(R.id.button);

        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = mValueField.getText().toString();
                mRootRef.push().setValue(value);
            }
        });
    }


//    /** Called when the user taps the Send button */
//    public void sendMessage(View view) {
//        // intent constructor takes two parameters: context class and the class
//        // of the app component to which the system should deliver its intent
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        // The putExtra() method adds the EditText's value to the intent.
//        //An Intent can carry data types as key-value pairs called extras.
//        // Your key is a public constant EXTRA_MESSAGE because the next activity uses the key to
//        // retrieve the text value.
//        // It's a good practice to define keys for intent extras using your app's package name as a prefix.
//        // This ensures the keys are unique, in case your app interacts with other apps.
//        intent.putExtra(EXTRA_MESSAGE, message);
//        // The startActivity() method starts an instance of the DisplayMessageActivity specified by the Intent.
//        startActivity(intent);
//
//    }

}