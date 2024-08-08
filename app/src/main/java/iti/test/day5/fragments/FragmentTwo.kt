package iti.test.day5.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import iti.test.day5.R


const val TAG_TWO = "Fragment two life cycle"

class FragmentTwo : Fragment() {
    override fun onAttach(context: Context) {
        Log.d(TAG_TWO, "onAttach: ")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG_TWO, "onCreate: ")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG_TWO, "onCreateView: ")
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG_TWO, "onViewCreated: ")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG_TWO, "onStart: ")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG_TWO, "onResume: ")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG_TWO, "onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG_TWO, "onStop: ")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(TAG_TWO, "onDestroyView: ")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(TAG_TWO, "onDestroy: ")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(TAG_TWO, "onDetach: ")
        super.onDetach()
    }
}