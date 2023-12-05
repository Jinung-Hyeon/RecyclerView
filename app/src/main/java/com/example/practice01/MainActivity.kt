package com.example.practice01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv_board = findViewById<RecyclerView>(R.id.rv_board)


        val itemList = ArrayList<BoardItem>()

        itemList.add(BoardItem("13:00","월급 두배로 받는법","김XX"))
        itemList.add(BoardItem("11:00","학점 A+ 받는 법","이XX"))
        itemList.add(BoardItem("10:00","구글 면접 질문에 대답하는 법","박XX"))
        itemList.add(BoardItem("08:00","공부 잘하는 MBTI 순위","최XX"))

        val boardAdapter = BoardAdapter(itemList)
        boardAdapter.notifyDataSetChanged()

        rv_board.adapter = boardAdapter
        rv_board.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}