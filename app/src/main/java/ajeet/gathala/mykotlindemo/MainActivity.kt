package ajeet.gathala.mykotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_btn.setOnClickListener {
            Toast.makeText(this,"User ID is:- "+user_name.editText.toString()+"\nPWD id:- "+password.editText.toString(),Toast.LENGTH_LONG).show();
        }
    }
}
