package vn.edu.hust.studentman

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.BaseAdapter

class StudentAdapter(
  private val context: Context,
  private val students: List<StudentModel>
) : BaseAdapter() {

  override fun getCount(): Int = students.size

  override fun getItem(position: Int): Any = students[position]

  override fun getItemId(position: Int): Long = position.toLong()

  override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
    val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.layout_student_item, parent, false)

    val student = students[position]

    // Gán dữ liệu cho các thành phần trong layout_student_item.xml
    val nameTextView: TextView = view.findViewById(R.id.text_student_name)
    val idTextView: TextView = view.findViewById(R.id.text_student_id)

    nameTextView.text = student.studentName
    idTextView.text = student.studentId

    return view
  }
}
