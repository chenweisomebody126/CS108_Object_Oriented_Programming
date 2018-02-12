package edu.stanford.cs108.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add2ShoppingList(View view) {
        EditText item = (EditText) findViewById(R.id.editText);
        TextView shoppingList = (TextView) findViewById((R.id.textView));
        shoppingList.append(item.getText().toString()+"\n");
        item.setText("");
    }
    public void clearShoppingList(View view){
        TextView shoppingList = (TextView) findViewById((R.id.textView));
        shoppingList.setText("");
    }
}
