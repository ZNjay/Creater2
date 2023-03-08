package com.example.creater;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.lv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        ArrAdapter adapter = new ArrAdapter(this, init());
        recyclerView.setAdapter(adapter);
    }

    public List<AccountInfo> init() {
        List<AccountInfo> list = new ArrayList<>();

        List<AccountInfo.contentData> contents = new ArrayList<>();
        AccountInfo.contentData data = new AccountInfo.contentData("日程标题", "2023年1月完成述职汇报");
        contents.add(data);
        AccountInfo.contentData data1 = new AccountInfo.contentData("日程内容", "国内疫情反弹对11月份经济稳定恢复造成一定影响，消费、服务...");
        contents.add(data1);
        AccountInfo.contentData data2 = new AccountInfo.contentData("日程时间", "2055 / 02 / 10 18:39");
        contents.add(data2);
        AccountInfo accountInfo = new AccountInfo(1, false, "日程提醒", "「唐昕蕊」给您添加了一条日程，请及时查看", contents);
        list.add(accountInfo);

        AccountInfo accountInfo2 = new AccountInfo(1, true, "日程提醒", "「唐昕蕊」给您添加了一条日程，请及时查看", contents);
        list.add(accountInfo2);

        // 第二个数据模型
        List<AccountInfo.contentData> contents1 = new ArrayList<>();
        AccountInfo.contentData data3 = new AccountInfo.contentData("日程标题", "2023年1月完成述职汇报");
        contents1.add(data3);
        AccountInfo.contentData data5 = new AccountInfo.contentData("日程时间", "2055 / 02 / 10 18:39");
        contents1.add(data5);
        AccountInfo.contentData data4 = new AccountInfo.contentData("创建人", "唐昕蕊");
        contents1.add(data4);
        AccountInfo accountInfo1 = new AccountInfo(1, "日程即将开始", contents1);
        list.add(accountInfo1);

        AccountInfo accountInfo3 = new AccountInfo(1, true, "日程即将开始", "", contents1);
        list.add(accountInfo3);

//带三个
        AccountInfo accountInfo4 = new AccountInfo(2, false, "添加好友提醒", "「张文文」申请添加您为好友，请及时确认");
        list.add(accountInfo4);
        AccountInfo accountInfo5 = new AccountInfo(2, true, "添加好友提醒", "「张文文」申请添加您为好友，请及时确认");
        list.add(accountInfo5);

//        第四个
        List<AccountInfo.contentData> contents4 = new ArrayList<>();
        AccountInfo.contentData data13 = new AccountInfo.contentData("任务名称", "2023年1月完成述职汇报");
        contents4.add(data13);
        AccountInfo.contentData data14 = new AccountInfo.contentData("创建人", "唐昕蕊");
        contents4.add(data14);
        AccountInfo.contentData data15 = new AccountInfo.contentData("任务到达时间", "2055 / 02 / 10 18:39");
        contents4.add(data15);
        AccountInfo accountInfo6 = new AccountInfo(3, false,"任务逾期提醒：逾期2天", "", contents4);
        list.add(accountInfo6);

        AccountInfo accountInfo7 = new AccountInfo(3, true, "任务逾期提醒：逾期2天", "", contents4);
        list.add(accountInfo7);

        List<AccountInfo.contentData> contents6 = new ArrayList<>();
        AccountInfo.contentData datac = new AccountInfo.contentData("", "2023年1月完成述职汇报");
        contents6.add(datac);
        AccountInfo.contentData data19 = new AccountInfo.contentData("发布人", "何信峰");
        contents6.add(data19);
        AccountInfo.contentData data20 = new AccountInfo.contentData("发布时间", "2033 / 05 / 22 23:52");
        contents6.add(data20);
        AccountInfo accountInfo8 = new AccountInfo(4, false, "通知公告标题", "", contents6);
        list.add(accountInfo8);

        AccountInfo accountInfo9 = new AccountInfo(4, true, "通知公告标题", "", contents6);
        list.add(accountInfo9);

        List<AccountInfo.contentData> contents8 = new ArrayList<>();
        AccountInfo.contentData dataa = new AccountInfo.contentData("", "2023年1月完成述职汇报【取消通知】");
        contents8.add(dataa);
        AccountInfo accountInfo10 = new AccountInfo(4, false, "取消通知", "", contents8);
        list.add(accountInfo10);

        AccountInfo accountInfo11 = new AccountInfo(4, true, "取消通知", "", contents8);
        list.add(accountInfo11);

        List<AccountInfo.contentData> contents10 = new ArrayList<>();
        AccountInfo.contentData datae = new AccountInfo.contentData("", "2023年1月完成述职汇报");
        contents10.add(datae);
        AccountInfo.contentData data23 = new AccountInfo.contentData("发布时间", "2033 / 05 / 22 23:52");
        contents10.add(data23);
        AccountInfo accountInfo12 = new AccountInfo(4, false, "定时发布通知", "", contents10);
        list.add(accountInfo12);

        AccountInfo accountInfo13 = new AccountInfo(4, true, "定时发布通知", "", contents10);
        list.add(accountInfo13);


        List<AccountInfo.contentData> contents12 = new ArrayList<>();
        AccountInfo.contentData datag = new AccountInfo.contentData("", "2023年1月完成述职汇报");
        contents12.add(datag);
        AccountInfo.contentData data25 = new AccountInfo.contentData("将于 2033 / 05 / 22 23:52 发布", "");
        contents12.add(data25);
        AccountInfo accountInfo14 = new AccountInfo(4, false, "定时发布提醒", "", contents12);
        list.add(accountInfo14);

        AccountInfo accountInfo15 = new AccountInfo(4, true, "定时发布提醒", "", contents12);
        list.add(accountInfo15);

        List<AccountInfo.contentData> contents14 = new ArrayList<>();
        AccountInfo.contentData data27 = new AccountInfo.contentData("会议名称", "中华人民共和国国民经济和社会发展第十四个五年规划和2035年远景目标纲要");
        contents14.add(data27);
        AccountInfo.contentData data28 = new AccountInfo.contentData("会议时间", "2055 / 02 / 10 18:39");
        contents14.add(data28);
        AccountInfo.contentData data29 = new AccountInfo.contentData("会议地点", "山东省临沂市东港镇港下锡港东路12栋4单元2304室");
        contents14.add(data29);
        AccountInfo accountInfo16 = new AccountInfo(5, false, "邀请您参加会议", "", contents14);
        list.add(accountInfo16);

        AccountInfo accountInfo17 = new AccountInfo(5, true, "邀请您参加会议", "", contents14);
        list.add(accountInfo17);

        List<AccountInfo.contentData> contents17 = new ArrayList<>();
        AccountInfo.contentData data12 = new AccountInfo.contentData("会议名称", "中华人民共和国国民经济和社会发展第十四个五年规划和2035年远景目标纲要");
        contents17.add(data12);
        AccountInfo.contentData data16 = new AccountInfo.contentData("", "当前会议已取消，非常抱歉给您带来不便！",9);
        contents17.add(data16);

        AccountInfo accountInfo20 = new AccountInfo(5, "会议调整提醒", "「苏嘉怡」调整了会议内容，请查看最新的会议信息", contents17);
        list.add(accountInfo20);

        List<AccountInfo.contentData> contents18 = new ArrayList<>();
        AccountInfo.contentData data9 = new AccountInfo.contentData("会议名称", "中华人民共和国国民经济和社会发展第十四个五年规划和2035年远景目标纲要");
        contents18.add(data9);
        AccountInfo accountInfo21 = new AccountInfo(5, "会议取消通知", "", contents17);
        list.add(accountInfo21);

        List<AccountInfo.contentData> contents16 = new ArrayList<>();
        AccountInfo.contentData data33 = new AccountInfo.contentData("紧急程度", "特急",1);
        contents16.add(data33);
        AccountInfo.contentData data34 = new AccountInfo.contentData("公文标题", "中华人民共和国国民经济和社会发展第十四个五年规划和2035年远景目标纲要");
        contents16.add(data34);
        AccountInfo accountInfo18 = new AccountInfo(6, false, "待办提醒", "", contents16);
        list.add(accountInfo18);

        AccountInfo accountInfo19 = new AccountInfo(6, true, "待办提醒", "", contents16);
        list.add(accountInfo19);

        return list;
    }

    public class ArrAdapter extends RecyclerView.Adapter<ArrAdapter.viewHolder> {
        List<AccountInfo> list2;
        private Context mContext;

        //        有一个构造函数，这个方法用于把要展示的数据源传进来，并赋值给一个全局变量arrs
        public ArrAdapter(Context context, List<AccountInfo> arrr) {
            super();
            this.mContext = context;
            list2 = arrr;
        }

        class viewHolder extends RecyclerView.ViewHolder {
            private TextView titleTV, titleLine,titleLine2, descTV, txtView;
            private LinearLayout title, desc, content,linear;
            private RecyclerView contentRecycler;
            private ImageView imageView;

            public viewHolder(View view) {
                super(view);
                title = view.findViewById(R.id.title);
                desc = view.findViewById(R.id.desc);
                content = view.findViewById(R.id.content);
                titleTV = view.findViewById(R.id.title_txt);
                titleLine = view.findViewById(R.id.title_line);
                titleLine2 = view.findViewById(R.id.title_line2);
                imageView = view.findViewById(R.id.head);
                descTV = view.findViewById(R.id.desc_txt);
                contentRecycler = view.findViewById(R.id.content_recyclerview);
                txtView = view.findViewById(R.id.txt_view);
            }


            @SuppressLint("UseCompatLoadingForDrawables")
            public void setData(AccountInfo info) {
                titleTV.setText(info.getTitle());
                if (TextUtils.isEmpty(info.getDesc())) {
                    desc.setVisibility(View.GONE);
                } else {
                    desc.setVisibility(View.VISIBLE);
                    descTV.setText(info.getDesc());
                }
                txtView.setText(info.getTxt_view());

                if (info.getMESS_1() == 1) {
                    isChange(info);
                    isChange2(info);
                    imageView.setImageDrawable(getDrawable(R.drawable.mess));
                } else if (info.getMESS_1() == 2) {
                    isChange(info);
                    isChange3(info);
                    imageView.setImageDrawable(getDrawable(R.drawable.add1));
                } else if (info.isPan() == 3) {
                    isChange4(info);
                    isChange3(info);

                    imageView.setImageDrawable(getDrawable(R.drawable.time));
                } else if (info.isPan() == 4) {
                    isChange5(info);
                    isChange2(info);
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.tonghzi));
                } else if (info.isPan() == 5) {
                    isChange(info);
                    isChange2(info);
                    imageView.setImageDrawable(getDrawable(R.drawable.huiyi));
                }
                else if (info.isPan() == 6) {
                    isChange5(info);
                    isChange3(info);
                    imageView.setImageDrawable(getDrawable(R.drawable.chuiban));
                }

                if (info.getData() != null && !info.getData().isEmpty()) {
                    content.setVisibility(View.VISIBLE);
                    LinearLayoutManager layoutManager = new LinearLayoutManager(mContext);
                    contentRecycler.setLayoutManager(layoutManager);
                    Adapter2 adapter2 = new Adapter2(info.getData());
                    contentRecycler.setAdapter(adapter2);
                } else {
                    content.setVisibility(View.GONE);
                }

            }

