package com.example.vizz.university_miniproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {
    ArrayList<Student> arrayList;
    CustomAdapter customAdapter;
   // ListView listView;
    RecyclerView recyclerView;
    public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view=getLayoutInflater().inflate(R.layout.row,parent,false);
            ViewHolder viewHolder=new ViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.textView1.setText(arrayList.get(position).getNo());
            holder.textView2.setText(arrayList.get(position).getName());
            holder.textView3.setText(arrayList.get(position).getEmail());
            holder.textView4.setText(arrayList.get(position).getMobile());
            holder.textView5.setText(arrayList.get(position).getSubject());
            holder.textView6.setText(arrayList.get(position).getDescription());

        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public TextView textView1,textView2,textView3,textView4,textView5,textView6;
            public ViewHolder(View itemView) {
                super(itemView);
                 textView1= (TextView) itemView.findViewById(R.id.textView1);
                 textView2= (TextView) itemView.findViewById(R.id.textView2);
                 textView3= (TextView) itemView.findViewById(R.id.textView3);
                 textView4= (TextView) itemView.findViewById(R.id.textView4);
                 textView5= (TextView) itemView.findViewById(R.id.textView5);
                 textView6= (TextView) itemView.findViewById(R.id.textView6);
            }
        }
    }



   /* public class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int i) {
            return arrayList.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView textView1,textView2,textView3,textView4,textView5,textView6;
            View view1=getLayoutInflater().inflate(R.layout.row,null);
            textView1= (TextView) view1.findViewById(R.id.textView1);
            textView2= (TextView) view1.findViewById(R.id.textView2);
            textView3= (TextView) view1.findViewById(R.id.textView3);
            textView4= (TextView) view1.findViewById(R.id.textView4);
            textView5= (TextView) view1.findViewById(R.id.textView5);
            textView6= (TextView) view1.findViewById(R.id.textView6);
            textView1.setText(arrayList.get(i).getNo());
            textView2.setText(arrayList.get(i).getName());
            textView3.setText(arrayList.get(i).getEmail());
            textView4.setText(arrayList.get(i).getMobile());
            textView5.setText(arrayList.get(i).getSubject());
            textView6.setText(arrayList.get(i).getDescription());
            return view1;
        }
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        DataBase dataBase=new DataBase(this);
        arrayList=dataBase.getArrayList();
        customAdapter=new CustomAdapter();
       // listView= (ListView) findViewById(R.id.listView1);
       // listView.setAdapter(customAdapter);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);
        recyclerView.setAdapter(customAdapter);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
