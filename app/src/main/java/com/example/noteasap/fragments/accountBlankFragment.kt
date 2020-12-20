package com.example.noteasap.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.noteasap.LoginActivity
import com.example.noteasap.R
import com.example.noteasap.UploadNotesActivity


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

private lateinit var account:CardView;
private lateinit var btnlog:Button;
private lateinit var uploadnotesframe:FrameLayout;
class accountBlankFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_account_blank, null);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        account=view.findViewById(R.id.ic_account)
        btnlog=view.findViewById(R.id.btnlog)
        uploadnotesframe=view.findViewById(R.id.uploadnotesframe)
        btnlog.setOnClickListener(){
            requireActivity().run{
                startActivity(Intent(this, LoginActivity::class.java))
            }
        }
        uploadnotesframe.setOnClickListener(){
            requireActivity().run{
                startActivity(Intent(this, UploadNotesActivity::class.java))
            }
        }
    }
    companion object {
        fun newInstance(param1: String, param2: String) =
            accountBlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}