//            通知公告
            public void isChange5(AccountInfo info) {
                if (info.isState()) {
                    titleTV.setBackgroundColor(mContext.getResources().getColor(R.color.notice));
                    titleTV.setTextColor(Color.parseColor("#FF7D00"));
                    titleLine.setVisibility(View.GONE);
                } else {
                    titleTV.setBackgroundColor(Color.WHITE);
                    titleTV.setTextColor(Color.BLACK);
                    titleLine.setVisibility(View.VISIBLE);
                }
            }

//            任务逾期
            public void isChange4(AccountInfo info) {
                if (info.isState()) {
                    titleTV.setBackgroundColor(mContext.getColor(R.color.pink));
                    titleTV.setTextColor(Color.parseColor("#F53F3F"));
                    titleLine.setVisibility(View.GONE);
                } else {
                    titleTV.setBackgroundColor(Color.WHITE);
                    titleTV.setTextColor(Color.BLACK);
                    titleLine.setVisibility(View.VISIBLE);
                }
            }

//办理
            public void isChange3(AccountInfo info) {
                if (info.isState()) {
                    txtView.setText("办理");
                    txtView.setBackgroundColor(mContext.getColor(R.color.brand1));
                    txtView.setTextColor(Color.parseColor("#0057FF"));
                    titleLine2.setVisibility(View.GONE);
                } else {
                    txtView.setBackgroundColor(Color.parseColor("#F7F8FA"));
                    txtView.setTextColor(Color.parseColor("#86909C"));
                    txtView.setText("已办理");
                    titleLine2.setVisibility(View.GONE);
                }
            }

