package com.liushaoxin.interview.javaje;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by lsx on 2018/8/21.
 */
public class Start {
    /**
     * String转方法date (年-月-日 时:分:秒)
     * @param date
     * @return
     */
    public static Date StirngForDate(String date){
        Date d = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            d = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d;
    }

    /**
     * 得到几分钟后的时间
     * @param d
     * @param minutes
     * @return
     */
    public static String getMinutesLater(Date d,int minutes){
        Calendar can = Calendar.getInstance();
        can.setTime(d);
        can.add(Calendar.MINUTE, +minutes);
        return DateForString(can.getTime());
    }

    /**
     * date转String方法 （年-月-日  时分秒）
     * @param date
     * @return
     */
    public static String DateForString(Date date){
        Format format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }

    public static void main(String[] args) {
        // 当前日期
        Date currentDate = new Date();
        // 每页的行数
        int linesPerPage = 0;

        //////////////////// 定义以下变量 ////////////////////

        // 学生数量（某个学校的）
        int studentCount = 0;// 个
        // 老师数量
        int teacherCount = 0;// 位
        // 运行速度（火车的）
        double speedTrain = 0.00;// KM/H
        // 人均收入（一个国家的）
        double incomePerCapita = 0.00;// RMB/country
        // 创建时间（一个系统的新增用户）
        Date createTime = null;
        // 失效时间（用户登录的凭证）
        Date dueTime = null;
        // 身高（厘米）
        int heightCm = 0;
        // 身高（英寸）
        int heightInch = 0;
        // 期望薪资
        double salaryExpect = 0.00;//RMB
        // 类别（音乐/艺术领域的）
        String type = "";
        // 流行度（一个事物的流行程度指数，用1-1000的整数表示）
        int popularity = 0;
        // 持续时长（音乐/电影的）
        int continuedTime = 0;//秒
        // 缩略图网址
        String thumbnailUrl = "";
        // 开门时间（饭店/酒店的）
        Date openTime =null;
        // 打烊时间（同上）
        Date closingTime =null;
        // 停车位（同上）
        int parkingSpot = 0;
        // 是否有WI-FI（同上）
        boolean hasWifi = false;
        // 房间的数量（一套房子的，包括卧室卫生间厨房等）
        int roomsPerHouse = 0;
        // 装修风格（用户喜欢的装修风格，例如：简欧、新中式）
        String decorationStyle = "";
        // 金、木、水、火、土（指命理计算一个人的五行得分1-100，定义5个变量）
        int gold = 0;//金
        int wood = 0;//木
        int water = 0;//水
        int fire = 0;//火
        int earth = 0;//土


        //////////////////// 实现以下代码片段 ////////////////////

        /**
         * 生成时间，北京当前时间的上个月最后一天，输出格式为：2018-01-01 20:00:00
         * 不能依赖系统环境。
         * 如本地时间为 东京时间 2017-07-01 00:12:34，那么需输出为 2017-05-31 23:12:34
         */
        //获得当前时间的上个月最后一天
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar= Calendar.getInstance();
        int month=calendar.get(Calendar.MONTH);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

        //获得东八区时间
        TimeZone timeZone = TimeZone.getTimeZone("GMT+8:00");
        sf.setTimeZone(timeZone);
        System.out.println("北京当前时间的上个月最后一天："+sf.format(calendar.getTime()));



        /**
         * 将给定的字符类型的北京时间（如 2018-03-01 18:00:30），转换为新奥尔良（美国）时间，输出字符串格式：2018-03-01 04:00:30
         * 需考虑夏令时的问题 https://www.timeanddate.com/time/change/usa/new-orleans
         * 例1: 2018-03-01 18:00:30 => 2018-03-01 04:00:30
         * 例2: 2018-06-01 18:00:30 => 2018-06-01 05:00:30
         */
        //获得西六区时间
        TimeZone timeZone2 = TimeZone.getTimeZone("GMT-6:00");
        sf.setTimeZone(timeZone2);

        //给定的北京时间
        String givenTime = "2018-06-01 18:00:30";

        //算出2018年新奥尔良（美国）时间的-夏令时-对应的北京时间
        String newOrleansDaylightSavingTimeStart2018 ="2018-03-11 02:00:00";
        String BeijingDaylightSavingTimeStart2018 = sf.format(StirngForDate(newOrleansDaylightSavingTimeStart2018));
        String newOrleansDaylightSavingTimeEnd2018 ="2018-11-04 02:00:00";
        String BeijingDaylightSavingTimeEnd2018 = sf.format(StirngForDate(newOrleansDaylightSavingTimeEnd2018));
        //System.out.println("2018年新奥尔良夏令时开始对应的北京时间："+BeijingDaylightSavingTimeStart2018+",2018年新奥尔良夏令时结束对应的北京时间"+BeijingDaylightSavingTimeEnd2018);

        //算出2019年新奥尔良（美国）时间的-夏令时-对应的北京时间
        String newOrleansDaylightSavingTimeStart2019 ="2019-03-10 02:00:00";
        String BeijingDaylightSavingTimeStart2019 = sf.format(StirngForDate(newOrleansDaylightSavingTimeStart2019));
        String newOrleansDaylightSavingTimeEnd2019 ="2019-11-03 02:00:00";
        String BeijingDaylightSavingTimeEnd2019 = sf.format(StirngForDate(newOrleansDaylightSavingTimeEnd2019));

        //算出2020年新奥尔良（美国）时间的-夏令时-对应的北京时间
        String newOrleansDaylightSavingTimeStart2020 ="2020-03-08 02:00:00";
        String BeijingDaylightSavingTimeStart2020 = sf.format(StirngForDate(newOrleansDaylightSavingTimeStart2020));
        String newOrleansDaylightSavingTimeEnd2020 ="2020-11-01 02:00:00";
        String BeijingDaylightSavingTimeEnd2020 = sf.format(StirngForDate(newOrleansDaylightSavingTimeEnd2020));

        //算出2021年新奥尔良（美国）时间的-夏令时-对应的北京时间
        String newOrleansDaylightSavingTimeStart2021 ="2021-03-14 02:00:00";
        String BeijingDaylightSavingTimeStart2021 = sf.format(StirngForDate(newOrleansDaylightSavingTimeStart2021));
        String newOrleansDaylightSavingTimeEnd2021 ="2021-11-07 02:00:00";
        String BeijingDaylightSavingTimeEnd2021 = sf.format(StirngForDate(newOrleansDaylightSavingTimeEnd2021));

        //比较给定的北京时间是否在一年中两个夏令时的中间，是则提前一个小时，否则均为正常时间
        //System.out.println("newOrleansDaylightSavingTimeStart2018 compare to newOrleansDaylightSavingTimeEnd2018:"+newOrleansDaylightSavingTimeStart2018.compareTo(newOrleansDaylightSavingTimeStart2018));//-1
        if((givenTime.compareTo(BeijingDaylightSavingTimeStart2018)>0 && givenTime.compareTo(BeijingDaylightSavingTimeEnd2018)<0)
                ||(givenTime.compareTo(BeijingDaylightSavingTimeStart2019)>0 && givenTime.compareTo(BeijingDaylightSavingTimeEnd2019)<0)
                ||(givenTime.compareTo(BeijingDaylightSavingTimeStart2020)>0 && givenTime.compareTo(BeijingDaylightSavingTimeEnd2020)<0)
                ||(givenTime.compareTo(BeijingDaylightSavingTimeStart2021)>0 && givenTime.compareTo(BeijingDaylightSavingTimeEnd2021)<0)){
            //提前一个小时
            givenTime = getMinutesLater(StirngForDate(givenTime),60);

        }


        System.out.println("北京时间"+givenTime+"对应的新奥尔良（美国）时间："+sf.format(StirngForDate(givenTime)));

    }

}
