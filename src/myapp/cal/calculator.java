package myapp.cal;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculator extends Activity {
	EditText first_no;
    EditText second_no;
    Button plusbutton;
    Button minusbutton;
    Button multiplebutton;
    Button devidebutton;
    TextView answer;	
	
    /** Called when the activity is first created. */
    @Override   
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Hello, Android fgfggf");
        setContentView(R.layout.main);
        
        first_no = (EditText) this.findViewById(R.id.firstNo);
        second_no = (EditText) this.findViewById(R.id.secondNo);
                
    }

    
    
    
    
}

