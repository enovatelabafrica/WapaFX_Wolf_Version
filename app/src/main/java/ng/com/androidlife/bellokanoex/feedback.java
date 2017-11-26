package ng.com.androidlife.bellokanoex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class feedback extends AppCompatActivity {

    private EditText mail;
    private EditText subject;
    private EditText message;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        send = (Button) findViewById(R.id.send);
        mail = (EditText) findViewById(R.id.mail);
        subject = (EditText) findViewById(R.id.subject);

        ((Button) findViewById(R.id.send)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String Email = ((EditText)findViewById(R.id.mail)).getText().toString();
                String subject = ((EditText)findViewById(R.id.subject)).getText().toString();
                Intent mail = new Intent(Intent.ACTION_SEND);
                mail.putExtra(Intent.EXTRA_EMAIL,new String[]{"bellokanoex@gmail.com"});
                mail.putExtra(Intent.EXTRA_TEXT, subject);
                mail.setType("message/rfc822");
                startActivity(Intent.createChooser(mail, "Send email via:"));
            }
        });
    }
}
