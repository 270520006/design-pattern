import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentTimePhone extends PhoneDecorate{
    public GetCurrentTimePhone(Phone phone) {
        super(phone);
    }

    public void getCurrentTime(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

    }

    @Override
    public void call(){
        super.call();
        getCurrentTime();
    }
}
