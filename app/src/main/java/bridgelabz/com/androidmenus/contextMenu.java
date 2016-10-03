package bridgelabz.com.androidmenus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by bridgeit on 4/7/16.
 */
public class contextMenu extends AppCompatActivity {
    ListView listView1;
    String names[]={"Ajay","Sachin","Sumit","Tarun","Yogesh","Rahul","Suraj","Ravi","Saurav","Rakesh"
    ,"Rohit","Praful","Ramesh","Lakshman"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.context_menu);

        listView1=(ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(contextMenu.this,android.R.layout.simple_list_item_1,names);
        listView1.setAdapter(adapter);
        // Register the ListView  for Context menu
        registerForContextMenu(listView1);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select The Action");
        menu.add(0, v.getId(), 0, "Call");//groupId, itemId, order, title
        menu.add(0, v.getId(), 0, "SMS");
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getTitle()=="Call"){
            Toast.makeText(getApplicationContext(),"calling code",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="SMS"){
            Toast.makeText(getApplicationContext(),"sending sms code", Toast.LENGTH_LONG).show();
        }else{
            return false;
        }
        return true;
    }
}
