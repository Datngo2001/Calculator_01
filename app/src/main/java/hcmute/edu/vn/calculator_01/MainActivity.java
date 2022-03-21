package hcmute.edu.vn.calculator_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainTextView;
    AppCompatButton[] numberBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberBtn = new AppCompatButton[10];

        mainTextView = findViewById(R.id.mainText);

        AppCompatButton btn =(AppCompatButton) findViewById(R.id.btn0);
        btn.setOnClickListener(new numberClick());
        numberBtn[0] = btn;
        btn =(AppCompatButton) findViewById(R.id.btn1);
        btn.setOnClickListener(new numberClick());
        numberBtn[1] = btn;
        btn =(AppCompatButton) findViewById(R.id.btn2);
        btn.setOnClickListener(new numberClick());
        numberBtn[2] = btn;
        btn =(AppCompatButton) findViewById(R.id.btn3);
        btn.setOnClickListener(new numberClick());
        numberBtn[3] = btn;
        btn =(AppCompatButton) findViewById(R.id.btn4);
        btn.setOnClickListener(new numberClick());
        numberBtn[4] = btn;
        btn =(AppCompatButton) findViewById(R.id.btn5);
        btn.setOnClickListener(new numberClick());
        numberBtn[5] = btn;
        btn =(AppCompatButton) findViewById(R.id.btn6);
        btn.setOnClickListener(new numberClick());
        numberBtn[6] = btn;
        btn =(AppCompatButton) findViewById(R.id.btn7);
        btn.setOnClickListener(new numberClick());
        numberBtn[7] = btn;
        btn =(AppCompatButton) findViewById(R.id.btn8);
        btn.setOnClickListener(new numberClick());
        numberBtn[8] = btn;
        btn =(AppCompatButton) findViewById(R.id.btn9);
        btn.setOnClickListener(new numberClick());
        numberBtn[9] = btn;

        btn =(AppCompatButton) findViewById(R.id.btnC);
        btn.setOnClickListener(new clearClick());
    }

    private class numberClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Button btn = (Button) view;
            String btnText = btn.getText().toString();
            String text = mainTextView.getText().toString();
            text += btnText;
            mainTextView.setText(text);
        }
    }

    private class clearClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            mainTextView.setText("");
        }
    }
}