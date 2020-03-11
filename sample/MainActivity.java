package com.example.shankar.dialogcollapse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class DialogCollapse extends AppCompatActivity{
    private boolean table_flag = false;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.tablelayout);
        }

        public void collapseTable(View view) {
            TableLayout table = (TableLayout) findViewById(R.id.table);
            Button switchButton = (Button) findViewById(R.id.switchBtn);

            // setColumnCollapsed(int columnIndex, boolean isCollapsed)
            table.setColumnCollapsed(1, table_flag);
            table.setColumnCollapsed(2, table_flag);

            if (table_flag) {
                // Close
                table_flag = false;
                switchButton.setText("Click To Show");
            } else {
                // Open
                table_flag = true;
                switchButton.setText("Click To Hide ");
            }

        }
}