//          蓝色标题
            public void isChange(AccountInfo info) {
                if (info.isState()) {
                    titleTV.setBackgroundColor(mContext.getColor(R.color.brand1));
                    titleTV.setTextColor(Color.parseColor("#0057FF"));
                    titleLine.setVisibility(View.GONE);

                } else {
                    titleTV.setBackgroundColor(Color.WHITE);
                    titleTV.setTextColor(Color.BLACK);
                    titleLine.setVisibility(View.VISIBLE);
                }
            }

//          查看详情
            public void isChange2(AccountInfo info) {
                if (info.isState()) {
                    txtView.setText("查看详情");
                    txtView.setBackgroundColor(mContext.getColor(R.color.brand1));
                    txtView.setTextColor(Color.parseColor("#0057FF"));
                } else {
                    txtView.setText("查看详情");
                    txtView.setBackgroundColor(mContext.getResources().getColor(R.color.brand1));
                    txtView.setTextColor(Color.parseColor("#0057FF"));
                }
            }
        }

//        由于AccountAdapter继承RecyclerView.Adapter的，那么就必须重写onCreateViewHolder()、onBindViewHolder()、getItemCount()这三个方法
        @NonNull
        @Override
//        onCreateViewHolder用来创建ViewHolder实例，我们在这个方法中将arrs布局加载ViewHolder()方法的实例返回。
        public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_left, parent, false);
            return new viewHolder(view);
        }

        @Override
