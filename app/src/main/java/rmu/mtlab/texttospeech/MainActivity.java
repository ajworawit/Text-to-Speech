package rmu.mtlab.texttospeech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText ms;
    private Button speech;
    private TextView showMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ms=(EditText)findViewById(R.id.edtText);
        speech=(Button)findViewById(R.id.btnSpeech);
        showMS=(TextView)findViewById(R.id.txtMS);

        speech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message=ms.getText().toString();
                if(message!=""){
                    showMS.setText(message);
                    MyTTS.getInstance(getApplicationContext()).speak(message);
                }

            }
        });


    }
}
