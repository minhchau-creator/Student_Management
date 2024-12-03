package vn.edu.hust.studentman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment

class StudentListFragment : Fragment() {

    private val studentList = mutableListOf(
        StudentModel("Nguyen Van A", "12345"),
        StudentModel("Le Thi B", "67890"),
        StudentModel("Tran Van C", "54321")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_student_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listView: ListView = view.findViewById(R.id.student_list)

        // Sử dụng Custom Adapter
        val adapter = StudentAdapter(requireContext(), studentList)
        listView.adapter = adapter
    }
}
