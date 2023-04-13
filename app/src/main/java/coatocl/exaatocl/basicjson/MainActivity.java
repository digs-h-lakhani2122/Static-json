package coatocl.exaatocl.basicjson;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    TextView name,mobile;
    String JSON_STRING = "{\"employee\":{\"name\":\"DIGAL\",\"number\":\"1234556\"}}";
    String eName,eMobile;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        mobile = findViewById(R.id.mobile);

        try {
            JSONObject jsnObj = new JSONObject(JSON_STRING);
            JSONObject xyz= jsnObj.getJSONObject("employee");

            eName = xyz.getString("name");
            eMobile = xyz.getString("number");

            name.setText("NAME :- "+eName);
            mobile.setText("MOBILE :- "+eMobile);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
