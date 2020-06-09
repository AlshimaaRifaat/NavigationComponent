package com.example.navigationcomponent.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigationcomponent.R

class MainFragment : Fragment(),View.OnClickListener {

  /*  companion object {
        fun newInstance() = MainFragment()
    }*/


    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.view_transactions_btn).setOnClickListener(this)
        view.findViewById<Button>(R.id.send_money_btn).setOnClickListener(this)
        view.findViewById<Button>(R.id.view_balance_btn).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.view_transactions_btn -> navController!!.navigate(R.id.action_mainFragment_to_view_transaction)
            R.id.send_money_btn -> navController!!.navigate(R.id.action_mainFragment_to_chooseRecipientFragment)
            R.id.view_balance_btn -> navController!!.navigate(R.id.action_mainFragment_to_viewBalanceFragment)
        }
    }

}
