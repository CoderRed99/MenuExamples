package com.app.dianna.menuexamples;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by dianna on 6/30/14.
 */
                   // This will be used to create a dialog window
public class MyDialogFragment extends DialogFragment {
/*                  To generate the onCreateDialog() right click on DialogFragment and Generate and
                    select onCreateDialog()*/
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
                // getActivity() returns the Activity this Fragment is associated with
        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());

        theDialog.setTitle("Sample Dialog");

        theDialog.setMessage("Hello I'm a Dialog");
                // Add text for user clicking on OK (for a positive button)
        theDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Clicked OK", Toast.LENGTH_SHORT ).show();
            }
        });
                // Add text for user clicking on CANCEL (for a negative button)
        theDialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Clicked CANCEL", Toast.LENGTH_SHORT ).show();
            }
        });
            // Returns the created dialog
        return theDialog.create();
            // REPLACED with custom dialog: return super.onCreateDialog(savedInstanceState);
    }
}