//        用于RecyclerView子项的数据进行赋值的，会在每个子项呗滚动到屏幕内的时候执行，通过position参数得到当前项的数据实例
        public void onBindViewHolder(@NonNull viewHolder holder, int position) {
            holder.setData(list2.get(position));
        }

//        告诉RecyclerView一个有多少子项
        @Override
        public int getItemCount() {
//        直接返回数据源的长度
            return list2.size();
        }
    }

    public class Adapter2 extends RecyclerView.Adapter<Adapter2.Holder> {

        private Context mContext;
        private List<AccountInfo.contentData> list;

        public Adapter2(List<AccountInfo.contentData> list) {
            this.list = list;
        }

        @NonNull
        @Override
        public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.quick_left, parent, false);
            return new Holder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull Holder holder, int position) {
            holder.setData(list.get(position));
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class Holder extends RecyclerView.ViewHolder {
            private TextView title, desc;

            public Holder(@NonNull View view) {
                super(view);
                title = view.findViewById(R.id.title);
                desc = view.findViewById(R.id.desc);
            }

            public void setData(AccountInfo.contentData data) {
                title.setText(data.getKey());
                desc.setText(data.getValue());
                if (data.isBan()==1){
                    desc.setBackgroundColor(getColor(R.color.pink));
                    desc.setTextColor(Color.parseColor("#F53F3F"));
                }else if (data.isBan()==9){
title.setWidth(209);
title.setHeight(1);
                }
            }
        }
    }

}

