package vn.edu.hust.studentman

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AddStudentActivity : Activity() {

    private lateinit var nameEditText: EditText
    private lateinit var mssvEditText: EditText
    private lateinit var addButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_student)

        // Khởi tạo các view
        nameEditText = findViewById(R.id.edit_student_name)
        mssvEditText = findViewById(R.id.edit_student_id)
        addButton = findViewById(R.id.btn_save)

        // Set sự kiện click cho nút thêm
        addButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val mssv = mssvEditText.text.toString()

            // Kiểm tra dữ liệu có hợp lệ không
            if (name.isNotEmpty() && mssv.isNotEmpty()) {
                val resultIntent = Intent()
                resultIntent.putExtra("student_name", name)
                resultIntent.putExtra("student_mssv", mssv)

                setResult(RESULT_OK, resultIntent)
                finish()
            } else {
                Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
