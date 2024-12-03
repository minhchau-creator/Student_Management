package vn.edu.hust.studentman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

class EditStudentFragment : Fragment() {

    private lateinit var etName: EditText
    private lateinit var etMSSV: EditText
    private lateinit var btnSave: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_edit_student, container, false)

        etName = view.findViewById(R.id.et_name)
        etMSSV = view.findViewById(R.id.et_mssv)
        btnSave = view.findViewById(R.id.btn_save)

        // Lấy dữ liệu từ arguments (nếu có)
        val args = arguments
        val studentName = args?.getString("studentName")
        val studentMSSV = args?.getString("studentMSSV")

        etName.setText(studentName)
        etMSSV.setText(studentMSSV)

        btnSave.setOnClickListener {
            val updatedName = etName.text.toString()
            val updatedMSSV = etMSSV.text.toString()

            if (updatedName.isNotEmpty() && updatedMSSV.isNotEmpty()) {
                // Truyền dữ liệu đã chỉnh sửa trở về StudentListFragment
                // (Giả định bạn sử dụng ViewModel hoặc callback để cập nhật danh sách)
                findNavController().navigate(R.id.studentListFragment)
            }
        }

        return view
    }
}