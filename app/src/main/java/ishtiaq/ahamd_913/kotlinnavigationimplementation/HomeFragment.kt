package ishtiaq.ahamd_913.kotlinnavigationimplementation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController();

        btn_view_balance.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToViewBalanceFragment()
            navController.navigate(action)
        }

        btn_view_transaction.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToViewTransactionsFragment()
            navController.navigate(action)
        }

        btn_send_money.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToChooseReceiverFragment()
            navController.navigate(action)
        }
    }
}