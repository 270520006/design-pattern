package decorator_pattern;

import java.text.SimpleDateFormat;
import java.util.Date;

public class getCurrentTime extends PhoneDecorator{
    public getCurrentTime(Phone phone) {
        super(phone);
    }
    public void CurrentTime(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
    }
    @Override
    public void call(){

        super.call();
        CurrentTime();
    }
}
