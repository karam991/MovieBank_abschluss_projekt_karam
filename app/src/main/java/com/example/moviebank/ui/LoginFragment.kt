package com.example.moviebank.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.moviebank.R
import com.example.moviebank.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var email = "123@123.de"
        var password = "123"
        //findNavController().navigate(LoginFragmentD)
        binding.btnLogin.setOnClickListener{
            // muss noch überprüft werden ob die eingegebene daten richtig sind.
            var loginEmail = binding.etUsername.text.toString()
            var loginPassword = binding.etPassword.text.toString()
            if (loginEmail == email && loginPassword == password){



                //findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToContactsFragment())
            }



        }
    }



}