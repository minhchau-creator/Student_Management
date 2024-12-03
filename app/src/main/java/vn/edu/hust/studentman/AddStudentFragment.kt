package vn.edu.hust.studentman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Button
import androidx.navigation.fragment.findNavController

class AddStudentFragment : Fragment() {

    private lateinit var etName: EditText
    private lateinit var etMSSV: EditText
    private lateinit var btnAddStudent: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_student, container, false)

        etName = view.findViewById(R.id.et_name)
        etMSSV = view.findViewById(R.id.et_mssv)
        btnAddStudent = view.findViewById(R.id.btn_add_student)

        btnAddStudent.setOnClickListener {
            val name = etName.text.toString()
            val mssv = etMSSV.text.toString()

            if (name.isNotEmpty() && mssv.isNotEmpty()) {
                // Truyền dữ liệu hoặc lưu trữ tạm thời (thông qua ViewModel)
                findNavController().navigate(R.id.studentListFragment)
            }
        }

        return view
    }
}