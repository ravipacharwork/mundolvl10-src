package top.bienvenido.date_24323;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.graphics.drawable.Icon;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: top.bienvenido.date_24323.洗浴中心有你妈服务百姓千万家, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/洗浴中心有你妈服务百姓千万家.class */
public abstract class AbstractC0064 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final p2 f492 = new p2("mId");

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final p2 f493 = new p2("mType");

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final p2 f494 = new p2("mObj1");

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static final p2 f495 = new p2("mString1");

    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public static final p2 f496xaa30c2c7 = new p2("mInt1");

    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public static final p2 f497 = new p2("mChannelId");

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m668(Notification notification, String str) {
        try {
            if (AbstractC0065x6082d607.f502xaa30c2c7) {
                String channelId = notification.getChannelId();
                f497.f270.mo394(notification, (channelId == null || channelId.length() == 0) ? AbstractC0020.m616(str, "default_channel") : AbstractC0020.m616(str, channelId));
            }
            if (f4.f96) {
                if (AbstractC0065x6082d607.f499) {
                    Icon smallIcon = notification.getSmallIcon();
                    if (smallIcon != null) {
                        m669(smallIcon);
                    }
                    Icon largeIcon = notification.getLargeIcon();
                    if (largeIcon != null) {
                        m669(largeIcon);
                    }
                }
                notification.tickerView = null;
                notification.contentView = null;
                notification.bigContentView = null;
                notification.headsUpContentView = null;
            }
            notification.icon = R.mipmap.sym_def_app_icon;
            notification.flags &= -3;
            if (notification.sound != null) {
                notification.sound = Settings.System.DEFAULT_NOTIFICATION_URI;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m666(NotificationChannel notificationChannel, String str) {
        try {
            if (StringsKt.startsWith$default(notificationChannel.getId(), AbstractC0020.m615(str), false, 2, (Object) null)) {
                p2 p2Var = f492;
                String id = notificationChannel.getId();
                String strSubstring = id;
                try {
                    String strM615 = AbstractC0020.m615(str);
                    if (StringsKt.startsWith$default(id, strM615, false, 2, (Object) null)) {
                        strSubstring = strSubstring.substring(strM615.length());
                    }
                } catch (Exception unused) {
                }
                p2Var.f270.mo394(notificationChannel, strSubstring);
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m667(List list, String str) {
        new ArrayList();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m666((NotificationChannel) it.next(), str);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m669(Object obj) {
        try {
            f493.f270.mo394(obj, (Object) 2);
            p2 p2Var = f494;
            p2Var.f270.mo394(obj, b3.f17.getResources());
            p2 p2Var2 = f495;
            p2Var2.f270.mo394(obj, b3.f18);
            p2 p2Var3 = f496xaa30c2c7;
            p2Var3.f270.mo394(obj, Integer.valueOf(R.mipmap.sym_def_app_icon));
        } catch (Exception unused) {
        }
    }
}
