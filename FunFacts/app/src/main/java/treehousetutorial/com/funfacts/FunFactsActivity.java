package treehousetutorial.com.funfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {
    private FactBook factBook = new FactBook();
    // Declare our View variables
    private TextView factTextView;
    private Button showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the View from the layout file to the corresponding variables
        factTextView = (TextView) findViewById(R.id.factTextView);
        showFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener(){
          @Override
          public void onClick(View v) {
              String fact = factBook.getFact();

              // Update our screen with a new fact
              factTextView.setText(fact);
            }
          };

        showFactButton.setOnClickListener(listener);

    }
}
