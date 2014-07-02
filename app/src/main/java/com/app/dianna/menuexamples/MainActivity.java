package com.app.dianna.menuexamples;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
            // This method creates the menu on the app
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
            // Called when a menu item is selected
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
                // Handle action bar item clicks here. The action bar will
                // automatically handle clicks on the Home/Up button, so long
                // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
                // We check what menu item was clicked and show a Toast
        if (id == R.id.action_settings) {
/*              A DialogFragment is a Fragment you can place over top
                the current Activity. A Fragment is like an interface
                block that you can place into an Activity.
                The FragmentManager allows you to interact with the
                Fragment*/
            DialogFragment myFragment = new MyDialogFragment();
            myFragment.show(getFragmentManager(), "theDialog");
            return true;
                // If exit was clicked display an exit msg and close the app
        } else if (id == R.id.exit_the_app){
            Toast.makeText(this, "Exiting Application", Toast.LENGTH_SHORT).show();
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}