package com.andrea.finalproyectott.dialogues


import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.andrea.finalproyectott.R
import com.andrea.finalproyectott.databinding.DialogProfileBinding
import com.andrea.finalproyectott.toast
import com.google.firebase.auth.FirebaseAuth


class ProfileDialog : DialogFragment() {

    private var _binding: DialogProfileBinding? = null
    // This property is only valid between onCreateDialog and
    // onDestroyView.
    private val binding get() = _binding!!
    //val vista = activity!!.layoutInflater.inflate(R.layout.dialog_profile,null)
    private var entry: EditText? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val view = requireActivity().layoutInflater.inflate(R.layout.dialog_profile,null)
        _binding = DialogProfileBinding.inflate(LayoutInflater.from(context))
        entry =  view.findViewById(R.id.editTextName);

        return AlertDialog.Builder(context!!)
            .setTitle("Recomendación del día")
            .setMessage("Hola")
            .setView(view)
            .setNegativeButton("Cerrar"){_,_->
                requireActivity().toast("Cancelado")
            }
            .create()
    }

}