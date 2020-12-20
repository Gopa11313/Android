package com.example.noteasap

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private lateinit var sendbtn:Button;
class ForgetpasswordFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forgetpassword, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sendbtn=view.findViewById(R.id.sendbtn);
        sendbtn.setOnClickListener(){
            toast();
            nextact();//// yaha arko activity ko method ni use gaar haiii taw
        }
    }
    companion object {

        fun newInstance(param1: String, param2: String) =
            ForgetpasswordFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    @SuppressLint("WrongConstant")
    fun toast(){
        val toast = Toast.makeText(
                activity!!.applicationContext, "Please Check Your Email.", 4000
        )
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }
    fun nextact(){
        requireActivity().run{
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}