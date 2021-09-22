package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //vals used for edit text
        val usernameET = findViewById<EditText>(R.id.usernameET)
        val emailET = findViewById<EditText>(R.id.emailET)
        val passET = findViewById<EditText>(R.id.passET)
        val confirmPassET = findViewById<EditText>(R.id.confirmPassET)
        val rButton = findViewById<Button>(R.id.registerButton)

        //vars used for field text
        var username: String
        var email: String
        var pass: String
        var confirmPass: String
        var confirmation = true;

        //Sets actions for the button
        findViewById<Button>(R.id.registerButton).setOnClickListener {
            if (emailET.text.toString().equals("", true)) {
                emailET.error = ("Please enter a vaild email address")
            } else if (usernameET.text.toString().equals("", true)) {
                usernameET.error = ("Please enter a username")
            } else if (passET.text.toString().equals("", true)) {
                passET.error = ("Please enter a password")
            } else if (confirmPassET.text.toString().equals("", true)) {
                confirmPassET.error = ("Please confirm your password")
            } else if (!confirmPassET.text.toString().equals(passET.text.toString(), false)) {
                confirmPassET.error = ("Passwords do not match")
            } else {
                email = emailET.text.toString()
                username = usernameET.text.toString()
                pass = passET.text.toString()
                confirmPass = confirmPassET.text.toString()
                Toast.makeText(
                    this,
                    "Welcome $username, to the SignUpForm App",
                    Toast.LENGTH_LONG
                ).show()

            }

        }
    }
}
