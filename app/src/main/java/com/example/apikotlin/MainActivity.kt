import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.apikotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun submit_btn(view: View) {
        val namaEditText = findViewById<EditText>(R.id.nama_edit_text)
        val nama = namaEditText.text.toString()
        val toast = Toast.makeText(applicationContext, nama, Toast.LENGTH_SHORT)
        toast.show()
        AlertDialog.Builder(this)
            .setIcon(R.mipmap.ic_launcher)
            .setTitle("Hai Cantik")
            .setMessage("I Love You")
            .setPositiveButton("OK",
                DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(
                        this@MainActivity,
                        "Kamu memilih OK",
                        Toast.LENGTH_SHORT
                    ).show()
                })
            .setNegativeButton("Cancel",
                DialogInterface.OnClickListener { dialog, which ->
                    Toast.makeText(
                        this@MainActivity,
                        "Kamu memilih Cancel",
                        Toast.LENGTH_SHORT
                    ).show()
                })
            .show()
    }
}
