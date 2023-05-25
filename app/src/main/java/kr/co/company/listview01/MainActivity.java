package kr.co.company.listview01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] values = {"Apple","Apricot","Banana", "Blueberry", "Cherry", "Date", "Elderberry", "Fig", "Grape", "Honeydew",
                "Kiwi", "Lemon", "Mango", "Nectarine", "Orange", "Papaya", "Quince", "Raspberry",
                "Strawberry", "Tangerine", "Ugli fruit", "Watermelon", "Yuzu", "Zucchini", "Pineapple", "Guava",
                "Pear", "Plum", "Lychee", "Dragonfruit", "Coconut", "Blackberry", "Avocado", "Lime"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);

        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l , View v, int position, long id){
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
    }
}