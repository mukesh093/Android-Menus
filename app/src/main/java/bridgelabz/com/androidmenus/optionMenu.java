package bridgelabz.com.androidmenus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by bridgeit on 4/7/16.
 */
public class optionMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);//Menu Resource, Menu
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Item 1 Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "Item 2 Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "Item 3 Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item4:
                Toast.makeText(this, "Item 4 Selected", Toast.LENGTH_LONG).show();
            case R.id.item5:
                Toast.makeText(this, "Item 5 Selected", Toast.LENGTH_LONG).show();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
